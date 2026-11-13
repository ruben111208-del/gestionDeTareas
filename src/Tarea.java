public class Tarea {
    private String nombre;
    private String asignatura;
    private boolean completada;

    public Tarea(String nombre, String asignatura) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.completada = false;
    }

    // METODO: cambia el estado de la tarea
    public void completarTarea() {
        completada = true;
    }

    // METODO: muestra información
    public void mostrarTarea() {
        System.out.println(nombre + " - " + asignatura);
    }
}
