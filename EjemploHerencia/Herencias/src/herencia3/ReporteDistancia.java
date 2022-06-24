/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3;

import java.util.ArrayList;

public class ReporteDistancia extends Reporte{
    
    private ArrayList<EstudianteDistancia> lista;
    private double totalMatriculaDistancia;
    
    public ReporteDistancia(String nombre, String carrera, String ciclo){
        super(nombre, carrera, ciclo);
        
    }
    
    public void establecerLista(ArrayList<EstudianteDistancia> listado){
        lista = listado;
    }
    
    public void establecerTotalMatriculasDistancia(){
        
        for (int i = 0; i < lista.size(); i++) {
            totalMatriculaDistancia = totalMatriculaDistancia + 
                    lista.get(i).obtenerMatriculaDistancia();
        }
    }
    
    public ArrayList<EstudianteDistancia> obtenerLista(){
        return lista;
    }
    
    public double obtenerTotalMatriculasDistancia(){
        return totalMatriculaDistancia;
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
                    + "Costo Asignatura: %.2f\n"
                    + "Número de Asignaturas: %d\n"
                    + "Total Matricula: %.2f\n" ,cadena, lista.get(i).obtenerNombresEstudiante(),
                    lista.get(i).obtenerCostoAsignatura(), lista.get(i).obtenerIdentificacionEstudiante(),
                    lista.get(i).obtenerEdadEstudiante(), lista.get(i).obtenerCostoAsignatura(),
                    lista.get(i).obtenerNumeroAsignaturas(), lista.get(i).obtenerMatriculaDistancia());
        }
        
        cadena = String.format("%s\nEl total de matriculas es: %.2f\n", cadena
                , obtenerTotalMatriculasDistancia());
        return cadena;
    }
    
}
