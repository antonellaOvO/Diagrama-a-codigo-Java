/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidad.abc;
import java.util.*;

/**
 *
 * @author anto_
 */
public class UniversidadABC {

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Creando instancias de las clases*/
        Profesor profesor1 = new Profesor ("Juan", "Garc�a", "juan@gmail.com", "profesor123", "profesor", 931234567, true);
        Estudiante estudiante1 = new Estudiante ("Antonio", "Garc�a", "antonio@gmail.com", "profesor123", "estudiante", 931234567, true);
        
        /*Curso*/
            //Cursos creados- creados as� ya que no es el profesor qui�n crea los cursos, sino que ya est�n creados en la plataforma por defecto
            Curso curso1 = new Curso("Aprender Java", "ABCD", "Pablo Rodr�guez");
            Curso curso2 = new Curso("Aprender a lidiar con el s�ndrome del Impostor", "EFGH", "Fernando Tej�n");
        /*Profesor*/
            System.out.println("PROFESORES:");
            //Para crear cuenta del profesor1
            profesor1.crearCuenta();
            
            //Para iniciar sesi�n del profesor1
            profesor1.iniciarSesion(profesor1.getCorreo(), profesor1.getContrasena());
            
            //Para que el profesor1 cree tareas
            profesor1.crearTareaYGuardarEnListaTareasCreadas("Tarea 1 - Calcular Operaciones", "Matem�ticas", "1 x 2 =2, pero y 5 x 2 = ?", "por entregar");
            profesor1.crearTareaYGuardarEnListaTareasCreadas("Tarea 2 - Resolver Ecuaciones", "Matem�ticas", "Si x = 1; �Cu�nto vale y si x + y = 5?", "por entregar");
            //Para visualizar el listado de tareas asignadas (creadas por el profesor1)
            System.out.println("Estas son las tareas que has creado:");
            for(Tarea tarea: profesor1.getTareasCreadas()){
            System.out.println("Tareas: " + tarea.getNombreTarea()+ " - perteneciente a la asignatura " + tarea.getAsignaturaTarea());
            }
            
            //Para que el profesor1 cree Calificacion y la guarde en su Lista de Calificaciones
            profesor1.crearCalificacionYGuardarlaEnLista("Matem�ticas", 7.5);
            profesor1.crearCalificacionYGuardarlaEnLista("Biolog�a", 8.5);
           //Para visualizar el listado de calificaciones enviadas (creadas por el profesor1):
            System.out.println("Estas son las calificaciones que has creado:");
            for(Calificacion calificacion: profesor1.getCalificacionesPublicadas()){
            System.out.println("Calificacion - asignatura: " + calificacion.getAsignaturaCalificacion()+ " - cuya nota es de: " + calificacion.getNotaCalificacion());
            }
            //Para que el profesor1 cree un publicaci�n en el foro y la guarde en su Lista de Publicaciones
            profesor1.crearPublicacionYGuardarEnLista("Me parece muy productivo que los alumnos interact�en en el foro y puedan ayudarse entre ellos. Seguid as�! �nimo!");
            profesor1.crearPublicacionYGuardarEnLista("Por favor, abstenerse de ese tipo de comentarios en este foro. Muchas gracias.");
            //Para visualizar el listado de comentarios/publicaciones del foro creados por el profesor1 
            System.out.println("Estas son tus publicaciones:");
            for(Foro publicacionForo: profesor1.getForoPublicaciones()){
            System.out.println(publicacionForo.getComentarioPublicacionForo() + "\n" );
            }
            //Para eliminar la publicacion del foro creado por el profesor1 
            System.out.println("Esta es tu publicaci�n que ha sido eliminada:");
            profesor1.eliminarPublicacionProfesor(profesor1, 0);
            //Para comprobar que la publicaci�n del foro de profesor1 ha sido eliminada, ya que aparece el otro comentario que ahora ocupar�a la posici�n 0, si ponemos posici�n 1 te dar� error "out of bound of index..."
            System.out.println("Esta es la publicaci�n queda tras eliminar la anterior publicaci�n: " + profesor1.getForoPublicaciones().get(0).getComentarioPublicacionForo()+ "\n");
            
            //Para que el profesor1 cree el material de estudio y se a�ada al listado de materiales de estudio del profesor1
            profesor1.crearMaterialEstudioYGuardarlaEnListaMateriales("Matar a un ruise�or", "Libro(lectura)");
            //Para que el material de Estudio se a�ada al listado de materiales de estudio del curso 
            System.out.println("Estos son los materiales de estudios que has a�adido al curso:");
            for(MaterialEstudio materialEstudio: profesor1.getMaterialesEstudioProfesor()){ /*Hay que poner esta sentencia siempre despu�s del profesor, ya que si el profesor a�n no ha creado el material de Estudio, 
            y por tanto a�n no se ha guardado en la lista de materiales de estudio del curso, c�mo vamos a poder mostras el contenido de esta lista*/
            curso1.a�adirMaterialEstudioEnListaMaterialesEstudio(materialEstudio);
            System.out.println("\n" + materialEstudio.getNombre()+ " - " + materialEstudio.getTipo());
            }
            
            //Para que el profesor1 cree el examen CON/SIN respuestas y se a�ada al listado de examenes del profesor1
            profesor1.crearExamenesSinRespuestasYGuardarlaEnLista("�Qu� conlleva el static en Java?");
            profesor1.crearExamenesConRespuestasYGuardarlaEnLista("�Qu� conlleva el static en Java?", "Static permite que puedas llamar a ese atributo o m�todo desde la clase, ya que se convierte en una variable de clase que comparten todas las instancias de esa clase.");
            
            //Para que el examen sin respuesta se a�ada al listado de examenes del curso 
            System.out.println("\nEstos son los examenes sin respuesta que has a�adido al curso:");
            for(Examen examen: profesor1.getExamenesSinRespuestaProfesor()){ 
            curso1.a�adirExamenesEnListaExamenesCurso(examen);
            System.out.println("La pregunta del examen es: " + examen.getPreguntaExamen() + " y aqu� no habr�a respuesta y su valor ser�a null: " + examen.getRespuestaExamen());
            }
             //Para que el examen con respuesta se a�ada al listado de examenes del curso 
            System.out.println("\nEstos son los examenes con respuesta que has a�adido al curso:" );
            for(Examen examen: profesor1.getExamenesConRespuestaProfesor()){ 
            curso1.a�adirExamenesEnListaExamenesCurso(examen);
            System.out.println("La pregunta del examen es: " + examen.getPreguntaExamen() + " y su respuesta ser�a: " + examen.getRespuestaExamen());
            }
            
            
        /*Para espaciar estudiante y profesor en el OUTPUT*/
        System.out.println("");
            
        /*Estudiante*/
            System.out.println("ESTUDIANTES:");
            //Para crear cuenta estudiante1
            estudiante1.crearCuenta();
            //Para iniciar sesi�n del estudiante1
            estudiante1.iniciarSesion(estudiante1.getCorreo(), estudiante1.getContrasena());
            //Para a�adir el curso1 y curso2 (creados arriba con la creaci�n de la instancia de Curso) en la list de cursosInscritos*/
            estudiante1.a�adirListaCursosInscritos(curso1);
            estudiante1.a�adirListaCursosInscritos(curso2);
            //Para visualizar el listado de cursos en los que el estudiante1 est� inscrito- como arriba se han creado 2 cursos (curso1, curso2), s�lo aparecer�n esos 2 cursos
            System.out.println("Lista de los cursos del estudiante " + estudiante1.getNombre() + ":");
            for(Curso curso: estudiante1.getCursos()){
            System.out.println("Curso: " + curso.getNombreCurso()+ " - Impartido por el profesor: " + curso.getNombreProfesorCurso());
            }
             //Para a�adir la tarea que crea el profesor a la lista de tareas del alumno confirmar al estudiante que tareas tiene asignadas (que se las ha enviado el profesor):*/
            for(Tarea tarea: profesor1.getTareasCreadas()){ /*Hay que poner esta sentencia siempre despu�s del profesor, ya que si el profesor a�n no ha creado la tarea, 
            y por tanto a�n no se ha guardado en la lista de tareasCreadas del profesor, c�mo vamos a poder meter esta lista en la lista de tareasEnviadas del estudiante*/
            estudiante1.a�adirListaTareasEnviadas(tarea);
            }
             //Para confirmar al estudiante que ha enviado una tarea:
            estudiante1.enviarTarea(profesor1); 
            //Para a�adir la calificacion que crea el profesor a la lista de calificaciones del alumno:
            for(Calificacion calificacion: profesor1.getCalificacionesPublicadas()){ /*Hay que poner esta sentencia siempre despu�s del profesor, ya que si el profesor a�n no ha creado la calificacion, 
            y por tanto a�n no se ha guardado en la lista de calificacionesPublicadas del profesor, c�mo vamos a poder meter esta lista en la lista de calificacionesRecibidas del estudiante*/
            estudiante1.recibirCalificacion(calificacion);
            }
            
            //Para que el estudiante1 cree una publicaci�n en el Foro y la guarde en su Lista de Publicaciones 
            estudiante1.crearPublicacionYGuardarEnLista("Alguien podr�a ayudarme con este problema de matem�ticas?");
            estudiante1.crearPublicacionYGuardarEnLista("Tranquilo, a mi tambi�n me cuesta mucho esto de aprender Java");
            //Para visualizar el listado de comentarios/publicaciones creados por el estudiante1
            System.out.println("Estas son tus publicaciones en el foro:");
            for(Foro publicacionForo: estudiante1.getForoPublicaciones()){
            System.out.println(publicacionForo.getComentarioPublicacionForo() + "\n" );
            }
            
            //Para eliminar la publicacion del foro creado por el estudiante1 
            System.out.println("Esta es tu publicaci�n que ha sido eliminada:");
            estudiante1.eliminarPublicacionEstudiante(estudiante1, 0);
            //Para comprobar que la publicaci�n del foro de estudiante1 ha sido eliminada, ya que aparece el otro comentario que ahora ocupar�a la posici�n 0, si ponemos posici�n 1 te dar� error "out of bound of index..."
            System.out.println("Esta es la publicaci�n queda tras eliminar la anterior publicaci�n: " + estudiante1.getForoPublicaciones().get(0).getComentarioPublicacionForo() + "\n");
        
        
        /*Curso*/
            //Para a�adir las tareas creadas por el profesor en el curso correspondiente:
            for(Tarea tarea: profesor1.getTareasCreadas()){ /*Hay que poner esta sentencia siempre despu�s del profesor, ya que si el profesor a�n no ha creado la tarea, 
            y por tanto a�n no se ha guardado en la lista de tareasCreadas del profesor, c�mo vamos a poder meter esta lista en la lista de tareas del curso*/
            curso1.a�adirTareaAlListaTareas(tarea);
            }
            
            
       
        
         
         
         
            
            
           
            
            
       
        
        
        
       
            
     
        
        
        
    }
    
}
