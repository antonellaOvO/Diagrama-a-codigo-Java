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
    private List<Curso> todosLosCursos = new ArrayList<>();
    private List<MaterialEstudio> materialesEstudio;
    private List<Tarea> tareas; 
    private List<Examen> examenes; 
   
    
    public Curso (String nombre, String codigo, String nombreProfesor) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.nombreProfesor = nombreProfesor;
        todosLosCursos.add(this); /*Para meter cada curso creado en el listado de todos los cursos cada vez que se crea un curso*/
        this.materialesEstudio = new ArrayList<>();
        this.tareas = new ArrayList<>();
        this.examenes = new ArrayList<>();
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
   
   public List<MaterialEstudio> getMaterialEstudio(){
   return materialesEstudio;
   }
   
   public List<Tarea> getTareasCurso(){
   return tareas;
   }
   
   public void añadirMaterialEstudioEnListaMaterialesEstudio(MaterialEstudio materialEstudio){
    this.materialesEstudio.add(materialEstudio);
    System.out.println("El material de estudio colgado para este curso son: " + materialEstudio.getNombre() + "de tipo " + materialEstudio.getTipo());
   } 
   
   public void añadirTareaAlListaTareas(Tarea tareaEnviada){
    this.tareas.add(tareaEnviada);
    System.out.println("Las tareas de este curso son en total: " + tareaEnviada.getNombreTarea());
    }
   
   public void añadirExamenesEnListaExamenesCurso(Examen examen){
    this.examenes.add(examen);
   }
   
    
   
   
    
}
