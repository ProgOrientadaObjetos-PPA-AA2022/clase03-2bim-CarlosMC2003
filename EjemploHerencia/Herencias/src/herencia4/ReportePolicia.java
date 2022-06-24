/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte{
    double promedioEdades;
    ArrayList<Policia> lista;
    
    public ReportePolicia(String codigo) {
        super(codigo);
    }
    
    public void establecerLista(ArrayList<Policia> listado){
        lista = listado;
    }
    
    public void establecerPromedioEdades(){
        double suma = 0;
        
        for (int i = 0; i < lista.size(); i++) {
            suma = lista.get(i).getEdad() + suma;
        }
        
        promedioEdades = suma / lista.size();
    }
    
    public ArrayList<Policia> obtenerLista() {
        return lista;
    }
    
    public double obtenerPromedioEdades(){
        return promedioEdades;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("%s - %.2f", lista , obtenerPromedioEdades() );
        
        return cadena;
    }
}
