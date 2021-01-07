/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa20201;

import busquedas.BusquedaSecuencial;
import busquedas.GeneradorDatos;
import busquedas.Busquedas;
import graficar.GraficaCom;
import graficar.Grafica;
import graficar.Vector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import ordenamiento.Burbuja;
import ordenamiento.BurbujaOptimizada;
import ordenamiento.InsertSort;
import ordenamiento.MergeSort;
import ordenamiento.QuickSort;

/**
 *
 * @author carli
 */
public class AA20201 {
     public static void main(String[] args) {
         
        // TODO code application logic here
       
        int n= 10000;
        int[] aux1;
        int[] aux;
        int[] burbuja;
        int[] Insert;
        int[] Merge;
        int[] BurbujaOp;
        int[] Quick;
        double[] tiemposBur = new double[n];
        double[] tiemposIns = new double[n];
        double[] tiemposMer = new double[n];
        double[] tiemposBurOp = new double[n];
        double[] tiemposQuick = new double[n];
        
        Burbuja b = new Burbuja();
        //Burbuja b1 = new Burbuja();
        InsertSort is = new InsertSort();
        MergeSort ms = new MergeSort();
        QuickSort qs = new QuickSort();
        BurbujaOptimizada bo = new BurbujaOptimizada();
        //aux1 = GeneradorDatos.generarArregloIntPeorCaso(n, 1000);
          
       for(int x = 0; x<n ;x++){
           aux = GeneradorDatos.generarArregloIntPeorCaso(x, 1000);
           //burbuja = Arrays.copyOfRange(aux, 0, aux.length);
           //Insert = Arrays.copyOfRange(aux, 0, aux.length);
           Merge = Arrays.copyOfRange(aux, 0, aux.length);
           //BurbujaOp = Arrays.copyOfRange(aux, 0, aux.length);
           Quick = Arrays.copyOfRange(aux, 0, aux.length);
           
           /*b.ordenar(burbuja);
           tiemposBur[x] = (int)b.gettTotal();
           
           is.ordenar(Insert);
           tiemposIns[x] = (int)is.gettTotal();*/
           
           ms.ordenar(Merge);
           tiemposMer[x] = (int)ms.gettTotal();
           
           qs.ordenar(Quick);
           tiemposQuick[x] = (int)qs.gettTotal();
           
           /*bo.ordenar(BurbujaOp);
           tiemposBurOp[x] = (int)bo.gettTotal();*/
        }
     
         Grafica grafica1 = new Grafica("Tamaño", "Tiempo", "Comparación Peor Caso, MergeSort VS QuickSort");
         //grafica1.agregarSerie("Burbuja", tiemposBur);
          //grafica1.agregarSerie("InsertSort", tiemposIns);
          grafica1.agregarSerie("MergeSort", tiemposMer);
          
         // grafica1.agregarSerie("BurbujaOpt", tiemposBurOp);
          grafica1.agregarSerie("QuickSort", tiemposQuick);
          grafica1.crearGrafica();
         grafica1.muestraGrafica();
       
       
    }
}
