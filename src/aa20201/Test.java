/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa20201;

import fibonacci.FibonacciDinamicoIt;
import fibonacci.FibonacciDinamicoRe;
import fibonacci.FibonacciIterativo;
import fibonacci.FibonacciRecursivo;
import graficar.Grafica;

/**
 *
 * @author carli
 */
public class Test {
    public static void main(String[] args){
        FibonacciIterativo fi = new FibonacciIterativo();
        int n = 10000;
        int[] Itera;
        int[] Recursi;
        int[] DinIte;
        int[] DinRe;
        int[] guardao = new int[n+1];
        //fi.fibonacci(7);
        double[] tiemposI = new double[n];
        double[] tiemposR = new double[n];
        double[] tiemposDI = new double[n];
        double[] tiemposDR = new double[n];
        FibonacciRecursivo fr = new FibonacciRecursivo();
        FibonacciDinamicoIt f2 = new FibonacciDinamicoIt();
        FibonacciDinamicoRe f3 = new FibonacciDinamicoRe();
        
        //DinRe = f3.calcularSerie(n,guardao);
        for(int x = 0; x<n ;x++){
           Itera = fi.calcularSerie(x);   
           tiemposI[x] = (int)fi.gettTotal();
           
        }
        /*for(int x = 0; x<n ;x++){
           
           Recursi = fr.calcularSerie(x);
           tiemposR[x] = (int)fr.gettTotal();
           
        }*/
        for(int x = 0; x<n ;x++){
           
           DinIte = f2.calcularSerie(x);
           tiemposDI[x] = (int)f2.gettTotal();
           
        }
        for(int x = 0; x<n ;x++){
           int[] guardadin = new int[x+1];
           DinRe = f3.calcularSerie(x,guardadin);
           tiemposDR[x] = (int)f3.gettTotal();
        }
 
        
        Grafica grafica1 = new Grafica("Tamaño", "Tiempo", "Comparación entre FIBONACCIS");
         grafica1.agregarSerie("Iterativo", tiemposI);
          //grafica1.agregarSerie("Recursivo", tiemposR);
          grafica1.agregarSerie("DinámicoIterativo", tiemposDI);
          grafica1.agregarSerie("DinámicoRecursivo", tiemposDR);
          grafica1.crearGrafica();
         grafica1.muestraGrafica();
    }
}
