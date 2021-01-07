/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import interfaces.Fibonacci;

/**
 *
 * @author carli
 */
public class FibonacciDinamicoRe {
    public long tInicio;
    public long tFinal;
    public long tTotal;
    
    public FibonacciDinamicoRe(){
        
    }
    
    public FibonacciDinamicoRe(long tInicio, long tFinal, long tTotal) {
        this.tInicio = tInicio;
        this.tFinal = tFinal;
        this.tTotal = tTotal;
    }
    
    public int[] calcularSerie (int datos,int[] guardao){
        int[] arreglito = new int[datos];
        /*for(int i=0; i<arreglito.length; i++){
            int[] guardadin = new int[i+1];
            arreglito[i] = fibonacci(i,guardadin);
        }*/
        this.tInicio = System.currentTimeMillis();
        fibonacci(datos,guardao);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
        return arreglito;
    }
    
    
    public int fibonacci(int n,int[] guardao) {
        
        if(n<=1)
            return 1;
        if (guardao[n]==0)
            guardao[n]=fibonacci(n-1,guardao)+fibonacci(n-2,guardao);
        return guardao[n];
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
