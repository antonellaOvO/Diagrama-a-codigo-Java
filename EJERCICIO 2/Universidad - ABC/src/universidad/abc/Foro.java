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
public class Foro {
    private String comentario;
    private String autor;
    private String contenido;
    private Date fechaPublicacion;
    
    public Foro(String comentario){
        this.comentario = comentario;
    }
    
    public String getComentarioPublicacionForo() {
    return comentario;
    }
    
    public String getAutorForo() {
    return autor;
    }
    
    public String getContenidoForo() {
    return contenido;
    }
    
    public Date getfechaPublicacionForo() {
    return fechaPublicacion;
    }
}
