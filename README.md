# Fundamentos de Java para Principiantes

## Resumen del Curso
Este curso de 1 hora introduce a estudiantes de secundaria a los fundamentos de la programación con Java, incluyendo programación orientada a objetos. **¡No requiere descargas!** Solo abre tu navegador web.

**Duración total**: ~60 minutos  
**Público Objetivo**: Estudiantes de 12 a 17 años sin experiencia en programación
**Herramientas necesarias**: **¡Solo tu navegador web!** (Chrome, Firefox, Safari, Edge)

## Secuencia de la Lección

### Lección 1: ¿Qué es Java y la Programación?

- **Descripción**: Aprende qué es la programación, para qué se usa Java y cómo ejecutar tu primer programa para mostrar un mensaje de bienvenida en la consola.
- **Enlace**: [▶ Ver la lección](https://youtu.be/fS7AWLMwM6g?si=hxohxDOj0EWnthvv)
- **Conclusiones clave**:
  - Programar consiste en escribir instrucciones para que una computadora realice una tarea.
  - Java es un lenguaje de programación que se usa para crear aplicaciones y juegos.
  - En este ejemplo, la ejecución empieza en el método `main` y sigue las instrucciones de arriba hacia abajo.
  - `System.out.println` muestra texto en la consola y agrega un salto de línea.
- **Práctica**: [🖥 Clic para programar en OnlineGDB](https://www.onlinegdb.com/)
  - **Reto**: Selecciona Java, copia el código y cambia el saludo por uno propio. Ejecuta el programa y comprueba que tu mensaje aparece entre las dos líneas de signos de igual.

- **Código fuente** (`Main.java`):

  ```java
  public class Main {
      public static void main(String[] args) {
          System.out.println("==================================");
          System.out.println("  ¡Hola! Bienvenido a Programación ");
          System.out.println("==================================");
          System.out.println("Este es tu primer programa en Java.");
      }
  }
  ```

### Lección 2: Variables y tipos de datos (9 minutos)
- **Descripción**: Aprende a guardar información en Java usando variables.
  Conoce los cinco tipos básicos: `int`, `String`, `double`, `char` y `boolean`.
- **Enlace**: [▶ Ver la lección](https://www.youtube.com/watch?v=zOxLJ29nGB4)
- **Conclusiones clave**:
  - Una variable es una cajita con nombre que guarda un dato.
  - `int` para números enteros, `double` para decimales, `String` para texto (entre comillas dobles), `char` para un solo carácter (entre comillas simples) y `boolean` para verdadero/falso.
  - Se declara así: `int edad = 15;` o `String nombre = "Lucía";`
  - El valor de una variable puede cambiar: `puntos = 25;` (sin volver a escribir el tipo).
  - El `+` une texto con variables (concatenación).
  - Errores comunes: olvidar el `;`, escribir `string` en minúscula y empezar un nombre con número.
- **Práctica**: [🖥 Clic para programar en OnlineGDB](https://www.onlinegdb.com/)
  - Reto: crea variables con tu nombre, edad, estatura y si te gusta el fútbol, y muestra una frase que las una.

- **Código fuente**: [Ver en GitHub](https://github.com/G3-Avisum-OpenSource/java-fundamentals-course-avisum/blob/develop/starter-files/lesson-2/Variables.java)

### Lección 3: Estructuras de control: Decisiones y bucles 
- **Descripción**: Toma decisiones con if-else y repite tareas con bucles.
- - **Enlace**: [▶ Ver la lección](https://youtu.be/-M_QktjkR1c)
- **Conclusiones clave**: `if (nota >= 11) {};` `for (int i=1; i<=5; i++) {}`


### Lección 4: Métodos, Entrada/Salida e Introducción a la POO
- **Descripción**: Crea código reutilizable con métodos, obtén la entrada del usuario con `Scanner` e introduce clases y objetos.
- **Enlace**: [▶ Ver la lección](https://youtu.be/xHhq0Xlrsgo)
- **Conclusiones clave**:
  - Un método agrupa instrucciones reutilizables: `public static void saludar() {}`
  - `Scanner` permite leer datos del usuario por consola: `Scanner scanner = new Scanner(System.in);`
  - `scanner.nextLine()` lee texto y `scanner.nextInt()` lee números enteros.
  - Los métodos pueden recibir parámetros y llamarse desde `main`: `saludarUsuario(nombre, edad);`
  - Una clase define atributos y métodos: `class Estudiante { String nombre; }`
  - Errores comunes: olvidar `import java.util.Scanner;`, mezclar `nextLine()` con `nextInt()` y no nombrar el archivo igual que la clase pública (`Main.java`).
- **Práctica**: [🖥 Clic para programar en OnlineGDB](https://onlinegdb.com/t4AFpiVWk)
  - Reto: pide al usuario su nombre y edad por consola y muestra un saludo personalizado usando un método.


### Lección 5: Fundamentos de POO y programas sencillos
- **Descripción**: Construye clases con atributos/métodos y crea un programa POO básico.
- **Enlace**: [▶ Ver la lección]([https://youtu.be/_TEqpwx-bys])
- **Conclusiones clave**:
  - La encapsulación protege los atributos declarando variables como `private`: `private String nombre;`
  - Los **getters** permiten leer atributos privados de forma controlada: `public String getNombre() { return nombre; }`
  - Los **setters** permiten modificar atributos aplicando validaciones: `public void setEdad(int edad) { this.edad = edad; }`
  - Los constructores inicializan el estado de un objeto al instanciarlo con `new`: `Estudiante est = new Estudiante("Lucia", 16);`
  - Un programa POO separa la lógica del modelo (`Estudiante.java`) de la ejecución principal (`SistemaEstudiantes.java`).
  - Errores comunes: intentar acceder directamente a atributos `private` desde otra clase, olvidar `this.` cuando el parámetro tiene el mismo nombre que el atributo, y omitir un constructor vacío si se necesita instanciar sin datos iniciales.
- **Práctica**: [🖥 Clic para programar en OnlineGDB](https://onlinegdb.com/t4AFpiVWk)
  - Reto: crea una clase `Estudiante` con atributos privados (`nombre`, `edad`, `notaFinal`), sus getters/setters y construye un registro interactivo por consola que permita registrar y mostrar los datos de un estudiante.


---

## Información del Equipo

Universidad Peruana de Ciencias Aplicadas
Período 202620  
1ASI0729 Desarrollo de Aplicaciones Open Source

**Nombre del equipo**: Avisum
**Integrantes del equipo**:
- Reyes, Joaquín
- Portal, Waldo
- Miraval, Rodrigo
- Llamozas, Edson Diego
- Blancas, Carlos
