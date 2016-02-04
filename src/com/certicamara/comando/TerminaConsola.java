package com.certicamara.comando;

import com.certicamara.modelo.TableroVehiculo;

/**
 * 
 * @author Carolina Mateus
 *
 */
public class TerminaConsola implements Operacion {
	private TableroVehiculo tableroVehiculo;

	/**
	 * 
	 * @param tableroVehiculo
	 */
	public TerminaConsola(TableroVehiculo tableroVehiculo) {
		this.tableroVehiculo = tableroVehiculo;
	}

	/**
	 * Finalizar ejecucion del programa
	 */
	public void ejecutar() {
		tableroVehiculo.setConsolaEjecutando(false);
		System.out.println("Programa terminado");
	}
}