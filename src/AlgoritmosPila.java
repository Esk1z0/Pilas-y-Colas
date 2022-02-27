public class AlgoritmosPila {

    public Asignatura asignaturaNotaMaxima(Pila asignaturas) {
        AlgoritmosPila aux = new AlgoritmosPila();
        Asignatura resultado = new Asignatura("", 0);
        resultado = aux.asignaturaNotaMaxima(asignaturas, resultado);
        return resultado;
    }
    public Asignatura asignaturaNotaMaxima(Pila asignaturas, Asignatura resultado){
        AlgoritmosPila aux = new AlgoritmosPila();
        if (asignaturas.getNumElementos() >= 1) {
            Asignatura auxiliar = asignaturas.desapilar();
            if (resultado.getCalificacion() < auxiliar.getCalificacion()){
                resultado = auxiliar;
            }
            resultado = aux.asignaturaNotaMaxima(asignaturas, resultado);
            asignaturas.apilar(auxiliar);
        }
        return resultado;
    }

    public double notaMinima(Pila asignaturas, double resultado) {
        AlgoritmosPila aux = new AlgoritmosPila();
        if (asignaturas.getNumElementos() >= 1) {
            Asignatura auxiliar = asignaturas.desapilar();
            if (auxiliar != null) {
                if (auxiliar.getCalificacion() < resultado) {
                    resultado = auxiliar.getCalificacion();
                }
                resultado = aux.notaMinima(asignaturas, resultado);
                asignaturas.apilar(auxiliar);
            }
        }
        return resultado;
    }
    public double notaMinima(Pila asignaturas){
        AlgoritmosPila aux = new AlgoritmosPila();
        double resultado = aux.notaMinima(asignaturas, 9999);
        return resultado;
    }



    public void mostrarAprobadas(Pila asignaturas) {
        AlgoritmosPila aux = new AlgoritmosPila();
        if (asignaturas.getNumElementos() >= 1) {
            Asignatura auxiliar = asignaturas.desapilar();
            if (auxiliar.getCalificacion() > 5){
                auxiliar.mostrar();
            }
            aux.mostrarAprobadas(asignaturas);
            asignaturas.apilar(auxiliar);
        }
    }

}
