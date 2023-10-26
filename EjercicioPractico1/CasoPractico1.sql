-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS ejerciciopractico_1;
USE ejerciciopractico_1;

CREATE USER 'usuario_examen'@'%' IDENTIFIED BY 'la_contra';

GRANT ALL PRIVILEGES ON ejerciciopractico_1.* TO 'usuario_examen'@'%';
FLUSH PRIVILEGES;

-- Crear la tabla estudiantes
CREATE TABLE IF NOT EXISTS estudiantes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    identificacion VARCHAR(10),
    nivel_cursando VARCHAR(50),
    edad INT,
    altura DECIMAL(5, 2),
    peso DECIMAL(5, 2),
    activo BOOL,
    genero VARCHAR(10)
);

-- Insertar registros en la tabla estudiantes
INSERT INTO estudiantes (nombre, identificacion, nivel_cursando, edad, altura, peso, activo, genero)
VALUES
    ('Juan', '1234567890', 'Noveno grado', 15, 1.65, 60.0,true, 'Masculino'),
    ('Maria', '0987654321', 'Once grado', 17, 1.70, 55.5,true, 'Femenino'),
    ('Pedro', '5678901234', 'Octavo grado', 14, 1.55, 50.2,true, 'Masculino'),
    ('Ana', '4321098765', 'Once grado', 18, 1.68, 58.8,true, 'Femenino'),
    ('Carlos', '9012345678', 'Noveno grado', 15, 1.72, 65.0,true, 'Masculino'),
    ('Laura', '3456789012', 'Octavo grado', 14, 1.60, 48.5,true, 'Femenino'),
    ('Luis', '6789012345', 'Noveno grado', 15, 1.75, 63.7,true, 'Masculino'),
    ('Sofia', '2109876543', 'Once grado', 17, 1.63, 54.3,true, 'Femenino'),
    ('Daniel', '4567890123', 'Octavo grado', 14, 1.70, 60.1,true, 'Masculino'),
    ('Carolina', '7890123456', 'Once grado', 16, 1.65, 52.9,true, 'Femenino'),
    ('Alejandro', '5432109876', 'Noveno grado', 15, 1.80, 70.2,true, 'Masculino'),
    ('Valeria', '8765432109', 'Octavo grado', 14, 1.58, 47.3,true, 'Femenino'),
    ('Gabriel', '1098765432', 'Once grado', 16, 1.72, 61.8,true, 'Masculino'),
    ('Camila', '4321567890', 'Noveno grado', 15, 1.63, 56.4,true, 'Femenino'),
    ('Andrés', '6789012345', 'Octavo grado', 14, 1.70, 63.2,true,  'Masculino');
