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
        Profesor profesor1 = new Profesor ("Juan", "García", "juan@gmail.com", "profesor123", "profesor", 931234567, true);
        Estudiante estudiante1 = new Estudiante ("Antonio", "García", "antonio@gmail.com", "profesor123", "estudiante", 931234567, true);
        
        /*Curso*/
            //Cursos creados- creados así ya que no es el profesor quién crea los cursos, sino que ya están creados en la plataforma por defecto
            Curso curso1 = new Curso("Aprender Java", "ABCD", "Pablo Rodríguez");
            Curso curso2 = new Curso("Aprender a lidiar con el síndrome del Impostor", "EFGH", "Fernando Tejón");
        /*Profesor*/
            System.out.println("PROFESORES:");
            //Para crear cuenta del profesor1
            profesor1.crearCuenta();
            
            //Para iniciar sesión del profesor1
            profesor1.iniciarSesion(profesor1.getCorreo(), profesor1.getContrasena());
            
            //Para que el profesor1 cree tareas
            profesor1.crearTareaYGuardarEnListaTareasCreadas("Tarea 1 - Calcular Operaciones", "Matemáticas", "1 x 2 =2, pero y 5 x 2 = ?", "por entregar");
            profesor1.crearTareaYGuardarEnListaTareasCreadas("Tarea 2 - Resolver Ecuaciones", "Matemáticas", "Si x = 1; ¿Cuánto vale y si x + y = 5?", "por entregar");
            //Para visualizar el listado de tareas asignadas (creadas por el profesor1)
            System.out.println("Estas son las tareas que has creado:");
            for(Tarea tarea: profesor1.getTareasCreadas()){
            System.out.println("Tareas: " + tarea.getNombreTarea()+ " - perteneciente a la asignatura " + tarea.getAsignaturaTarea());
            }
            
            //Para que el profesor1 cree Calificacion y la guarde en su Lista de Calificaciones
            profesor1.crearCalificacionYGuardarlaEnLista("Matemáticas", 7.5);
            profesor1.crearCalificacionYGuardarlaEnLista("Biología", 8.5);
           //Para visualizar el listado de calificaciones enviadas (creadas por el profesor1):
            System.out.println("Estas son las calificaciones que has creado:");
            for(Calificacion calificacion: profesor1.getCalificacionesPublicadas()){
            System.out.println("Calificacion - asignatura: " + calificacion.getAsignaturaCalificacion()+ " - cuya nota es de: " + calificacion.getNotaCalificacion());
            }
            //Para que el profesor1 cree un publicación en el foro y la guarde en su Lista de Publicaciones
            profesor1.crearPublicacionYGuardarEnLista("Me parece muy productivo que los alumnos interactúen en el foro y puedan ayudarse entre ellos. Seguid así! Ánimo!");
            profesor1.crearPublicacionYGuardarEnLista("Por favor, abstenerse de ese tipo de comentarios en este foro. Muchas gracias.");
            //Para visualizar el listado de comentarios/publicaciones del foro creados por el profesor1 
            System.out.println("Estas son tus publicaciones:");
            for(Foro publicacionForo: profesor1.getForoPublicaciones()){
            System.out.println(publicacionForo.getComentarioPublicacionForo() + "\n" );
            }
            //Para eliminar la publicacion del foro creado por el profesor1 
            System.out.println("Esta es tu publicación que ha sido eliminada:");
            profesor1.eliminarPublicacionProfesor(profesor1, 0);
            //Para comprobar que la publicación del foro de profesor1 ha sido eliminada, ya que aparece el otro comentario que ahora ocuparía la posición 0, si ponemos posición 1 te dará error "out of bound of index..."
            System.out.println("Esta es la publicación queda tras eliminar la anterior publicación: " + profesor1.getForoPublicaciones().get(0).getComentarioPublicacionForo()+ "\n");
            
            //Para que el profesor1 cree el material de estudio y se añada al listado de materiales de estudio del profesor1
            profesor1.crearMaterialEstudioYGuardarlaEnListaMateriales("Matar a un ruiseñor", "Libro(lectura)");
            //Para que el material de Estudio se añada al listado de materiales de estudio del curso 
            System.out.println("Estos son los materiales de estudios que has añadido al curso:");
            for(MaterialEstudio materialEstudio: profesor1.getMaterialesEstudioProfesor()){ /*Hay que poner esta sentencia siempre después del profesor, ya que si el profesor aún no ha creado el material de Estudio, 
            y por tanto aún no se ha guardado en la lista de materiales de estudio del curso, cómo vamos a poder mostras el contenido de esta lista*/
            curso1.añadirMaterialEstudioEnListaMaterialesEstudio(materialEstudio);
            System.out.println("\n" + materialEstudio.getNombre()+ " - " + materialEstudio.getTipo());
            }
            
            //Para que el profesor1 cree el examen CON/SIN respuestas y se añada al listado de examenes del profesor1
            profesor1.crearExamenesSinRespuestasYGuardarlaEnLista("¿Qué conlleva el static en Java?");
            profesor1.crearExamenesConRespuestasYGuardarlaEnLista("¿Qué conlleva el static en Java?", "Static permite que puedas llamar a ese atributo o método desde la clase, ya que se convierte en una variable de clase que comparten todas las instancias de esa clase.");
            
            //Para que el examen sin respuesta se añada al listado de examenes del curso 
            System.out.println("\nEstos son los examenes sin respuesta que has añadido al curso:");
            for(Examen examen: profesor1.getExamenesSinRespuestaProfesor()){ 
            curso1.añadirExamenesEnListaExamenesCurso(examen);
            System.out.println("La pregunta del examen es: " + examen.getPreguntaExamen() + " y aquí no habría respuesta y su valor sería null: " + examen.getRespuestaExamen());
            }
             //Para que el examen con respuesta se añada al listado de examenes del curso 
            System.out.println("\nEstos son los examenes con respuesta que has añadido al curso:" );
            for(Examen examen: profesor1.getExamenesConRespuestaProfesor()){ 
            curso1.añadirExamenesEnListaExamenesCurso(examen);
            System.out.println("La pregunta del examen es: " + examen.getPreguntaExamen() + " y su respuesta sería: " + examen.getRespuestaExamen());
            }
            
            
        /*Para espaciar estudiante y profesor en el OUTPUT*/
        System.out.println("");
            
        /*Estudiante*/
            System.out.println("ESTUDIANTES:");
            //Para crear cuenta estudiante1
            estudiante1.crearCuenta();
            //Para iniciar sesión del estudiante1
            estudiante1.iniciarSesion(estudiante1.getCorreo(), estudiante1.getContrasena());
            //Para añadir el curso1 y curso2 (creados arriba con la creación de la instancia de Curso) en la list de cursosInscritos*/
            estudiante1.añadirListaCursosInscritos(curso1);
            estudiante1.añadirListaCursosInscritos(curso2);
            //Para visualizar el listado de cursos en los que el estudiante1 está inscrito- como arriba se han creado 2 cursos (curso1, curso2), sólo aparecerán esos 2 cursos
            System.out.println("Lista de los cursos del estudiante " + estudiante1.getNombre() + ":");
            for(Curso curso: estudiante1.getCursos()){
            System.out.println("Curso: " + curso.getNombreCurso()+ " - Impartido por el profesor: " + curso.getNombreProfesorCurso());
            }
             //Para añadir la tarea que crea el profesor a la lista de tareas del alumno confirmar al estudiante que tareas tiene asignadas (que se las ha enviado el profesor):*/
            for(Tarea tarea: profesor1.getTareasCreadas()){ /*Hay que poner esta sentencia siempre después del profesor, ya que si el profesor aún no ha creado la tarea, 
            y por tanto aún no se ha guardado en la lista de tareasCreadas del profesor, cómo vamos a poder meter esta lista en la lista de tareasEnviadas del estudiante*/
            estudiante1.añadirListaTareasEnviadas(tarea);
            }
             //Para confirmar al estudiante que ha enviado una tarea:
            estudiante1.enviarTarea(profesor1); 
            //Para añadir la calificacion que crea el profesor a la lista de calificaciones del alumno:
            for(Calificacion calificacion: profesor1.getCalificacionesPublicadas()){ /*Hay que poner esta sentencia siempre después del profesor, ya que si el profesor aún no ha creado la calificacion, 
            y por tanto aún no se ha guardado en la lista de calificacionesPublicadas del profesor, cómo vamos a poder meter esta lista en la lista de calificacionesRecibidas del estudiante*/
            estudiante1.recibirCalificacion(calificacion);
            }
            
            //Para que el estudiante1 cree una publicación en el Foro y la guarde en su Lista de Publicaciones 
            estudiante1.crearPublicacionYGuardarEnLista("Alguien podría ayudarme con este problema de matemáticas?");
            estudiante1.crearPublicacionYGuardarEnLista("Tranquilo, a mi también me cuesta mucho esto de aprender Java");
            //Para visualizar el listado de comentarios/publicaciones creados por el estudiante1
            System.out.println("Estas son tus publicaciones en el foro:");
            for(Foro publicacionForo: estudiante1.getForoPublicaciones()){
            System.out.println(publicacionForo.getComentarioPublicacionForo() + "\n" );
            }
            
            //Para eliminar la publicacion del foro creado por el estudiante1 
            System.out.println("Esta es tu publicación que ha sido eliminada:");
            estudiante1.eliminarPublicacionEstudiante(estudiante1, 0);
            //Para comprobar que la publicación del foro de estudiante1 ha sido eliminada, ya que aparece el otro comentario que ahora ocuparía la posición 0, si ponemos posición 1 te dará error "out of bound of index..."
            System.out.println("Esta es la publicación queda tras eliminar la anterior publicación: " + estudiante1.getForoPublicaciones().get(0).getComentarioPublicacionForo() + "\n");
        
        
        /*Curso*/
            //Para añadir las tareas creadas por el profesor en el curso correspondiente:
            for(Tarea tarea: profesor1.getTareasCreadas()){ /*Hay que poner esta sentencia siempre después del profesor, ya que si el profesor aún no ha creado la tarea, 
            y por tanto aún no se ha guardado en la lista de tareasCreadas del profesor, cómo vamos a poder meter esta lista en la lista de tareas del curso*/
            curso1.añadirTareaAlListaTareas(tarea);
            }
            
            
       
        
         
         
         
            
            
           
            
            
       
        
        
        
       
            
     
        
        
        
    }
    
}
