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
public class Examen {
    private String pregunta;
    private String respuesta;
    
    public Examen(String pregunta){
        this.pregunta = pregunta;
    }

    public Examen(String pregunta, String respuesta){
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }
    
    public String getPreguntaExamen(){
    return pregunta;
    }
    
    public String getRespuestaExamen(){
    return respuesta;
    }
}


