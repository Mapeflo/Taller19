/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller19;

/**
 *
 * @author marya
 */
public class AlmacenamientoLocal implements Almacenamiento {
    
    @Override
    public void guardar(String nombre, String contenido) {
        System.out.println("Guardado local: " + nombre + " - Contenido: " + contenido);
    }
    
    @Override
    public String recuperar (String nombre) {
        System.out.println("Recuperado local: " + nombre);
        return "Contenido desde disco local: " + nombre;
    } 
}
