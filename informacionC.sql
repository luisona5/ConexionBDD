create database informacion_POO;
use informacion_POO;
CREATE TABLE personas (
  id int AUTO_INCREMENT PRIMARY KEY,
  identificacion varchar(10) NOT NULL UNIQUE, 
  nombres varchar(50) NOT NULL,
  apellidos varchar(50) NOT NULL, -- renombrar
  telefono varchar(10) NOT NULL,
  correo varchar(50) NOT NULL,
  direccion varchar(100) NOT NULL
) ;
INSERT INTO personas (identificacion, nombres, apellidos, telefono, correo, direccion) VALUES
('0477889900', 'Luis', 'Oña', '0912345678', 'lorenag@hotmail.com', 'Av. Quitumbe'),
('1234567890', 'Gabriel', 'García Marquez', '0987654321', 'gabriel.garcia@gmail.com', 'Aracataca'),
('1887654321', 'Juan', 'León Mera', '0987123456', 'juan.mera@yahoo.com', 'Ambato'),
('1822334455', 'Juan', 'Montalvo', '0978901234', 'juan.montalvo@gmail.com', 'Ambato'),
('0566778899', 'María', 'López', '0998765432', 'm.lopez@hotmail.com', 'Av. América');

SELECT*FROM personas;