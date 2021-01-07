/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monedas;

import java.util.ArrayList;

/**
 *
 * @author carli
 */
public class Cambio {
    public int monedero;
    public int[] posibleCambio;
    public int[][] cambio;
    
    //boolean exito=true;
    
    public Cambio(int monedero, int[] posibleCambio){
        this.monedero = monedero;
        this.posibleCambio = posibleCambio;
        this.cambio = new int[posibleCambio.length][2];
    }
    
    public void inicializarCambio(){
        for(int i=0; i<posibleCambio.length; i++){
            for(int j = 0; j<1; j++){
                cambio[i][j] = posibleCambio[i];
            }
        }
        for(int i=0; i<posibleCambio.length; i++){
            for(int j = 1; j<2; j++){
                cambio[i][j] = 0;
            }
        }
    }
    
    public void devolverCambio(){
        inicializarCambio();
       
        ArrayList<Monedero> moneditas;
        while(monedero > 0){
           Monedero monedaMenos;
           moneditas = new ArrayList();
           for(int i=0; i<posibleCambio.length; i++){
                if(posibleCambio[i]<=monedero){
                    moneditas.add(new Monedero(i,posibleCambio[i]));
                }
            }
           monedaMenos = validar(moneditas);
           cambio[monedaMenos.getPosition()][1]+=1;
           monedero = monedero-monedaMenos.getValor();
        }      
    }

    private Monedero validar(ArrayList<Monedero> moneditas) {
        //Monedero regreso;
        int max = moneditas.get(0).getValor();
        int aux=0;
        for(int i=0; i<moneditas.size(); i++){
            int maxAux = moneditas.get(i).getValor();
                if(maxAux>max){
                    max = maxAux;
                    aux = i;
                }
        }
        return moneditas.get(aux);
    }
}
