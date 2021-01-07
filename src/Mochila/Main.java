/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mochila;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author carli
 */
public class Main {
        public static void main(String[] args) throws IOException{
		ArrayList<Articulo> objetitos = LeerDatos.tokenizarDataSet();
		Mochila m3 = new Mochila(objetitos, 50); //Mochila(articulos,tamaño _W).
                m3.buscarSolucion();
                for(int i = 0; i<m3.getArtSolucion().size(); i++){
                    System.out.println(m3.getArtSolucion().get(i).getPeso()+","+m3.getArtSolucion().get(i).getBeneficio());
                }
                Mochila m4 = new Mochila(objetitos, 100);
                m4.buscarSolucion();
                for(int i = 0; i<m4.getArtSolucion().size(); i++){
                    System.out.println(m4.getArtSolucion().get(i).getPeso()+","+m4.getArtSolucion().get(i).getBeneficio());
                }
                Mochila m5 = new Mochila(objetitos, 250);
                m5.buscarSolucion();
                for(int i = 0; i<m5.getArtSolucion().size(); i++){
                    System.out.println(m5.getArtSolucion().get(i).getPeso()+","+m5.getArtSolucion().get(i).getBeneficio());
                }
                Mochila m = new Mochila(objetitos, 300); //Mochila(articulos,tamaño _W).
                m.buscarSolucion();
                for(int i = 0; i<m.getArtSolucion().size(); i++){
                    System.out.println(m.getArtSolucion().get(i).getPeso()+","+m.getArtSolucion().get(i).getBeneficio());
                }
                Mochila m1 = new Mochila(objetitos, 450);
                m1.buscarSolucion();
                for(int i = 0; i<m1.getArtSolucion().size(); i++){
                    System.out.println(m1.getArtSolucion().get(i).getPeso()+","+m1.getArtSolucion().get(i).getBeneficio());
                }
                Mochila m2 = new Mochila(objetitos, 500);
                m2.buscarSolucion();
                for(int i = 0; i<m2.getArtSolucion().size(); i++){
                    System.out.println(m2.getArtSolucion().get(i).getPeso()+","+m2.getArtSolucion().get(i).getBeneficio());
                }
                
                
	}
}
