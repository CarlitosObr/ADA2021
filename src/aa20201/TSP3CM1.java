/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa20201;

import TSPD.AlgoritmoDijkstra;
import TSPD.Camino;

/**
 *
 * @author carli
 */
public class TSP3CM1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlgoritmoDijkstra aux;
        for (int x=0 ; x < 5;x++){
        aux = new AlgoritmoDijkstra(5);
        Camino c = aux.buscarCamino(x);
        System.out.println("Ci= "+x+" Distancia Total: "+c.getDistanciaRecorrida());
        
        }
        
        
    }
    
}

