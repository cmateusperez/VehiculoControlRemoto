package com.certicamara.comando;

import com.certicamara.modelo.TableroVehiculo;
import com.certicamara.modelo.TipoOperacionEnum;

public class OperacionFabrica {

	/**
	 * Metodo para obtener el tipo de operacion
	 * @param comando
	 * @param tableroVehiculo
	 * @return
	 */
	public Operacion getOperacion(String comando, TableroVehiculo tableroVehiculo) {
		if (comando == null) {
			return null;
		}
		if (comando.equalsIgnoreCase(TipoOperacionEnum.CONSUL_COMAND.getOperacion())) {
			return new ListadoComandoConsola();
		} else if (comando.equalsIgnoreCase(TipoOperacionEnum.CERRAR.getOperacion())) {
			return new TerminaConsola(tableroVehiculo);
		} else if (comando.equalsIgnoreCase(TipoOperacionEnum.CONSUL_POS_VEH.getOperacion())) {
			return new PosicionVehiculo(tableroVehiculo);
		} else if (comando.startsWith(TipoOperacionEnum.MOVER_VEH.getOperacion())) {
			tableroVehiculo.setInstruccion(comando);
			return new MovimientoVehiculo(tableroVehiculo);
		} else if (comando.startsWith(TipoOperacionEnum.ASIGNAR_FILAS.getOperacion())) {
			tableroVehiculo.setInstruccion(comando);
			return new AsignacionMaxFila(tableroVehiculo);
		} else if (comando.startsWith(TipoOperacionEnum.ASIGNAR_COLUMNAS.getOperacion())) {
			tableroVehiculo.setInstruccion(comando);
			return new AsignacionMaxColumna(tableroVehiculo);
		} else {
			return new OperacionIndefinida();
		}

	}
}