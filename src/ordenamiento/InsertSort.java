/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

/**
 *
 * @author carli
 */
public class InsertSort {
    public long tInicio;
    public long tFinal;
    public long tTotal;
    
    public InsertSort(){
        
    }
    public InsertSort(long tInicio, long tFinal, long tTotal) {
        this.tInicio = tInicio;
        this.tFinal = tFinal;
        this.tTotal = tTotal;
    }
    public void ordenar (int[] datos){
        this.tInicio = System.currentTimeMillis();
        ordenarDatos(datos);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
    }
    
    public void ordenarDatos(int[] datos){  // peor de los casos    3 + 10n + 10n2    O(n2)
        int i, key, j;  // 3
        for (i = 1; i < datos.length; i++){ //  3n  =  10n
            key = datos[i]; // 2
            j = i - 1;      // 2 
            while (j >= 0 && datos[j] > key){  // 4nn  =   10n2 
                datos[j + 1] = datos[j]; // 4 
                j = j - 1;  // 2
            }  
            datos[j + 1] = key;   // 3    
        } 
     }
    public long gettInicio() {
        return tInicio;
    }

    public void settInicio(long tInicio) {
        this.tInicio = tInicio;
    }

    public long gettFinal() {
        return tFinal;
    }

    public void settFinal(long tFinal) {
        this.tFinal = tFinal;
    }

    public long gettTotal() {
        return tTotal;
    }

    public void settTotal(long tTotal) {
        this.tTotal = tTotal;
    }
    
}
