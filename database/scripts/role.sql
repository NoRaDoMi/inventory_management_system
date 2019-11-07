create table role
(
	id int auto_increment
		primary key,
	role_name varchar(50) not null,
	description varchar(100) not null,
	active_flag int(1) default 1 not null,
	create_date timestamp default CURRENT_TIMESTAMP not null,
	update_date timestamp default CURRENT_TIMESTAMP not null
);

