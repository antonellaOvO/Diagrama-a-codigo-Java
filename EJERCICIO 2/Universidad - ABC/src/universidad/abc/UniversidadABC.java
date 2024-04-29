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
        Estudiante estudiante1 = new Estudiante ("Antonio", "Garc�a", "antonio@gmail.com", "estudiante123", "estudiante", 931234567, true);
        
        /*Curso*/
            //Cursos creados- creados as� ya que no es el profesor qui�n crea los cursos, sino que ya est�n creados en la plataforma por defecto
            Curso curso1 = new Curso("Aprender Java", "ABCD", "Pablo Rodr�guez");
            Curso curso2 = new Curso("Aprender a lidiar con el s�ndrome del Impostor", "EFGH", "Fernando Tej�n");
        
        /*Plataforma E-learning*/
            //Plataformas E-Learnings ya creadas (porque son sistemas externos)
            PlataformaLearning plataformaLearning1 = new PlataformaLearning("Plataforma Youtube", "Videos de ayuda", "www.Youtube.com", "etc, etc, etc.....");
            PlataformaLearning plataformaLearning2 = new PlataformaLearning("Plataforma Udemy", "Cursos en Streaming gratis para estudiantes", "www.Udemy.com", "etc, etc, etc.....");
            //Plataformas E-Learnings ya creadas (porque son sistemas externos)
            curso1.a�adirPlataformaLearningaListacontenidoPlataformaLearning(plataformaLearning1);
            curso2.a�adirPlataformaLearningaListacontenidoPlataformaLearning(plataformaLearning2);
        
        /*Profesor*/
            System.out.println("PROFESORES:");
            //Para crear cuenta del profesor1
            profesor1.crearCuenta();
            
            //Para iniciar sesi�n del profesor1
            profesor1.iniciarSesion(profesor1.getCorreo(), profesor1.getContrasena());
            
            //Para que el profesor a�ada cursos en su Lista de Cursos impartidos:
            profesor1.a�adirListaCursosImpartidos(curso1);
            profesor1.a�adirListaCursosImpartidos(curso2);
            //Para visualizar el listado de cursos impartidos por el profesor1:
            System.out.println("\nEstos son los cursos que has elegido impartir: ");
            for(Curso curso: profesor1.getCursosImpartidos()){
            System.out.println("Curso: " + curso.getNombreCurso()+ " - con c�digo: " + curso.getCodigoCurso());
            }
            
            //Para que el profesor1 cree tareas
            profesor1.crearTareaYGuardarEnListaTareasCreadas("Tarea 1 - Calcular Operaciones", "Matem�ticas", "1 x 2 =2, pero y 5 x 2 = ?", "por entregar");
            profesor1.crearTareaYGuardarEnListaTareasCreadas("Tarea 2 - Resolver Ecuaciones", "Matem�ticas", "Si x = 1; �Cu�nto vale y si x + y = 5?", "por entregar");
            //Para visualizar el listado de tareas asignadas (creadas por el profesor1)
            System.out.println("\nEstas son las tareas que has creado:");
            for(Tarea tarea: profesor1.getTareasCreadas()){
            System.out.println("Tareas: " + tarea.getNombreTarea()+ " - perteneciente a la asignatura " + tarea.getAsignaturaTarea() + ". Su estado es: " + tarea.getStatusTarea());
            }
            
            System.out.println(" ");
           
            //Para que el profesor1 cree Calificacion y la guarde en su Lista de Calificaciones
            profesor1.crearCalificacionYGuardarlaEnLista("Matem�ticas", 7.5);
            profesor1.crearCalificacionYGuardarlaEnLista("Biolog�a", 8.5);
           //Para visualizar el listado de calificaciones enviadas (creadas por el profesor1):
            System.out.println("\nEstas son las calificaciones que has creado:");
            for(Calificacion calificacion: profesor1.getCalificacionesPublicadas()){
            System.out.println("Calificacion - asignatura: " + calificacion.getAsignaturaCalificacion()+ " - cuya nota es de: " + calificacion.getNotaCalificacion());
            }
            /*Foro*/
            //Para que el profesor1 cree un publicaci�n en el foro y la guarde en su Lista de Publicaciones
            profesor1.crearPublicacionYGuardarEnLista("Me parece muy productivo que los alumnos interact�en en el foro y puedan ayudarse entre ellos. Seguid as�! �nimo!");
            profesor1.crearPublicacionYGuardarEnLista("Por favor, abstenerse de ese tipo de comentarios en este foro. Muchas gracias.");
            
            //Para visualizar el listado de comentarios/publicaciones del foro creados por el profesor1 
            System.out.println("\nEstas son tus publicaciones:");
            for(Foro publicacionForo: profesor1.getForoPublicaciones()){
            System.out.println(publicacionForo.getComentarioPublicacionForo() + "\n" );
            }
            //Para eliminar la publicacion del foro creado por el profesor1 
            System.out.println("Esta es tu publicaci�n que ha sido eliminada:");
            profesor1.eliminarPublicacionProfesor(profesor1, 0);
            //Para comprobar que la publicaci�n del foro de profesor1 ha sido eliminada, ya que aparece el otro comentario que ahora ocupar�a la posici�n 0, si ponemos posici�n 1 te dar� error "out of bound of index..."
            System.out.println("Esta es la publicaci�n que queda tras eliminar la anterior publicaci�n: " + profesor1.getForoPublicaciones().get(0).getComentarioPublicacionForo()+ "\n");
            
            //Para que el profesor1 cree el material de estudio y se a�ada al listado de materiales de estudio del profesor1
            profesor1.crearMaterialEstudioYGuardarlaEnListaMateriales("Aprender JavaScript desde cero", "Libro(lectura)");
            profesor1.crearMaterialEstudioYGuardarlaEnListaMateriales("Ejercicios JavaScript para tontos", "Video (visualizar video");
            //Para visualizar/comprobar que los materiales de estudio est�n a�adidos en la lista de materiales de estudio del profeso1:
            System.out.println("Estos son los materiales de estudios que has creado:");
            for(MaterialEstudio materialEstudio: profesor1.getMaterialesEstudioProfesor()){
            System.out.println(materialEstudio.getNombre()+ " - " + materialEstudio.getTipo());
            }
           
            
            //Para que el profesor1 cree los ex�menes CON/SIN respuestas y se a�ada al listado de examenes del profesor1
            profesor1.crearExamenesSinRespuestasYGuardarlaEnLista("�Qu� conlleva el static en Java?");
            profesor1.crearExamenesConRespuestasYGuardarlaEnLista("�Qu� conlleva el static en Java?", "Static permite que puedas llamar a ese atributo o m�todo desde la clase, ya que se convierte en una variable de clase que comparten todas las instancias de esa clase.");
            
            
            
        /*Para espaciar estudiante y profesor en el OUTPUT*/
        System.out.println("");
            
        /*Estudiante*/
            System.out.println("ESTUDIANTES:");
            
            //Para crear cuenta estudiante1
            estudiante1.crearCuenta();
            
            //Para iniciar sesi�n del estudiante1
            estudiante1.iniciarSesion(estudiante1.getCorreo(), estudiante1.getContrasena());
            
            System.out.println(" ");
            
            //Para a�adir el curso1 y curso2 (creados arriba con la creaci�n de la instancia de Curso) en la lista de cursosInscritos del Estudiante*/
            estudiante1.a�adirListaCursosInscritos(curso1);
            estudiante1.a�adirListaCursosInscritos(curso2);
            
            System.out.println(" ");
            
            //Para visualizar el listado de cursos en los que el estudiante1 est� inscrito- como arriba se han creado 2 cursos (curso1, curso2), s�lo aparecer�n esos 2 cursos
            System.out.println("Lista de los cursos del estudiante " + estudiante1.getNombre() + ":");
            for(Curso curso: estudiante1.getCursos()){
            System.out.println("Curso: " + curso.getNombreCurso()+ " - Impartido por el profesor: " + curso.getNombreProfesorCurso());
            }
            
            System.out.println(" ");
            
             //Para a�adir la tarea que crea el profesor a la lista de tareas del alumno y confirmar al estudiante que tareas tiene asignadas (que se las ha enviado el profesor):
            for(Tarea tarea: profesor1.getTareasCreadas()){ /*Hay que poner esta sentencia siempre despu�s del profesor, ya que si el profesor a�n no ha creado la tarea, 
            y por tanto a�n no se ha guardado en la lista de tareasCreadas del profesor, c�mo vamos a poder meter esta lista en la lista de tareasEnviadas del estudiante*/
            estudiante1.a�adirListaTareasEnviadas(tarea);
            }
            
            System.out.println(" ");
            
             //Para confirmar al estudiante que ha enviado una tarea:
            estudiante1.enviarTarea(estudiante1, "entregado"); 
            //Para comprobar que el status de tarea realmente ha cambiado de "por entregar" a "entregado":
            System.out.println("El estatus de las tareas es ahora como: ");
            for(Tarea tarea: estudiante1.getTareas()){ 
            System.out.println(tarea.getStatusTarea());
            }
            
            System.out.println(" ");
            
             //Para a�adir la calificacion que crea el profesor a la lista de calificaciones del alumno: - Opci�n 1
            for(Calificacion calificacion: profesor1.getCalificacionesPublicadas()){ /*Hay que poner esta sentencia siempre despu�s del profesor, ya que si el profesor a�n no ha creado la calificacion, 
            y por tanto a�n no se ha guardado en la lista de calificacionesPublicadas del profesor, c�mo vamos a poder meter esta lista en la lista de calificacionesRecibidas del estudiante*/
            estudiante1.recibirCalificacion(calificacion);
            }
             System.out.println(" ");
            
            //Para calificar al estudiante1 y confirmale al estudiante1 la calificaci�n asignada - Opci�n 2 - una opci�n m�s rentable que la opci�n 1
            for(Tarea tarea : profesor1.getTareasCreadas()){
                profesor1.calificarEstudiante(estudiante1, tarea , 5.6);
               /// profesor1.calificarEstudiante(estudiante, tarea , 5.6);
            }
            
            System.out.println(" ");
            
            //Para que el estudiante1 cree una publicaci�n en el Foro y la guarde en su Lista de Publicaciones 
            estudiante1.crearPublicacionYGuardarEnLista("Alguien podr�a ayudarme con este problema de matem�ticas?");
            estudiante1.crearPublicacionYGuardarEnLista("Tranquilo, a mi tambi�n me cuesta mucho esto de aprender Java");
            //Para visualizar el listado de comentarios/publicaciones creados por el estudiante1
            System.out.println("Estas son tus publicaciones en el foro:");
            for(Foro publicacionForo: estudiante1.getForoPublicaciones()){
            System.out.println(publicacionForo.getComentarioPublicacionForo());
            }
            
            System.out.println(" ");
            
            //Para eliminar la publicacion del foro creado por el estudiante1 
            System.out.println("Esta es tu publicaci�n que ha sido eliminada:");
            estudiante1.eliminarPublicacionEstudiante(estudiante1, 0);
            
             System.out.println(" ");
           
            //Para comprobar que la publicaci�n del foro de estudiante1 ha sido eliminada, ya que aparece el otro comentario que ahora ocupar�a la posici�n 0, si ponemos posici�n 1 te dar� error "out of bound of index..."
            System.out.println("Esta es la publicaci�n que queda tras eliminar la anterior publicaci�n: " + estudiante1.getForoPublicaciones().get(0).getComentarioPublicacionForo() + "\n");
        
        
        /*Curso*/
        
            System.out.println("DATOS CURSO:");
           
            System.out.println(" ");
            
            System.out.println("Tareas:");
            //Para a�adir una de las tareas creadas por el profesor1 (espec�ficamente Tarea 1) en el curso1:
            for(Tarea tarea: profesor1.getTareasCreadas()){ /*Hay que poner esta sentencia siempre despu�s del profesor, ya que si el profesor a�n no ha creado la tarea, 
            y por tanto a�n no se ha guardado en la lista de tareasCreadas del profesor, c�mo vamos a poder meter esta lista en la lista de tareas del curso*/
            curso1.a�adirTareaAlListaTareas(tarea, "Tarea 1 - Calcular Operaciones");
            }
            
            //Para a�adir una de las tareas creadas por el profesor1 (espec�ficamente Tarea 2) en el curso1:
            for(Tarea tarea: profesor1.getTareasCreadas()){ /*Hay que poner esta sentencia siempre despu�s del profesor, ya que si el profesor a�n no ha creado la tarea, 
            y por tanto a�n no se ha guardado en la lista de tareasCreadas del profesor, c�mo vamos a poder meter esta lista en la lista de tareas del curso*/
            curso1.a�adirTareaAlListaTareas(tarea, "Tarea 2 - Resolver Ecuaciones");
            }
            
            System.out.println(" ");
            
            System.out.println("Materiales de estudio:");
            //Para que el material de Estudio creado por el profesor (espec�ficamente el material de estudio1 "Aprender JavaScript desde cero" se a�ada al listado de materiales de estudio del curso1 y para que el profesor reciba confirmaci�n cada vez que crea un material de estudio 
            System.out.println("Confirmaci�n de material de estudio colgado en el curso:");
            for(MaterialEstudio materialEstudio: profesor1.getMaterialesEstudioProfesor()){ /*Hay que poner esta sentencia siempre despu�s del profesor, ya que si el profesor a�n no ha creado el material de Estudio, 
            y por tanto a�n no se ha guardado en la lista de materiales de estudio del curso, c�mo vamos a poder mostras el contenido de esta lista*/
            curso1.a�adirMaterialEstudioProfesorEnListaMaterialesEstudioCurso(materialEstudio, "Aprender JavaScript desde cero");
            }
            //Para visualizar el listado de materiales de estudio del curso creados y a�adidos por el profesor1 
            System.out.println("\nEstos son los materiales de estudios que has a�adido al curso:");
            for(MaterialEstudio materialEstudio: curso1.getMaterialEstudio()){
            System.out.println(materialEstudio.getNombre()+ " - " + materialEstudio.getTipo());
            }
            
            System.out.println(" ");
            System.out.println("Ex�menes:");
            //Para que el examen sin respuesta se a�ada al listado de examenes del curso 
            System.out.println("Estos son los examenes sin respuesta que has a�adido al curso:");
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
            
            System.out.println(" ");
            
            System.out.println("Plataformas E-learnings:");
            
            //Para visualizar la plataforma Learning que se ha a�adido en el curso1:
            System.out.println("En este curso, tienes disponible el acceso a la siguiente Plataforma:");
            for(PlataformaLearning plataformaLearning: curso1.getContenidoPlataformaLearning()){
            System.out.println(plataformaLearning.getNombre()+ " - " + plataformaLearning.getTipo()+ " - " + plataformaLearning.getUrl() + " - " + plataformaLearning.getContenido());
            }
            //Para visualizar la plataforma Learning que se ha a�adido en el curso1:
            System.out.println("En este curso, tienes disponible el acceso a la siguiente Plataforma:");
            for(PlataformaLearning plataformaLearning: curso2.getContenidoPlataformaLearning()){
            System.out.println(plataformaLearning.getNombre()+ " - " + plataformaLearning.getTipo()+ " - " + plataformaLearning.getUrl() + " - " + plataformaLearning.getContenido());
            }
        
            
       
         
            
            
           
            
            
       
        
        
        
       
            
     
        
        
        
    }
    
}
