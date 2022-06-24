/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte{
    double promedioSueldos;
    ArrayList<Docente> lista;
    
    public ReporteDocente(String codigo) {
        super(codigo);
    }
    
    public void establecerLista(ArrayList<Docente> listado){
        lista = listado;
    }
    
    public void establecerPromedioSueldos(){
        double suma = 0;
        
        for (int i = 0; i < lista.size(); i++) {
            suma = lista.get(i).getSueldo() + suma;
        }
        
        promedioSueldos = suma / lista.size();
    }
    
    public ArrayList<Docente> obtenerLista(){
        return lista;
    }  
    
    public double obtenerPromedioSueldos(){
        return promedioSueldos;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("%s - %.2f", lista , obtenerPromedioSueldos() );
        
        return cadena;
    }
    
}
