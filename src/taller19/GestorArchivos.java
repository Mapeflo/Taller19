/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller19;

/**
 *
 * @author marya
 */
public class GestorArchivos {
    
    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    
    public void subir(String nombre, String contenido){
        almacenamiento.guardar(nombre, contenido);
    }
    public String descargar(String nombre){
      return  almacenamiento.recuperar(nombre);   
    }
}
