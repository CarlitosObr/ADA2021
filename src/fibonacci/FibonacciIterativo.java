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
public class FibonacciIterativo implements Fibonacci{
    public long tInicio;
    public long tFinal;
    public long tTotal;
    public FibonacciIterativo(){
        
    }
    public FibonacciIterativo(long tInicio, long tFinal, long tTotal) {
        this.tInicio = tInicio;
        this.tFinal = tFinal;
        this.tTotal = tTotal;
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
    
    public int[] calcularSerie (int datos){
        int[] arreglito = new int[datos];
        /*for(int i=0; i<arreglito.length; i++){
            arreglito[i] = fibonacci(i);
        }*/
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
        assert n > 0;
        int f0 = 1;
        int f1 = 1;
        for (int i = 2; i <= n; i++) {
            int fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }
        return f1;
    }
    
}
