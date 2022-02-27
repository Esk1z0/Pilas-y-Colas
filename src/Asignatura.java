public class Asignatura {
 private String nombre;
 private double calificacion;


 public Asignatura(){
   this.nombre = "";
   this.calificacion = 0.0;
 }
 public Asignatura(String nom, double cal){
   this.nombre = nom;
   this.calificacion = cal;
 }

public void setAsignatura(String nom, double cal){
     this.nombre = nom;
     this.calificacion = cal;
}

 public String getNombre(){
  return this.nombre;
 }
 public void setNombre(String nombre){
   this.nombre = nombre;
 }

 public double getCalificacion(){
  return this.calificacion;
 }
 public void setCalificacion(double calificacion) {
  this.calificacion = calificacion;
 }

 public void mostrar(){
  System.out.println(this.nombre + " (" + this.calificacion + ")");
 }
}
