/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mochila;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author carli
 */
public class Mochila{
        private ArrayList<Articulo> articulos;
        private ArrayList<Articulo> artSolucion;
	private int[][] mBeneficios;
	private int pesoSoportado;
	private int maximaSatisfaccion;
        private int maxBenefit;
        
	public Mochila(ArrayList<Articulo> articulos, int pesoSoportado) {
		this.articulos = articulos;
                this.pesoSoportado = pesoSoportado;
                generadorMatriz();
	}
        private void generadorMatriz() {

        this.mBeneficios = new int[this.articulos.size() + 1][this.pesoSoportado + 1]; 
        for (int i = 0; i <= this.articulos.size(); i++){ 
            this.mBeneficios[i][0] = 0;
        }
        for (int x = 0; x <= this.pesoSoportado; x++){ 
            this.mBeneficios[0][x] = 0;
        }
    }

	public void buscarSolucion() {

        for (int i = 1; i <= this.articulos.size(); i++) {
            for (int w = 0; w <= this.pesoSoportado; w++) {
                if (this.articulos.get(i - 1).getPeso() <= w) {  //Validar que el articulos tenga espacio en la mochila
         if ((this.articulos.get(i - 1).getBeneficio() + this.mBeneficios[i - 1][w - this.articulos.get(i - 1).getPeso()]) > this.mBeneficios[i - 1][w]){ ////Sumamos el valor del articulo y el beneficio maximo anterior y compararlo a ver si es mayor al anterior                    
             this.mBeneficios[i][w] = (int) this.articulos.get(i - 1).getBeneficio() + this.mBeneficios[i - 1][w - this.articulos.get(i - 1).getPeso()]; //remplazamos el nuevo mejor beneficio
                    } else {
                        this.mBeneficios[i][w] = this.mBeneficios[i - 1][w]; //mantenemos el anterior mejor beneficio
                    }
                } else {
                    this.mBeneficios[i][w] = this.mBeneficios[i - 1][w];  //mantenemos el anterior mejor beneficio
                }
            }
        }

        this.maxBenefit = (int) this.mBeneficios[articulos.size()][this.pesoSoportado]; //regresamos el beneficio maximo
        this.artSolucion = new ArrayList<>();

        int i = this.articulos.size();
        int j = this.pesoSoportado;
        int pesoT = 0;
        while(i>0 && j>0){
            if(this.mBeneficios[i][j] != this.mBeneficios[i-1][j]){
                pesoT = this.mBeneficios[i-1][j];
                i=i-1;
                j=j-this.articulos.get(i).getPeso();  
                this.artSolucion.add(this.articulos.get(i));
            }else{
                i=i-1;
            }
        }
         System.out.println("MAXIMOS BENEFICIO: "+this.maxBenefit+"--------------------------------");
        /*System.out.println("Matriz de Beneficios");
        for (int k = 0; k < this.articulos.size() + 1; k++) {
            for (int l = 0; l < this.pesoSoportado + 1; l++) {
                System.out.print(this.mBeneficios[k][l] + ", ");
            }
            System.out.println();
        }*/
    }

    public ArrayList<Articulo> getArtSolucion() {
        return artSolucion;
    }
    
}
