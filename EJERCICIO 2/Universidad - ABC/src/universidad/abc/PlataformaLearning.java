/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad.abc;

/**
 *
 * @author anto_
 */
public class PlataformaLearning {
    private String nombre;
    private String tipo;
    private String url;
    private String contenido;

    public PlataformaLearning(String nombre, String tipo, String url, String contenido) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.url = url;
        this.contenido = contenido;
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getUrl() {
        return url;
    }
    
    public String getContenido() {
        return contenido;
    }
   
 
    
    
}


