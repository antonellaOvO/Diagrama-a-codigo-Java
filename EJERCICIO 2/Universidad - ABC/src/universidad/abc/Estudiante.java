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
public class Estudiante extends Usuario {
private  List<Curso> cursosInscritos;
private  List<Tarea> tareasEnviadas; 
private  List<Calificacion> calificacionesRecibidas; /*Debiera crear entonces la clase Calificacion?*/
private  List<Foro> foroPublicaciones;/*cuidado porque este atributo es el mismo que tiene Profesor!- quizás habría que meterla en Usuario?*/


public Estudiante(String nombre, String apellido, String correo, String contrasena, String rol, int telefono, boolean autenticacionDosFactores) {
        super(nombre, apellido, correo, contrasena, rol, telefono, autenticacionDosFactores);
        this.cursosInscritos = new ArrayList<>();
        this.tareasEnviadas = new ArrayList<>();
        this.calificacionesRecibidas = new ArrayList<>();
        this.foroPublicaciones = new ArrayList<>();
        
        
    } 


public List<Curso> getCursos() {
return this.cursosInscritos; /*el this es opcional*/
}

public List<Tarea> getTareas() {
return this.tareasEnviadas; 
}

public List<Calificacion> getCalificaciones() {
return this.calificacionesRecibidas; 
}

public List<Foro> getForoPublicaciones() {
return this.foroPublicaciones; 
}

//Para confirmar al estudiante que ha enviado una tarea de las que ha creado Profesor:
public boolean enviarTarea(Profesor profesor) {
   String nuevoStatus = "entregado"; /*pendiente modificar- quizás debiera ser Curso curso- curso.getTareasCurso()- no funciona- mirar porque ya que tareas debe también estar incluida en el listado de tareas de Curso*/
        for (Tarea tarea : profesor.getTareasCreadas()) {
            tarea.setStatusTarea(nuevoStatus);
        }
        System.out.println("Has enviado la tarea, gracias " + this.getNombre() + "!");
        return true;
        
    }




public void añadirListaCursosInscritos(Curso cursoInscrito){
this.cursosInscritos.add(cursoInscrito);
System.out.println(this.getNombre()+ " te acabas de inscribir en el curso siguiente: " + cursoInscrito.getNombreCurso());

}

public void añadirListaTareasEnviadas(Tarea tareaEnviada){
this.tareasEnviadas.add(tareaEnviada);
System.out.println(this.getNombre()+ " se te acaba de asignar la siguiente tarea: " + tareaEnviada.getNombreTarea());

}

public void recibirCalificacion(Calificacion calificacion) {
   this.calificacionesRecibidas.add(calificacion);
System.out.println(this.getNombre()+ " se te acaba de asignar la siguiente calificacion: " + calificacion.getNotaCalificacion() + " de la asignatura " + calificacion.getAsignaturaCalificacion() ); 
}

public void crearPublicacionYGuardarEnLista(String comentario){
Foro publicacionForo = new Foro(comentario);
foroPublicaciones.add(publicacionForo);
}

public void eliminarPublicacionEstudiante(Estudiante estudiante, int index){
    for(int i= index; i <= index ; i++){
    System.out.println(estudiante.getForoPublicaciones().get(i).getComentarioPublicacionForo() + "\n"); /*Para imprimir un elemento de un array  que contiene objetos como elementos: siempre sería getarray().get(poner el índice del elemento en el array (en este caso el elemento es un obejto)- en este caso también ponemos getAtributodelObjeto()para coger el atributo "comentario" del objeto foro )*/
    estudiante.getForoPublicaciones().remove(i);
    }
}


}
