create table product_info
(
	id int auto_increment
		primary key,
	cate_id int not null,
	name varchar(100) not null,
	code varchar(50) not null,
	description text null,
	img varchar(200) not null,
	active_flag int(1) default 1 not null,
	create_date timestamp default CURRENT_TIMESTAMP not null,
	update_date timestamp default CURRENT_TIMESTAMP not null,
	constraint product_info_category_id_fk
		foreign key (cate_id) references category (id)
			on update cascade
);

