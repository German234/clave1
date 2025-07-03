CREATE DATABASE TareasDB
GO

USE TareasDB
GO

CREATE TABLE TareaSimple(
                            TareaID INT IDENTITY(1,1) PRIMARY KEY,
                            Titulo NVARCHAR(100) NOT NULL,
                            Descripcion NVARCHAR(MAX) NOT NULL,
                            FechaTarea DATE NOT NULL,
                            Estado NVARCHAR(50) NOT NULL,
                            NivelPrioridad NVARCHAR(50) NOT NULL
);
GO

INSERT INTO TareaSimple (Titulo, Descripcion, FechaTarea, Estado, NivelPrioridad) VALUES
  (N'Comprar insumos','Comprar papel y t�ner para la impresora','2025-07-01', 'Pendiente', 'Alta'),
  (N'Revisi�n informe', 'Revisar el informe trimestral de ventas', '2025-07-03', 'En progreso','Media'),
  (N'Publicar blog', 'Escribir y publicar art�culo sobre UML', '2025-06-28', 'Finalizada',  'Baja'),
  (N'Backup base datos','Hacer respaldo completo de la BD de clientes','2025-07-02', 'Pendiente', 'Alta'),
  (N'Enviar facturas', 'Enviar facturas a clientes del mes', '2025-07-05', 'En progreso', 'Media');
GO

SELECT * FROM TareaSimple;
GO