/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePresencial extends Reporte{
    
    private ArrayList<EstudiantePresencial> lista;
    private double totalMatriculaPresencial;
    private double promedioGeneral;
    
    public ReportePresencial(String nombre, String carrera, String ciclo){
        super(nombre, carrera, ciclo);
        
    }
    
    public void establecerLista(ArrayList<EstudiantePresencial> listado){
        lista = listado;
    }
    
    public void establecerTotalMatriculasPresencial(){
        
        for (int i = 0; i < lista.size(); i++) {
            totalMatriculaPresencial = totalMatriculaPresencial + 
                    lista.get(i).obtenerMatriculaPresencial();
        }
    }
    
    public void establecerPromedioGeneral(){
        
        for (int i = 0; i < lista.size(); i++) {
            promedioGeneral = promedioGeneral + 
                    lista.get(i).obtenerPromedio();
        }
        promedioGeneral = promedioGeneral / lista.size();
    }
    
    public ArrayList<EstudiantePresencial> obtenerLista(){
        return lista;
    }
    
    public double obtenerTotalMatriculasDistancia(){
        return totalMatriculaPresencial;
    }
    
    public double obtenerPromedioGeneral(){
        return promedioGeneral;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s\nCarrera: %s \n"
                + "Ciclo: %s\n\n"
                + "Lista de Estudiantes\n", 
                nombre,
                carrera,
                ciclo);
        
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s\nNombre: %s\n"
                    + "Apellido: %s\n"
                    + "Identificación: %s\n"
                    + "Edad: %d\n"
                    + "Costo Crédito: %.2f\n"
                    + "Número de Creditos: %d\n"
                    + "Total Matricula: %.2f\n"
                    + "Promedio: %.3f\n" ,cadena, lista.get(i).obtenerNombresEstudiante(),
                    lista.get(i).obtenerApellidoEstudiante(), lista.get(i).obtenerIdentificacionEstudiante(),
                    lista.get(i).obtenerEdadEstudiante(), lista.get(i).obtenerCostoCredito(),
                    lista.get(i).obtenerNumeroCreditos(), lista.get(i).obtenerMatriculaPresencial(),
                    lista.get(i).obtenerPromedio());
        }
        
        cadena = String.format("%s\nEl total de matriculas es: %.2f\n"
                + "Promedio General: %.2f\n", cadena
                , obtenerTotalMatriculasDistancia(), obtenerPromedioGeneral());
        return cadena;
    }
    
}
