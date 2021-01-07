/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mochila;

/**
 *
 * @author carli
 */
public class Articulo {
        private int beneficio;
	private int peso;
	private int satisfaccion;

	public Articulo(int beneficio, int peso, int satisfaccion) {
		this.beneficio = beneficio;
		this.peso = peso;
		this.satisfaccion = satisfaccion;
	}
        
        public Articulo(int beneficio, int peso) {
		this.beneficio = beneficio;
		this.peso = peso;
	}
        
	public int getBeneficio() {
		return beneficio;
	}

	public int getPeso() {
		return peso;
	}

	public int getSatisfaccion() {
		return satisfaccion;
	}
}
