create table category
(
	id int auto_increment
		primary key,
	name varchar(100) not null,
	code varchar(50) not null,
	description text null,
	active_flag int(1) default 1 not null,
	create_date timestamp default CURRENT_TIMESTAMP not null,
	update_date timestamp default CURRENT_TIMESTAMP not null
);

