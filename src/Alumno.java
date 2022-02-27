public class Alumno {
    private String nombre;
    private String matricula;
    private double calificacionMedia;
    private int numAsignaturas;
    private Pila asignaturas;

    public Alumno(String nombre, String matricula){
        this.nombre = nombre;
        this.matricula = matricula;
        this.calificacionMedia = 0.0;
        this.asignaturas = new Pila();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getCalificacionMedia() {
        return calificacionMedia;
    }
    public void anadirAsignatura(Asignatura asignatura){
        this.asignaturas.apilar(asignatura);
        this.numAsignaturas = this.asignaturas.getNumElementos();
        this.calificacionMedia = (this.calificacionMedia*(this.numAsignaturas - 1)+asignatura.getCalificacion())/this.numAsignaturas;
    }
    public int getNumAsignaturas() {
        return numAsignaturas;
    }
    public void mostrarAlumno(){
        System.out.println(this.nombre + ". Matr: " + this.matricula + " Media: (" + this.calificacionMedia + ")\nAsignaturas:");
        if (this.numAsignaturas == 0){
            System.out.println("No está matriculado en ninguna asignatura");
        }
        else {
            this.asignaturas.mostrar();
        }
        System.out.print("\n");
    }
}
