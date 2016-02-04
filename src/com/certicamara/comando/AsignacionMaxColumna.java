package com.certicamara.comando;

import com.certicamara.modelo.TableroVehiculo;

public class AsignacionMaxColumna implements Operacion {
	
	private TableroVehiculo tableroVehiculo;

	/**
	 * Constructor 
	 * @param tableroVehiculo
	 */
	public AsignacionMaxColumna(TableroVehiculo tableroVehiculo) {
		super();
		this.tableroVehiculo = tableroVehiculo;
	}

	/**
	 * Asignar maximo columna
	 */
	public void ejecutar() {
		tableroVehiculo.asignarMaxColumna();
	}
}