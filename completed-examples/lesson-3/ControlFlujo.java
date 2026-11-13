public class Home {
    public static void main(String[] args) {
        System.out.println("CURSO JAVA - LECCIÓN 3: CONDICIONALES");
        System.out.println("=====================================");
        
        leccion3();
    }
    
    public static void leccion3() {
        System.out.println("\n LECCIÓN 3: CONDICIONALES - TOMANDO DECISIONES");
        System.out.println("----------------------------------------------");
        
        System.out.println("PARTE 1: IF-ELSE BÁSICO");
        System.out.println("------------------------");
        
        // Ejemplo 1: Edad para película
        System.out.println("\n EJEMPLO 1 - EDAD PARA PELÍCULA:");
        int edad = 15;
        System.out.println("Edad: " + edad + " años");
        
        if (edad >= 13) {
            System.out.println("Puedes ver películas para mayores de 13");
        } else {
            System.out.println("No puedes ver esta película");
        }
        
        // Ejemplo 2: Sistema de notas
        System.out.println("\n EJEMPLO 2 - SISTEMA DE NOTAS:");
        double nota = 14.5;
        System.out.println("Nota: " + nota);
        
        if (nota >= 11) {
            System.out.println(" ¡Aprobado!");
        } else {
            System.out.println("Desaprobado");
        }
        
        System.out.println("\n PARTE 2: CONDICIONALES MÚLTIPLES");
        System.out.println("------------------------------------");
        
        // Ejemplo 3: Recomendaciones por edad
        System.out.println("\n SISTEMA DE RECOMENDACIONES:");
        int tuEdad = 14;         // Cambia esta edad
        String clima = "soleado"; // Cambia por "lluvioso" o "nublado"
        
        System.out.println("Tus datos - Edad: " + tuEdad + ", Clima: " + clima);
        
        System.out.println("\n RECOMENDACIONES:");
        
        // Recomendación por edad
        if (tuEdad < 13) {
            System.out.println(" Ve al parque infantil");
        } else if (tuEdad >= 13 && tuEdad <= 17) {
            System.out.println(" Ve al cine con amigos");
        } else {
            System.out.println(" Puedes ir a un concierto");
        }
        
        // Recomendación por clima
        if (clima.equals("soleado")) {
            System.out.println(" Perfecto para actividades al aire libre");
        } else if (clima.equals("lluvioso")) {
            System.out.println(" Mejor quedarse en casa");
        } else {
            System.out.println(" Podrías ir a un museo");
        }
        
        System.out.println("\n PARTE 3: EJERCICIO PRÁCTICO");
        System.out.println("----------------------------");
        
        System.out.println("\n SISTEMA DE VIDEOJUEGOS:");
        boolean tareaHecha = true;  // Cambia a true/false
        int hora = 21;              // Cambia la hora (0-23)
        
        System.out.println("Tarea hecha: " + tareaHecha);
        System.out.println("Hora: " + hora + ":00");
        
        System.out.println("\n VEREDICTO:");
        if (tareaHecha && hora >= 18 && hora <= 22) {
            System.out.println("¡Puedes jugar videojuegos!");
        } else {
            System.out.println("No puedes jugar ahora");
            if (!tareaHecha) {
                System.out.println(" - Primero termina tu tarea");
            }
            if (hora < 18 || hora > 22) {
                System.out.println(" - Fuera del horario permitido");
            }
        }
        
        System.out.println("\n ¡LECCIÓN 3 COMPLETADA!");
    }
}
