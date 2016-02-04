package com.certicamara.comando;

import com.certicamara.modelo.TableroVehiculo;

public class MovimientoVehiculo implements Operacion {
	
	private TableroVehiculo tableroVehiculo;
	
	/**
	 * Constructor
	 * @param tableroVehiculo
	 */
	public MovimientoVehiculo(TableroVehiculo tableroVehiculo) {
		super();
		this.tableroVehiculo = tableroVehiculo;
	}

	/**
	 * Mueve vehiculo
	 */
	public void ejecutar() {
		tableroVehiculo.moverVehiculo();
	}
}