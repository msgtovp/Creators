create database AddressBook;

use AddressBook;

create table contact_info(identity int primary key auto_increment, firstName varchar(256) not null, lastName varchar(128) default '', phoneNumber varchar(20) default '', mobileNumber varchar(20) not null, emailIdentity varchar(256) default '', website varchar(256) default '', profilePicture mediumblob default '');
