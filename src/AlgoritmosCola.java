public class AlgoritmosCola {

    public void mostrarGrupo (Cola grupo) {
        Alumno auxiliar = null;
        int contador = 0;
        if(grupo.getNumElementos() == 0){
            System.out.println("No hay Alumnos en el grupo");
        }
        else {
            System.out.println("El grupo contiene " + grupo.getNumElementos() + " alumnos");
            while (grupo.getNumElementos() - contador != 0) {
                contador += 1;
                auxiliar = grupo.desencolar();
                System.out.println(contador + ". " + auxiliar.getNombre());
                grupo.encolar(auxiliar);
            }
        }
    }

    public Cola alumnosAprobados (Cola grupo) {
        Cola aprobados = new Cola();
        Alumno auxiliar = null;
        int contador = 0;
        while(grupo.getNumElementos() - contador != 0){
            contador += 1;
            auxiliar = grupo.desencolar();
            if (auxiliar.getCalificacionMedia() >= 5){
                aprobados.encolar(auxiliar);
            }
            grupo.encolar(auxiliar);
        }
        return aprobados;
    }

    public double calificaciónMedia (Cola grupo) {
        double resultado = 0;
        Alumno auxiliar = null;
        int numAsignaturasTotal = 0;
        double sumaNotas = 0;
        int contador = 0;
        while (grupo.getNumElementos() - contador != 0){
            contador += 1;
            auxiliar = grupo.desencolar();
            numAsignaturasTotal = numAsignaturasTotal + auxiliar.getNumAsignaturas();
            sumaNotas = sumaNotas + (auxiliar.getCalificacionMedia() * auxiliar.getNumAsignaturas());
            grupo.encolar(auxiliar);
        }
        resultado = sumaNotas/numAsignaturasTotal;
        return resultado;
    }
}
