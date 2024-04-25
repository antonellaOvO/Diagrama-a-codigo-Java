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
public class MaterialEstudio {
    private String nombre;
    private String tipo;
    private String url;
    
    public MaterialEstudio (String nombre, String tipo, String url) {
         this.nombre = nombre;
         this.tipo = tipo;
         this.url = url;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public String getUrl(){
        return url;
    }
    
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    
    public void setTipo(String nuevoTipo){
        this.tipo = nuevoTipo;
    }
    
    public void setUrl(String nuevoUrl){
        this.url = nuevoUrl;
    }
}
