import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        saludarUsuario(nombre, edad);
    }

    public static void saludarUsuario(String nombre, int edad) {
        System.out.println("\n¡Hola " + nombre + "! Tienes " + edad + " años y estás aprendiendo a programar en Java.");
    }
}