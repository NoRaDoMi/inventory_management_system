create table menu
(
	id int auto_increment
		primary key,
	parent_id int not null,
	url varchar(100) not null,
	name varchar(100) not null,
	order_index int(1) default 0 not null,
	active_flag int(1) default 1 not null,
	create_date timestamp default CURRENT_TIMESTAMP not null,
	update_date timestamp default CURRENT_TIMESTAMP not null
);

