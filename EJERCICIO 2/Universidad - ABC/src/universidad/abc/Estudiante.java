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
public class Estudiante extends Usuario {
private List<Curso> cursosInscritos;
private List<Tarea> tareasEnviadas;
private List<Calificacion> calificacionesRecibidas;
private List<PublicacionForo> foroPublicaciones;/*cuidado porque este atributo es el mismo que tiene Profesor!- quizás habría que meterla en Usuario*/

public Estudiante(String nombre, String apellido, String correo, String contrasena, String rol, int telefono, boolean autenticacionDosFactores, List<Curso> cursosInscritos, List<Tarea> tareasEnviadas,List<Calificacion> calificacionesRecibidas, List<PublicacionForo> foroPublicaciones) {
        super(nombre, apellido, correo, contrasena, rol, telefono, autenticacionDosFactores);
        this.cursosInscritos = cursosInscritos;
        this.tareasEnviadas = tareasEnviadas;
        this.calificacionesRecibidas = calificacionesRecibidas;
        this.foroPublicaciones = foroPublicaciones; /*cuidado porque este atributo es el mismo que tiene Profesor!- quizás habría que meterla en Usuario*/
    }

}
