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
public class test {
    public static void main(String args[]){
        int[] posible;
        int cheque = 1578;
        posible = new int[]{1000,20,1,10,5,2,50,100,200,500};
        Cambio nuevo = new Cambio(cheque,posible);
        nuevo.devolverCambio();
        System.out.println("El cambio con menor número de monedas de "+cheque+" es: ");
        for(int i=0; i<posible.length; i++){
            for(int j=0; j<2; j++){
                System.out.print(""+nuevo.cambio[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
