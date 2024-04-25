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
public class Foro {
    private String autor;
    private String contenido;
    private Date fechaPublicacion;
    private List<Comentario> comentarios; /*Debiera crear entonces la clase Comentario?*/
    
    public Foro(String autor, String contenido, Date fechaPublicacion, List<Comentario> comentarios) {
        this.autor = autor;
        this.contenido = contenido;
        this.fechaPublicacion = fechaPublicacion;
        this.comentarios = comentarios;
    }
}
