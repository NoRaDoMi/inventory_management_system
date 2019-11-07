create table invoice
(
	id int auto_increment
		primary key,
	code varchar(50) not null,
	type int(1) not null,
	product_id int not null,
	qty int not null,
	price decimal(15,2) not null,
	active_flag int(1) default 1 not null,
	create_date timestamp default CURRENT_TIMESTAMP not null,
	update_date timestamp default CURRENT_TIMESTAMP not null,
	constraint invoice_product_info_id_fk
		foreign key (product_id) references product_info (id)
			on update cascade
);

