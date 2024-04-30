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
public class Calificacion {
    private String asignatura;
    private double nota;
    
    public Calificacion (String asignatura, double nota) {
    this.asignatura = asignatura;
    this.nota = nota;
    }
    
    public String getAsignaturaCalificacion() {
    return asignatura;
    }
    
    public double getNotaCalificacion() {
    return nota;
    }
}
