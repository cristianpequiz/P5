"BuscadorDeDatos" aplicación web desarrollada con SpringBoot,en Net
Beans, que tiene la funcion de buscar individuos mediante el nombre,
el apellido,fecha de nacimiento, etc; La aplicación
utiliza HTML para la interfaz de usuario y se conecta a una
base de datos relacional mediante JPA (MySQL). Al agregar
un individuo, la Fecha Nacimiento esta de tipo String en la 
interfaz, para agregar la fecha usa el siguiente formato yyyy-mm-dd


Base de datos:

tabla individuo
atributos

id_individuo INT NOT NULL PRIMARY KEY AUTO_INCREMENT

nombre VARCHAR<50> NOT NULL

apellido VARCHAR<50> NOT NULL

telefono VARCHAR<50> NOT NULL

correo VARCHAR<50> NOT NULL

fecha_nac DATE NOT NULL

edad INT NOT NULL

genero VARCHAR<10> NOT NULL