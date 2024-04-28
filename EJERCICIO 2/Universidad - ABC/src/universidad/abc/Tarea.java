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
public class Tarea {
    private String nombre;
    private String asignatura;
    private String contenido;
    private String status;
    
    public Tarea(String nombre, String asignatura, String contenido, String status){
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.contenido = contenido;
        this.status = status;
    }
    
    public String getNombreTarea(){
    return nombre;
    }
    
    public String getAsignaturaTarea(){
    return asignatura;
    }
    
    public String getContenidoTarea(){
    return contenido;
    }
    
    public String getStatusTarea(){
    return status;
    }
    
    public void setStatusTarea(String nuevoStatus){
        this.status = nuevoStatus;
    }
}
