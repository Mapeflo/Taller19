/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller19;

/**
 *
 * @author marya
 */
public class AlmacenamientoNube implements Almacenamiento {
    
    @Override
    public void guardar(String nombre, String contenido){
        System.out.println("Subido a la nube: " + nombre + " - Contenido: " + contenido);
    }
    @Override
    public String recuperar(String nombre){
        System.out.println("Descargado desde la nube: " + nombre);
        return "Contenido desde la nube" + nombre;
    }  
}
