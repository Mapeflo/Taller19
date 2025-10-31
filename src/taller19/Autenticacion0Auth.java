/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller19;

/**
 *
 * @author marya
 */
public class Autenticacion0Auth implements ServicioAutenticacion {
    
    @Override
    public boolean autenticar(String usuario, String contraseña){
        return "usuarioxxxx".equals(usuario) && "token".equals(contraseña);    
    }    
}
