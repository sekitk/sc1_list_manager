# --- First database schema

# --- !Ups

create table company (
  id                        bigint not null AUTO_INCREMENT,
  name                      varchar(255),
  constraint pk_company primary key (id))
;

create table computer (
  id                        bigint not null,
  name                      varchar(255),
  introduced                timestamp,
  discontinued              timestamp,
  company_id                bigint,
  constraint pk_computer primary key (id))
;

create table reference (
  id                        bigint not null AUTO_INCREMENT,
    title                      varchar(255),
      link               varchar(255), 
        note              varchar(255),
	    constraint pk_reference primary key (id))
	    ;
	    
create table user (id bigint not null AUTO_INCREMENT,email varchar(255), password varchar(255), constraint pk_user primary key (id));


alter table computer add constraint fk_computer_company_1 foreign key (company_id) references company (id) on delete restrict on update restrict;
create index ix_computer_company_1 on computer (company_id);
insert into user (email,password) values('mail@example.com','password');

# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists company;

drop table if exists computer;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists company_seq;

drop sequence if exists computer_seq;

