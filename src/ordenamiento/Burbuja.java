/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import busquedas.Busquedas;

/**
 *
 * @author carli
 */
public class Burbuja {
     
    public long tInicio;
    public long tFinal;
    public long tTotal;

    public Burbuja() {
        this.tFinal = 0;
        this.tInicio = 0;
        this.tTotal = 0 ;
    }
    
    public void ordenar (int[] datos){
        this.tInicio = System.currentTimeMillis();
        ordenarDatos(datos);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
    }

    public long gettFinal() {
        return tFinal;
    }

    public long gettInicio() {
        return tInicio;
    }

    public long gettTotal() {
        return tTotal;
    }

    private void ordenarDatos(int[] datos) {   // mejor de los casos, 3 + 3n + 7n2 
        int i, j, tem;  //3
           for(i=0; i<datos.length-1; i++){ //3n
            for (j=0; j<datos.length-1; j++){  //3n(n)
                if ( datos[j+1] < datos[j] ) { // 4
                     tem = datos[j+1]; 
                    datos[j+1] = datos[j]; 
                    datos[j] = tem;   
                } 
            }  
        }
    }
}
