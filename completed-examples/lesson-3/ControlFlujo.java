public class ControlFlujo {
    public static void main(String[] args) {
        int nota = 15;

        System.out.println("--- Resultado del Examen ---");
        if (nota >= 11) {
            System.out.println("¡Aprobaste el examen! Felicitaciones.");
        } else {
            System.out.println("Necesitas repasar un poco más.");
        }

        System.out.println("\n--- Contando del 1 al 5 con un Bucle ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }
    }
}