package com.certicamara.comando;

import com.certicamara.modelo.TableroVehiculo;

public class AsignacionMaxFila implements Operacion {
	
	private TableroVehiculo tableroVehiculo;
	
	/**
	 * Constructor
	 * @param tableroVehiculo
	 */
	public AsignacionMaxFila(TableroVehiculo tableroVehiculo) {
		super();
		this.tableroVehiculo = tableroVehiculo;
	}


	/**
	 * Asigna maximo fila
	 */
	public void ejecutar() {
		tableroVehiculo.asignarMaxFila();
	}
}