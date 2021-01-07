/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedas;

import java.util.Random;

/**
 *
 * @author carli
 */
public class GeneradorDatos {
     // "aleatorio"
    public static int[] generarArregloInt(int x, int dim, int bound){
        int[] arreglo = new int[dim];
        Random ran = new Random();
       
        for(int y=0; y < dim; y++){
            arreglo[y] =ran.nextInt(bound);
        }
        int pos = ran.nextInt(dim);
        arreglo[pos] = x;
       return arreglo;
    }
     // peor de los casos / unico elemento
  /*  public static int[] generarArregloIntPeorCaso(int x, int dim, int bound){
        
    }*/
   
    // genera numeros aleatorio en base a un valor x que no queremos que genere
    public static int generarNumeroAleatorioControlado (int x, int bound){
        Random ran = new Random();
        int aux = ran.nextInt(bound);
        while(aux==x){
         aux = ran.nextInt(bound);
        }
        return aux;
    }

    public static int[] generarArregloIntPeorCaso(int x, int dim, int bound) {
        int[] arreglo = new int[dim];
              
        for(int y=0; y < dim; y++){
            int j = generarNumeroAleatorioControlado(x, bound);
            arreglo[y] = j;
        }
        arreglo[arreglo.length-1] = x;
       return arreglo;
    }
    public static int[] generarArregloIntMejorCaso(int x, int dim, int bound) {
        int[] arreglo = new int[dim];
         arreglo[0] = x;    
        for(int y=1; y < dim; y++){
            int j = generarNumeroAleatorioControlado(x, bound);
            arreglo[y] = j;
        }
        
       return arreglo;
    }
    public static int[] generarArregloIntMedioCaso(int x, int dim, int bound) {
        int[] arreglo = new int[dim];
            
        for(int y=0; y < dim; y++){
            int j = generarNumeroAleatorioControlado(x, bound);
            arreglo[y] = j;
        }
        arreglo[dim/2]=x;
       return arreglo;
    }
    public static int[] generarArregloInt( int n, int bound){
        int[] arreglo = new int[n];
        Random ran = new Random();
       for(int y=0; y < n; y++){
            arreglo[y] =ran.nextInt(bound);
        }
       return arreglo;
    }
    public static int[] generarArregloIntMejorCaso( int n, int bound){
        int[] arreglo = new int[n];
        int i,key, j; 
        Random ran = new Random();
       for(int y=0; y < n; y++){
            arreglo[y] =ran.nextInt(bound);
            
        }
        for (i = 1; i < arreglo.length; i++){ //  3n  =  10n
            key = arreglo[i]; 
            j = i-1;      
            while (j >= 0 && arreglo[j] > key){  
                arreglo[j + 1] = arreglo[j]; 
                j = j - 1;  
            }  
            arreglo[j + 1] = key;   
        } 
       return arreglo;
    }
    public static int[] generarArregloIntPeorCaso( int n,int bound){
        int[] arreglo = new int[n];
        int i,key, j; 
        Random ran = new Random();
        for(int y=0; y < n; y++){
            arreglo[y] =ran.nextInt(bound);
            
        }
        for (i = 1; i < arreglo.length; i++){ //  3n  =  10n
            key = arreglo[i]; 
            j = i-1;      
            while (j >= 0 && arreglo[j] < key){  
                arreglo[j + 1] = arreglo[j]; 
                j = j - 1;  
            }  
            arreglo[j + 1] = key;   
        }
        return arreglo; 
    }
}
