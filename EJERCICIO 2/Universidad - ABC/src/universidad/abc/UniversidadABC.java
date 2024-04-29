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
        Estudiante estudiante1 = new Estudiante ("Antonio", "García", "antonio@gmail.com", "estudiante123", "estudiante", 931234567, true);
        
        /*Curso*/
            //Cursos creados- creados así ya que no es el profesor quién crea los cursos, sino que ya están creados en la plataforma por defecto
            Curso curso1 = new Curso("Aprender Java", "ABCD", "Pablo Rodríguez");
            Curso curso2 = new Curso("Aprender a lidiar con el síndrome del Impostor", "EFGH", "Fernando Tejón");
        
        /*Plataforma E-learning*/
            //Plataformas E-Learnings ya creadas (porque son sistemas externos)
            PlataformaLearning plataformaLearning1 = new PlataformaLearning("Plataforma Youtube", "Videos de ayuda", "www.Youtube.com", "etc, etc, etc.....");
            PlataformaLearning plataformaLearning2 = new PlataformaLearning("Plataforma Udemy", "Cursos en Streaming gratis para estudiantes", "www.Udemy.com", "etc, etc, etc.....");
            //Plataformas E-Learnings ya creadas (porque son sistemas externos)
            curso1.añadirPlataformaLearningaListacontenidoPlataformaLearning(plataformaLearning1);
            curso2.añadirPlataformaLearningaListacontenidoPlataformaLearning(plataformaLearning2);
        
        /*Profesor*/
            System.out.println("PROFESORES:");
            //Para crear cuenta del profesor1
            profesor1.crearCuenta();
            
            //Para iniciar sesión del profesor1
            profesor1.iniciarSesion(profesor1.getCorreo(), profesor1.getContrasena());
            
            //Para que el profesor añada cursos en su Lista de Cursos impartidos:
            profesor1.añadirListaCursosImpartidos(curso1);
            profesor1.añadirListaCursosImpartidos(curso2);
            //Para visualizar el listado de cursos impartidos por el profesor1:
            System.out.println("\nEstos son los cursos que has elegido impartir: ");
            for(Curso curso: profesor1.getCursosImpartidos()){
            System.out.println("Curso: " + curso.getNombreCurso()+ " - con código: " + curso.getCodigoCurso());
            }
            
            //Para que el profesor1 cree tareas
            profesor1.crearTareaYGuardarEnListaTareasCreadas("Tarea 1 - Calcular Operaciones", "Matemáticas", "1 x 2 =2, pero y 5 x 2 = ?", "por entregar");
            profesor1.crearTareaYGuardarEnListaTareasCreadas("Tarea 2 - Resolver Ecuaciones", "Matemáticas", "Si x = 1; ¿Cuánto vale y si x + y = 5?", "por entregar");
            //Para visualizar el listado de tareas asignadas (creadas por el profesor1)
            System.out.println("\nEstas son las tareas que has creado:");
            for(Tarea tarea: profesor1.getTareasCreadas()){
            System.out.println("Tareas: " + tarea.getNombreTarea()+ " - perteneciente a la asignatura " + tarea.getAsignaturaTarea() + ". Su estado es: " + tarea.getStatusTarea());
            }
            
            System.out.println(" ");
           
            //Para que el profesor1 cree Calificacion y la guarde en su Lista de Calificaciones
            profesor1.crearCalificacionYGuardarlaEnLista("Matemáticas", 7.5);
            profesor1.crearCalificacionYGuardarlaEnLista("Biología", 8.5);
           //Para visualizar el listado de calificaciones enviadas (creadas por el profesor1):
            System.out.println("\nEstas son las calificaciones que has creado:");
            for(Calificacion calificacion: profesor1.getCalificacionesPublicadas()){
            System.out.println("Calificacion - asignatura: " + calificacion.getAsignaturaCalificacion()+ " - cuya nota es de: " + calificacion.getNotaCalificacion());
            }
            /*Foro*/
            //Para que el profesor1 cree un publicación en el foro y la guarde en su Lista de Publicaciones
            profesor1.crearPublicacionYGuardarEnLista("Me parece muy productivo que los alumnos interactúen en el foro y puedan ayudarse entre ellos. Seguid así! Ánimo!");
            profesor1.crearPublicacionYGuardarEnLista("Por favor, abstenerse de ese tipo de comentarios en este foro. Muchas gracias.");
            
            //Para visualizar el listado de comentarios/publicaciones del foro creados por el profesor1 
            System.out.println("\nEstas son tus publicaciones:");
            for(Foro publicacionForo: profesor1.getForoPublicaciones()){
            System.out.println(publicacionForo.getComentarioPublicacionForo() + "\n" );
            }
            //Para eliminar la publicacion del foro creado por el profesor1 
            System.out.println("Esta es tu publicación que ha sido eliminada:");
            profesor1.eliminarPublicacionProfesor(profesor1, 0);
            //Para comprobar que la publicación del foro de profesor1 ha sido eliminada, ya que aparece el otro comentario que ahora ocuparía la posición 0, si ponemos posición 1 te dará error "out of bound of index..."
            System.out.println("Esta es la publicación que queda tras eliminar la anterior publicación: " + profesor1.getForoPublicaciones().get(0).getComentarioPublicacionForo()+ "\n");
            
            //Para que el profesor1 cree el material de estudio y se añada al listado de materiales de estudio del profesor1
            profesor1.crearMaterialEstudioYGuardarlaEnListaMateriales("Aprender JavaScript desde cero", "Libro(lectura)");
            profesor1.crearMaterialEstudioYGuardarlaEnListaMateriales("Ejercicios JavaScript para tontos", "Video (visualizar video");
            //Para visualizar/comprobar que los materiales de estudio están añadidos en la lista de materiales de estudio del profeso1:
            System.out.println("Estos son los materiales de estudios que has creado:");
            for(MaterialEstudio materialEstudio: profesor1.getMaterialesEstudioProfesor()){
            System.out.println(materialEstudio.getNombre()+ " - " + materialEstudio.getTipo());
            }
           
            
            //Para que el profesor1 cree los exámenes CON/SIN respuestas y se añada al listado de examenes del profesor1
            profesor1.crearExamenesSinRespuestasYGuardarlaEnLista("¿Qué conlleva el static en Java?");
            profesor1.crearExamenesConRespuestasYGuardarlaEnLista("¿Qué conlleva el static en Java?", "Static permite que puedas llamar a ese atributo o método desde la clase, ya que se convierte en una variable de clase que comparten todas las instancias de esa clase.");
            
            
            
        /*Para espaciar estudiante y profesor en el OUTPUT*/
        System.out.println("");
            
        /*Estudiante*/
            System.out.println("ESTUDIANTES:");
            
            //Para crear cuenta estudiante1
            estudiante1.crearCuenta();
            
            //Para iniciar sesión del estudiante1
            estudiante1.iniciarSesion(estudiante1.getCorreo(), estudiante1.getContrasena());
            
            System.out.println(" ");
            
            //Para añadir el curso1 y curso2 (creados arriba con la creación de la instancia de Curso) en la lista de cursosInscritos del Estudiante*/
            estudiante1.añadirListaCursosInscritos(curso1);
            estudiante1.añadirListaCursosInscritos(curso2);
            
            System.out.println(" ");
            
            //Para visualizar el listado de cursos en los que el estudiante1 está inscrito- como arriba se han creado 2 cursos (curso1, curso2), sólo aparecerán esos 2 cursos
            System.out.println("Lista de los cursos del estudiante " + estudiante1.getNombre() + ":");
            for(Curso curso: estudiante1.getCursos()){
            System.out.println("Curso: " + curso.getNombreCurso()+ " - Impartido por el profesor: " + curso.getNombreProfesorCurso());
            }
            
            System.out.println(" ");
            
             //Para añadir la tarea que crea el profesor a la lista de tareas del alumno y confirmar al estudiante que tareas tiene asignadas (que se las ha enviado el profesor):
            for(Tarea tarea: profesor1.getTareasCreadas()){ /*Hay que poner esta sentencia siempre después del profesor, ya que si el profesor aún no ha creado la tarea, 
            y por tanto aún no se ha guardado en la lista de tareasCreadas del profesor, cómo vamos a poder meter esta lista en la lista de tareasEnviadas del estudiante*/
            estudiante1.añadirListaTareasEnviadas(tarea);
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
            
             //Para añadir la calificacion que crea el profesor a la lista de calificaciones del alumno: - Opción 1
            for(Calificacion calificacion: profesor1.getCalificacionesPublicadas()){ /*Hay que poner esta sentencia siempre después del profesor, ya que si el profesor aún no ha creado la calificacion, 
            y por tanto aún no se ha guardado en la lista de calificacionesPublicadas del profesor, cómo vamos a poder meter esta lista en la lista de calificacionesRecibidas del estudiante*/
            estudiante1.recibirCalificacion(calificacion);
            }
             System.out.println(" ");
            
            //Para calificar al estudiante1 y confirmale al estudiante1 la calificación asignada - Opción 2 - una opción más rentable que la opción 1
            for(Tarea tarea : profesor1.getTareasCreadas()){
                profesor1.calificarEstudiante(estudiante1, tarea , 5.6);
               /// profesor1.calificarEstudiante(estudiante, tarea , 5.6);
            }
            
            System.out.println(" ");
            
            //Para que el estudiante1 cree una publicación en el Foro y la guarde en su Lista de Publicaciones 
            estudiante1.crearPublicacionYGuardarEnLista("Alguien podría ayudarme con este problema de matemáticas?");
            estudiante1.crearPublicacionYGuardarEnLista("Tranquilo, a mi también me cuesta mucho esto de aprender Java");
            //Para visualizar el listado de comentarios/publicaciones creados por el estudiante1
            System.out.println("Estas son tus publicaciones en el foro:");
            for(Foro publicacionForo: estudiante1.getForoPublicaciones()){
            System.out.println(publicacionForo.getComentarioPublicacionForo());
            }
            
            System.out.println(" ");
            
            //Para eliminar la publicacion del foro creado por el estudiante1 
            System.out.println("Esta es tu publicación que ha sido eliminada:");
            estudiante1.eliminarPublicacionEstudiante(estudiante1, 0);
            
             System.out.println(" ");
           
            //Para comprobar que la publicación del foro de estudiante1 ha sido eliminada, ya que aparece el otro comentario que ahora ocuparía la posición 0, si ponemos posición 1 te dará error "out of bound of index..."
            System.out.println("Esta es la publicación que queda tras eliminar la anterior publicación: " + estudiante1.getForoPublicaciones().get(0).getComentarioPublicacionForo() + "\n");
        
        
        /*Curso*/
        
            System.out.println("DATOS CURSO:");
           
            System.out.println(" ");
            
            System.out.println("Tareas:");
            //Para añadir una de las tareas creadas por el profesor1 (específicamente Tarea 1) en el curso1:
            for(Tarea tarea: profesor1.getTareasCreadas()){ /*Hay que poner esta sentencia siempre después del profesor, ya que si el profesor aún no ha creado la tarea, 
            y por tanto aún no se ha guardado en la lista de tareasCreadas del profesor, cómo vamos a poder meter esta lista en la lista de tareas del curso*/
            curso1.añadirTareaAlListaTareas(tarea, "Tarea 1 - Calcular Operaciones");
            }
            
            //Para añadir una de las tareas creadas por el profesor1 (específicamente Tarea 2) en el curso1:
            for(Tarea tarea: profesor1.getTareasCreadas()){ /*Hay que poner esta sentencia siempre después del profesor, ya que si el profesor aún no ha creado la tarea, 
            y por tanto aún no se ha guardado en la lista de tareasCreadas del profesor, cómo vamos a poder meter esta lista en la lista de tareas del curso*/
            curso1.añadirTareaAlListaTareas(tarea, "Tarea 2 - Resolver Ecuaciones");
            }
            
            System.out.println(" ");
            
            System.out.println("Materiales de estudio:");
            //Para que el material de Estudio creado por el profesor (específicamente el material de estudio1 "Aprender JavaScript desde cero" se añada al listado de materiales de estudio del curso1 y para que el profesor reciba confirmación cada vez que crea un material de estudio 
            System.out.println("Confirmación de material de estudio colgado en el curso:");
            for(MaterialEstudio materialEstudio: profesor1.getMaterialesEstudioProfesor()){ /*Hay que poner esta sentencia siempre después del profesor, ya que si el profesor aún no ha creado el material de Estudio, 
            y por tanto aún no se ha guardado en la lista de materiales de estudio del curso, cómo vamos a poder mostras el contenido de esta lista*/
            curso1.añadirMaterialEstudioProfesorEnListaMaterialesEstudioCurso(materialEstudio, "Aprender JavaScript desde cero");
            }
            //Para visualizar el listado de materiales de estudio del curso creados y añadidos por el profesor1 
            System.out.println("\nEstos son los materiales de estudios que has añadido al curso:");
            for(MaterialEstudio materialEstudio: curso1.getMaterialEstudio()){
            System.out.println(materialEstudio.getNombre()+ " - " + materialEstudio.getTipo());
            }
            
            System.out.println(" ");
            System.out.println("Exámenes:");
            //Para que el examen sin respuesta se añada al listado de examenes del curso 
            System.out.println("Estos son los examenes sin respuesta que has añadido al curso:");
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
            
            System.out.println(" ");
            
            System.out.println("Plataformas E-learnings:");
            
            //Para visualizar la plataforma Learning que se ha añadido en el curso1:
            System.out.println("En este curso, tienes disponible el acceso a la siguiente Plataforma:");
            for(PlataformaLearning plataformaLearning: curso1.getContenidoPlataformaLearning()){
            System.out.println(plataformaLearning.getNombre()+ " - " + plataformaLearning.getTipo()+ " - " + plataformaLearning.getUrl() + " - " + plataformaLearning.getContenido());
            }
            //Para visualizar la plataforma Learning que se ha añadido en el curso1:
            System.out.println("En este curso, tienes disponible el acceso a la siguiente Plataforma:");
            for(PlataformaLearning plataformaLearning: curso2.getContenidoPlataformaLearning()){
            System.out.println(plataformaLearning.getNombre()+ " - " + plataformaLearning.getTipo()+ " - " + plataformaLearning.getUrl() + " - " + plataformaLearning.getContenido());
            }
        
            
       
         
            
            
           
            
            
       
        
        
        
       
            
     
        
        
        
    }
    
}
