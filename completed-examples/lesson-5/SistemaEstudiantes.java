public class Main {
    public static void main(String[] args) {
        Estudiante alumno1 = new Estudiante("Lucía", 16, 18.0);
        Estudiante alumno2 = new Estudiante("Mateo", 15, 14.5);

        System.out.println("--- Lista de Estudiantes ---");
        alumno1.mostrarInfo();
        alumno2.mostrarInfo();

        alumno2.setNotaFinal(16.0);
        System.out.println("\nNota actualizada de " + alumno2.getNombre() + ":");
        alumno2.mostrarInfo();
    }
}