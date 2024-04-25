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
public class Profesor extends Usuario {
private List<Curso> cursosImpartidos;
private List<Tarea> tareasAsignadas;
private List<Calificacion> calificacionesPublicadas;
private List<PublicacionForo> foroPublicaciones;  /*cuidado porque este atributo es el mismo que tiene Estudiante!- quizás habría que meterla en Usuario*/

public Profesor(String nombre, String apellido, String correo, String contrasena, String rol, int telefono, boolean autenticacionDosFactores, List<Curso> cursosImpartidos, List<Tarea> tareasAsignadas,List<Calificacion> calificacionesPublicadas, List<PublicacionForo> foroPublicaciones) {
        super(nombre, apellido, correo, contrasena, rol, telefono, autenticacionDosFactores);
        this.cursosImpartidos = cursosImpartidos;
        this.tareasAsignadas = tareasAsignadas;
        this.calificacionesPublicadas = calificacionesPublicadas;
        this.foroPublicaciones = foroPublicaciones; /*cuidado porque este atributo es el mismo que tiene Estudiante!- quizás habría que meterla en Usuario*/

}

}
