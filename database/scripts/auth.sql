create table auth
(
	id int auto_increment
		primary key,
	role_id int not null,
	menu_id int not null,
	permission int(1) default 1 not null,
	active_flag int(1) default 1 not null,
	create_date timestamp default CURRENT_TIMESTAMP not null,
	update_date timestamp default CURRENT_TIMESTAMP not null,
	constraint auth_menu_id_fk
		foreign key (menu_id) references menu (id)
			on update cascade,
	constraint auth_role_id_fk
		foreign key (role_id) references role (id)
			on update cascade
);

