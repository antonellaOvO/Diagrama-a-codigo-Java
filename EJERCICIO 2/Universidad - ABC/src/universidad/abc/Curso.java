/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad.abc;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author anto_
 */
public class Curso {
    private String nombre;
    private String codigo;
    private List<MaterialEstudio> materialesEstudio;
    private List<Tarea> tareas; /*Debiera crear entonces la clase Tarea?*/
    private List<Examen> examenes; /*Debiera crear entonces la clase Examen?*/
    private List<ClaseStreaming> clasesStreaming; /*Debiera crear entonces la clase ClaseStreaming?*/
    
    public Curso (String nombre, String codigo, List<MaterialEstudio> materialesEstudio, List<Tarea> tareas, List<Examen> examenes, List<ClaseStreaming> clasesStreaming) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.materialesEstudio = materialesEstudio;
        this.tareas = tareas;
        this.examenes = examenes;
        this.clasesStreaming = clasesStreaming;
}
    
}
