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
public class FibonacciRecursivo implements Fibonacci{
    public long tInicio;
    public long tFinal;
    public long tTotal;
    
    public FibonacciRecursivo(){
        
    }
    
    public FibonacciRecursivo(long tInicio, long tFinal, long tTotal) {
        this.tInicio = tInicio;
        this.tFinal = tFinal;
        this.tTotal = tTotal;
    }
    
    public int[] calcularSerie (int datos){
        int[] arreglito = new int[datos];
        for(int i=0; i<arreglito.length; i++){
            arreglito[i] = fibonacci(i);
        }
        this.tInicio = System.currentTimeMillis();
        fibonacci(datos);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
        return arreglito;
    }
    
    @Override
    public int fibonacci(int n) {
        if (n < 0)
            throw new IllegalArgumentException();
        if (n <= 1)
            return 1;
        assert n > 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
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
