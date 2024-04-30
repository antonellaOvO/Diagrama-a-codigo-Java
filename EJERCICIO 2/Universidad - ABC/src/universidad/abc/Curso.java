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
public class Curso {
    private String nombre;
    private String codigo;
    private String nombreProfesor;
    private static List<Curso> todosLosCursos = new ArrayList<>();
    private List<MaterialEstudio> materialesEstudio;
    private List<Tarea> tareas; 
    private List<Examen> examenes; 
    private List<PlataformaLearning> contenidoPlataformaLearning; 
   
    
    public Curso (String nombre, String codigo, String nombreProfesor) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.nombreProfesor = nombreProfesor;
        todosLosCursos.add(this); /*Para meter cada curso creado en el listado de todos los cursos cada vez que se crea un curso*/
        this.materialesEstudio = new ArrayList<>();
        this.tareas = new ArrayList<>();
        this.examenes = new ArrayList<>();
        this.contenidoPlataformaLearning = new ArrayList<>();
}
    
   public String getNombreCurso(){
   return nombre;
   }
   
   public String getCodigoCurso(){
   return codigo;
   }
   
   public String getNombreProfesorCurso(){
   return nombreProfesor;
   }
   
   public static List<Curso> getTodosLosCursos(){
   return todosLosCursos;
   }
   
   public List<MaterialEstudio> getMaterialEstudio(){
   return materialesEstudio;
   }
   
   public List<Tarea> getTareasCurso(){
   return tareas;
   }
   
   public List <PlataformaLearning> getContenidoPlataformaLearning(){
   return contenidoPlataformaLearning;
   }
   
   public void añadirMaterialEstudioProfesorEnListaMaterialesEstudioCurso(MaterialEstudio materialEstudio, String nombreMaterialEstudio){
    if(materialEstudio.getNombre().equals(nombreMaterialEstudio)){ 
    this.materialesEstudio.add(materialEstudio);
    System.out.println("El material de estudio colgado para el curso es: " + materialEstudio.getNombre() + " - de tipo: " + materialEstudio.getTipo());
        }
   } 
   
   public void añadirTareaAlListaTareas(Tarea tareaEnviada, String nombreTarea){
    if(tareaEnviada.getNombreTarea().equals(nombreTarea)){
    this.tareas.add(tareaEnviada);
    System.out.println("La tarea que justo se acaba de crear en este curso es la siguiente: " + tareaEnviada.getNombreTarea());
    }
    }
   
   public void añadirExamenesEnListaExamenesCurso(Examen examen){
    this.examenes.add(examen);
   }
   
   public void añadirPlataformaLearningaListacontenidoPlataformaLearning(PlataformaLearning plataformaLearning){
    this.contenidoPlataformaLearning.add(plataformaLearning);
    }
   
    
   
   
    
}
