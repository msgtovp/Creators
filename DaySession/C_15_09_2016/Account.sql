use Account;

create table user_tbl(username varchar(256), password varchar(256), firstName varchar(256), lastName varchar(256), primary key(username));

insert into user_tbl values('msgtovp','vijay','Vijayaprakash','Periyasamy'), ('dust','test','Sample','User');

select * from user_tbl;

