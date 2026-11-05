public class Main {
    public static void main(String[] args) {
        int nota = 18;

        System.out.println("--- Evaluación del Estudiante ---");
        if (nota >= 11) {
            System.out.println("Estado: Aprobado. ¡Excelente trabajo!");
        } else {
            System.out.println("Estado: Reprobado. Necesita reforzar los temas.");
        }

        System.out.println("\n--- Registro de Asistencia Semanal ---");
        for (int dia = 1; dia <= 5; dia++) {
            System.out.println("Día " + dia + ": Asistencia confirmada");
        }
    }
}