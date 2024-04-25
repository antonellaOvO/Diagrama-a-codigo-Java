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
public class Usuario {
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;
    private String rol;
    private int telefono;
    private boolean autenticacionDosFactores;
    
    public Usuario (String nombre, String apellido, String correo, String contrasena, String rol, int telefono, boolean autenticacionDosFactores) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.rol = rol;
        this.telefono = telefono;
        this.autenticacionDosFactores = autenticacionDosFactores;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public String getContrasena(){
        return contrasena;
    }
    
    public String getRol(){
        return rol;
    }
    
    public int getTelefono(){
        return telefono;
    }
    
    public boolean getAutenticacionDosFactores(){
        return autenticacionDosFactores;
    }
    
     public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
     
      public void setApellido(String nuevoApellido){
        this.apellido = nuevoApellido;
    }
      
      public void setCorreo(String nuevoCorreo){
        this.correo = nuevoCorreo;
    }
      
      public void setContrasena(String nuevoContrasena){
        this.contrasena = nuevoContrasena;
    }
      
      public void setRol(String nuevoRol){
        this.rol = nuevoRol;
    }
      
      public void setTelefono(int nuevoTelefono){
        this.telefono = nuevoTelefono;
    }
      
      public void setAutenticacionDosFactores(boolean nuevoAutenticacionDosFactores){
        this.autenticacionDosFactores = nuevoAutenticacionDosFactores;
    }
      
      public boolean iniciarSesion(String correo, String contrasena) {
          /*if()....- return boolean- remember return something because it's not void*/
      }
      
      public boolean crearCuenta() {
      /*if()....- return boolean - remember return something because it's not void*/
      }
}
