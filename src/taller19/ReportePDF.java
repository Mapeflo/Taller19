/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller19;

/**
 *
 * @author marya
 */
public class ReportePDF implements GeneradorReporte {
    
    @Override
    public String generar(String datos){
        System.out.println("Generando archivo PDF");
        return "Reporte PDF: " + datos;
    }
}
