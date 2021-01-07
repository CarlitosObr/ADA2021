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
public class BurbujaOptimizada {
      
    public long tInicio;
    public long tFinal;
    public long tTotal;

    public BurbujaOptimizada() {
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

    private void ordenarDatos(int[] arreglo) {   // mejor de los casos, 3 + 3n + 7n2 
        for(int i = 0; i < arreglo.length - 1; i++)
            {
            for(int j = 0; j < arreglo.length - i-1; j++)
                 {
                   
                           
                if (arreglo[j] > arreglo[j + 1])
                {
                    int tmp = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = tmp;   
                }
            }
        }
    }
}
