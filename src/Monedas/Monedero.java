/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monedas;

/**
 *
 * @author carli
 */
public class Monedero {
    private int position;
    private int valor;
    
    public Monedero(){
        
    }
    public Monedero(int position, int valor){
        this.position = position;
        this.valor = valor;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
