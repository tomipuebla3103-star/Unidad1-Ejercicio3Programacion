<img width="835" height="117" alt="WhatsApp Image 2026-09-03 at 12 03 48" src="https://github.com/user-attachments/assets/1c527551-d37b-402a-97bf-e970438ce7a7" />
 Sistema de Calificaciones de Estudiantes

 Descripción

El programa utiliza una clase llamada `EstudianteUniversitario` para guardar la información de un estudiante y su calificación final.

También permite comprobar si el estudiante aprobó la materia según su calificación.

 Objetivo

El objetivo del ejercicio es practicar algunos conceptos de Programación Orientada a Objetos (POO), como:

 Clases y objetos.
 Atributos.
 Constructores.
 Getters y setters.
 Encapsulamiento.
 Validación de datos.
 Métodos booleanos.

 Clase EstudianteUniversitario

La clase `EstudianteUniversitario` tiene los siguientes atributos:

 `legajo`: número o identificación del estudiante.
 `nombreCompleto`: nombre completo del estudiante.
 `calificacionFinal`: nota final de la materia.

 Constructor

El constructor recibe los datos necesarios para crear un estudiante.

También se controla que la calificación esté entre `0` y `10`.

 Métodos

 Getters y setters

Los getters permiten obtener los datos del estudiante.

Los setters permiten modificar los datos, realizando las validaciones correspondientes.

La `calificacionFinal` debe estar siempre entre `0` y `10`.

 `estaAprobado()`

Comprueba si el estudiante aprobó la materia.

El método devuelve `true` cuando la calificación es mayor o igual a `6.0`.

Si la calificación es menor a `6.0`, devuelve `false`.

 Ejemplo

En el `main` se crean dos estudiantes diferentes, cada uno con su nombre, legajo y calificación.

Después se utiliza el método `estaAprobado()` para comprobar si cada estudiante aprobó la materia y se muestra el resultado por consola.

