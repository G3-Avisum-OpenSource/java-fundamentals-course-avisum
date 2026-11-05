public class Estudiante {
    private String nombre;
    private int edad;
    private double notaFinal;

    public Estudiante(String nombre, int edad, double notaFinal) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaFinal = notaFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double nuevaNota) {
        if (nuevaNota >= 0 && nuevaNota <= 20) {
            this.notaFinal = nuevaNota;
        }
    }

    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " | Edad: " + edad + " | Nota: " + notaFinal);
    }
}