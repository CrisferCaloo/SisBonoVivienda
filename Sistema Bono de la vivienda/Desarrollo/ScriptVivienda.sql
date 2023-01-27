create table Usuario(
	idUsuario int primary key auto_increment,
	Cedula char(10) not null unique,
	Nombre varchar(15) not null,
	Apellido varchar(15) not null,
	Email varchar(30),
	Telefono varchar(10),
	Acceso varchar(15) not null,
	Usuario varchar(15) not null,
	Clave varchar(15) not null,
	unique(Nombre, Apellido)
);

create table Bono(
	idBono int primary key auto_increment,
	idUsuario int not null,
	Edad int not null,
	Est_Laboral char(2) not null,
	Tiene_Vivienda char(2) not null,
	Ingresos decimal(8,2) not null,
	Egresos decimal(8,2) not null,
	Estado varchar(10) not null,
	fecha timestamp default current_timestamp,
	foreign key (idUsuario) references Usuario(idUsuario) on delete cascade
);

------------------------------------------------------------------------------------------------------------------------------
insert into usuario (Cedula,Nombre,Apellido,Email,Telefono,Acceso,Usuario,Clave) values (10203040,"Cristopher","Calo","calito@gmail.com","3068314","Administrador","admin","admin");
insert into usuario (Cedula,Nombre,Apellido,Email,Telefono,Acceso,Usuario,Clave) values (20203040,"Paulina","Fernandez","paulina@gmail.com","4922375","Cliente","cliente1","123");

insert into usuario (Cedula,Nombre,Apellido,Email,Telefono,Acceso,Usuario,Clave) values (40203040,"Alejandra","Martinez","alejandra@gmail.com","3188621","Cliente","cliente3","123");

insert into Bono (idUsuario,Edad,Est_Laboral,Tiene_Vivienda,Ingresos,Egresos,Estado) values (1,25,"Si","Si",400.25,300.30,"Aprobado");
insert into Bono (idUsuario,Edad,Est_Laboral,Tiene_Vivienda,Ingresos,Egresos,Estado) values (2,27,"Si","Si",300,50,"Aprobado");
insert into Bono (idUsuario,Edad,Est_Laboral,Tiene_Vivienda,Ingresos,Egresos,Estado) values (3,22,"Si","Si",200,150,"Rechazado");

------------------------------------------------------------------------------------------------------------------------------
select * from usuario
select * from bono 

--------------------------------------------------------------------------------------------------------------------------------

-- 1) Mostrar la lista de clientes que son beneficiarios del bono  
select concat(u.Nombre,' ',u.Apellido) as Cliente, b.Estado from bono b inner join usuario u on b.idUsuario = u.idUsuario where b.Estado = "Aprobado"



-- 2) Crear un objeto Programable que permita mostrar la cantidad en bonos aprobados y rechazados en una fecha que se le envia como parametro
delimiter $$
create procedure CantidadBono(in _fecha timestamp)
begin 
	select count(*), Estado, fecha from bono where fecha = _fecha group by Estado;
end $$


call CantidadBono('2021-02-04 23:20:15'); 