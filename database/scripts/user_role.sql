create table user_role
(
	id int auto_increment
		primary key,
	user_id int not null,
	role_id int not null,
	active_flag int(1) default 1 not null,
	create_date timestamp default CURRENT_TIMESTAMP not null,
	update_date timestamp default CURRENT_TIMESTAMP not null,
	constraint user_role_role_id_fk
		foreign key (role_id) references role (id)
			on update cascade,
	constraint user_role_users_id_fk
		foreign key (user_id) references users (id)
			on update cascade
);

