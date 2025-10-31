/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller19;

/**
 *
 * @author marya
 */
public class GestorAutenticacion {
    
    private ServicioAutenticacion servicio;

    public GestorAutenticacion(ServicioAutenticacion servicio) {
        this.servicio = servicio;
    }
    
    public boolean login(String usuario, String contraseña){
        return servicio.autenticar(usuario, contraseña);
    } 
}
