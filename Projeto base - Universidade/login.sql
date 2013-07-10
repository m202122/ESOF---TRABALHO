set search_path to universidade;

drop table if exists login;

create table login(
   usuario varchar(100),
   senha varchar(100),
   ocupacao varchar(100),
   primary key( usuario)
);

insert into login values ('1','1','professor');
insert into login values ('2','2','secretario');