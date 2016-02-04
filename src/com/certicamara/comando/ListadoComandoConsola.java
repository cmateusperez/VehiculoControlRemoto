package com.certicamara.comando;

import com.certicamara.modelo.TipoOperacionEnum;

public class ListadoComandoConsola implements Operacion {

	/**
	 * Muestra comandos disponibles en pantalla
	 */
	public void ejecutar() {
		for (TipoOperacionEnum operacion : TipoOperacionEnum.values()) {
			System.out.println(operacion.getOperacion() + " - "
					+ operacion.getDescripcion());
		}
	}
}