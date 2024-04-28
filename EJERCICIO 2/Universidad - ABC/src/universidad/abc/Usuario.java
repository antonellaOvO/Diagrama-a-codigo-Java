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
      
     
      
    public boolean crearCuenta() {
        if (this.correo.contains("@") && contrasena.matches(".*\\d.*")) {
            System.out.println("Enhorabuena, tu cuenta con correo " + this.correo + " ha sido creada");
            return true; 
        } else { /* Hay que poner el else{} ya que si la condición del if no se cumple, el método no devuelve ningún valor, lo cual está en conflicto con la declaración del método como boolean*/
            return false;
    }
          
    } 
      
    public boolean iniciarSesion(String correo, String contrasena) {
        if (correo.contains("@") && contrasena.matches(".*\\d.*")) { /*No ponemos contrasena.matches("[0-9]")- verifica si la contraseña contiene solo un dígito del 0 al 9. Esto significa que la contraseña debe ser exactamente un dígito. Si deseas verificar si la contraseña contiene al menos un dígito, debes usar "\\d+" en lugar de "[0-9]".*/
            System.out.println("Has iniciado sesión en el Portal del " + rol + " con tu correo " + correo); /**Esta sentencia hay que ponerla antes del reutrn, ya que después de que el método devuelve true, hay un bloque de código que intenta imprimir un mensaje usando System.out.println. Sin embargo, este bloque nunca se ejecutará porque el método ya ha salido al encontrar la instrucción return true;. Esto se debe a que las instrucciones después de un return en un método no se ejecutan. */
            return  true;
        } else { /* Hay que poner el else{} ya que si la condición del if no se cumple, el método no devuelve ningún valor, lo cual está en conflicto con la declaración del método como boolean*/
            System.out.println("Lo sentimos, pero tu correo o contraseña son incorrectos");
            return false;
        }
    }
     
      
}
