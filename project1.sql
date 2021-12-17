
--drop table admin;
----user detail
create sequence sequ
start with 1
increment by 1
minvalue 1;

create table user_details(
first_name varchar2(30) not null ,
cpassword varchar2(30) not null ,
Email varchar2(30)not null unique ,phone number unique);
alter table user_details add user_id int default sequ.nextval;
alter table user_details add usertype varchar2(30) default 'user';
alter table user_details add constraint primes primary key(user_id);


desc user_details;
desc customer_detail;

--customer table
create table customer_detail(customer_id varchar2(30) primary key,user_id number(30) not null,customer_name varchar2(30)not null,
city varchar2(30)not null,expecteddate date,
address varchar2(30) not null);
alter table customer_detail add constraint foreign1 foreign key(user_id) references user_details(user_id);
drop table customer_detail;
--product detail
create table Car_details( car_id varchar2(30) not null primary key,
car_name varchar2(30) not null,fueltype varchar2(30) not null,cartype varchar2(30),car_model varchar2(30));

create table price_detail(price_amount varchar2(30) not null,
product_id varchar2(30) not null,
product_name varchar2(30)not null,
Exshowroom_price varchar2(100) not null,onroad_price number not null,
road_tax varchar2(100)not null,
insurance number not null);
alter table price_detail add constraint foreign2 foreign key(product_id) references car_details(car_id);



select * from user_details;
insert into user_details (first_name,cpassword,email,phone,usertype)values('mariraja','mari@30091','mari@gmail.com',6381830625,'admin');

insert into product_details values('Bmw1','BMW X1 Series','BMw is more expensive','petrol','pusback');
