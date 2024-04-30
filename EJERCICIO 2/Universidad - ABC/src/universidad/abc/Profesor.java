/*Autora: Antonella Alares*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad.abc;
import java.util.*;


/**
 *
 * @author anto_
 */
public class Profesor extends Usuario {
private List<Curso> cursosImpartidos; /*Sería génerico si pongo new ArrayList() fuera del constructor*/
private List<Tarea> tareasCreadas; 
private List<Calificacion> calificacionesPublicadas; 
private List<Foro> foroPublicaciones;
private List<MaterialEstudio> materiales;
private List<Examen> examenesConRespuesta;
private List<Examen> examenesSinRespuesta;

public Profesor(String nombre, String apellido, String correo, String contrasena, String rol, int telefono, boolean autenticacionDosFactores) {
        super(nombre, apellido, correo, contrasena, rol, telefono, autenticacionDosFactores);
       this.cursosImpartidos =  new ArrayList<>();
       this.tareasCreadas = new ArrayList<>();
       this.calificacionesPublicadas = new ArrayList<>();
       this.foroPublicaciones = new ArrayList<>();
       this.materiales = new ArrayList<>();
       this.examenesConRespuesta = new ArrayList<>();
       this.examenesSinRespuesta = new ArrayList<>();
       

}


public List<Curso> getCursosImpartidos(){
return cursosImpartidos;
}

public List<Tarea> getTareasCreadas(){
return tareasCreadas;
}

public List<Calificacion> getCalificacionesPublicadas(){
return calificacionesPublicadas;
}

public List<Foro> getForoPublicaciones(){
return foroPublicaciones;
}

public List<MaterialEstudio> getMaterialesEstudioProfesor(){
return materiales;
}

public List<Examen> getExamenesSinRespuestaProfesor(){
return examenesSinRespuesta;
}

public List<Examen> getExamenesConRespuestaProfesor(){
return examenesConRespuesta;
}



@Override
public boolean iniciarSesion(String correo, String contrasena) {
        return super.iniciarSesion(correo, contrasena);
    }

public void añadirListaCursosImpartidos(Curso cursoImpartido){
cursosImpartidos.add(cursoImpartido);
}

public void crearTareaYGuardarEnListaTareasCreadas(String nombre, String asignatura, String contenido, String status){
		Tarea nuevaTarea = new Tarea(nombre, asignatura, contenido, status);
		tareasCreadas.add(nuevaTarea);
	} 

public void crearCalificacionYGuardarlaEnLista(String asignatura, double nota){
		Calificacion nuevaCalificacion = new Calificacion(asignatura, nota);
		calificacionesPublicadas.add(nuevaCalificacion);
	} 

public void crearPublicacionYGuardarEnLista(String comentario){
Foro publicacionForo = new Foro(comentario);
foroPublicaciones.add(publicacionForo);
}

public void eliminarPublicacionProfesor(Profesor profesor, int index){
    for(int i= index; i <= index ; i++){
    System.out.println(profesor.getForoPublicaciones().get(i).getComentarioPublicacionForo() + "\n"); /*Para imprimir un elemento de un array  que contiene objetos como elementos: siempre sería getarray().get(poner el índice del elemento en el array (en este caso el elemento es un obejto), ya que sino nos imprimiría la localización en la memoria de ese objeto en el paquete- en este caso también ponemos getAtributodelObjeto()para coger el atributo "comentario" del objeto foro )*/
    profesor.getForoPublicaciones().remove(i);
    }
}

public void crearMaterialEstudioYGuardarlaEnListaMateriales(String nombre, String tipo){
		MaterialEstudio materialEstudio = new MaterialEstudio(nombre, tipo);
                materiales.add(materialEstudio);
	} 

public void crearExamenesSinRespuestasYGuardarlaEnLista(String pregunta){
		Examen examen = new Examen(pregunta);
                examenesSinRespuesta.add(examen);
	}

public void crearExamenesConRespuestasYGuardarlaEnLista(String pregunta, String respuesta){
		Examen examen = new Examen(pregunta, respuesta);
                examenesConRespuesta.add(examen);
	}

public void calificarEstudiante(Estudiante estudiante, Tarea tarea, double nota) {
    Calificacion calificacion = new Calificacion(tarea.getAsignaturaTarea(), nota);
    this.calificacionesPublicadas.add(calificacion);
    estudiante.recibirCalificacion(calificacion);
    tarea.anadirCalificacion(calificacion);
    System.out.println("Se ha calificado al estudiante " + estudiante.getNombre() + " " + estudiante.getApellido() + " en la asignatura " + tarea.getAsignaturaTarea() + " concretamente en la tarea: " + tarea.getNombreTarea() + " con la nota: " + calificacion.getNotaCalificacion());
    
}


}
