create database exagracia

create table usuario(
	idUsuario int primary key ,
	cedula char(10) ,
	nombre varchar(15) ,
	apellido varchar(15) ,
	email varchar(30),
	telefono varchar(10),
	acceso varchar(15) ,
	usuario varchar(15) ,
	clave varchar(15) ,
);

create table bono(
	idBono int primary key ,
	idUsuario int references usuario (idUsuario),
	edad int ,
	est_laboral char(2) ,
	tiene_vivienda char(2) ,
	ingresos float ,
	egresos float ,
	estado varchar(10) ,
	fecha date,
	
);

insert into usuario  values (1,'10203040','Cristopher','Calo','calito@gmail.com','3068314','Administrador','admin','admin');
insert into usuario  values (2,'10203050','Paulina','Fernandez','paulina@gmail.com','3068085','Cliente','cliente1','123');
insert into usuario  values (3,'10203060','Juan','Perez','perez@gmail.com','3068023','Cliente','cliente2','1234');
insert into usuario  values (4,'10203060','Alan','brito','brito@gmail.com','3068013','Cliente','cliente2','1235');
insert into usuario  values (5,'10203080','rita','laso','laso@gmail.com','3068017','Cliente','cliente2','1236');


insert into bono values (1,1,27,'Si','Si',300,50,'Aprobado','2020-02-06');
insert into bono values (2,2,27,'Si','Si',400,200,'Aprobado','2020-02-05');
insert into bono values (3,3,22,'Si','No',400,200,'Rechazado','2020-02-04');
insert into bono values (4,4,28,'Si','Si',700,200,'Aprobado','2020-02-04');
insert into bono values (5,5,30,'Si','Si',875,100,'Aprobado','2020-02-04');

select * from usuario
select * from bono

-- DEMANDAS REMEDIAL
-- 1) Mostrar la lista de las personas interesadas cuyos ingresos sean mayores al salario básico


select nombre, apellido, ingresos from usuario u, bono b where u.idUsuario=b.idUsuario and ingresos>400

-- 2) Crear un objeto programable que permita mostrar la cantidad de personas interesadas cuyo salario supera el valor enviado como parámetro.

create procedure salari
@salario int
as
select nombre,apellido,ingresos from usuario u, bono b where u.idUsuario=b.idUsuario and ingresos>@salario

exec salari '100';

-----------------------
--auditoria

audit session;

select *from dba_audit_trail order by USER_NAME;