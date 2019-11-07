create table users
(
	id int auto_increment
		primary key,
	user_name varchar(50) not null,
	password varchar(100) not null,
	email varchar(100) null,
	name varchar(100) not null,
	active_flad int(1) default 1 not null,
	create_date timestamp default CURRENT_TIMESTAMP not null,
	update_date timestamp default CURRENT_TIMESTAMP not null
);

