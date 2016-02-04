package com.certicamara.comando;

import com.certicamara.modelo.TableroVehiculo;

public class PosicionVehiculo implements Operacion {
	
	private TableroVehiculo tableroVehiculo;
	
	/**
	 * Constructor
	 * @param tableroVehiculo
	 */
	public PosicionVehiculo(TableroVehiculo tableroVehiculo) {
		super();
		this.tableroVehiculo = tableroVehiculo;
	}


	/**
	 * Consulta posicion del vehiculo
	 */
	public void ejecutar() {
		tableroVehiculo.consultarPosicion();
	}
}