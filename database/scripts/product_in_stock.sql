create table product_in_stock
(
	id int auto_increment
		primary key,
	product_id int not null,
	qty int not null,
	active_flag int(1) default 1 not null,
	create_date timestamp default CURRENT_TIMESTAMP not null,
	update_date timestamp default CURRENT_TIMESTAMP not null,
	constraint product_in_stock_product_info_id_fk
		foreign key (product_id) references product_info (id)
			on update cascade
);

