package com.certicamara.comando;

public class OperacionIndefinida implements Operacion {

	/**
	 * Comando no definido
	 */
	public void ejecutar() {
		System.out.println("Comando Indefinido");
	}
}