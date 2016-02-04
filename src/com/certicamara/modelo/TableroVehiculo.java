package com.certicamara.modelo;

public class TableroVehiculo {

	private boolean consolaEjecutando = true;
	private int xPosicion = 0;
	private int yPosicion = 0;
	private int xMaxPosicion = 10;
	private int yMaxPosicion = 10;
	private String instruccion;
	private Integer deltax;
	private Integer deltay;

	/**
	 * Muestra posicion del vehiculo
	 */
	public void consultarPosicion() {
		System.out.println("Posición Actual: " + "(" + yPosicion + ",  " + xPosicion + ")");
		System.out.println(); 
	}

	/**
	 * Operacion mover vehiculo
	 */
	public void moverVehiculo() {
		validarInstruccion(instruccion, TipoInstruccionEnum.BASE);
		consultarPosicion();
	}
	
	/**
	 * Asigna tamano fila
	 */
	public void asignarMaxFila(){
		String[] temp = instruccion.split(TipoInstruccionEnum.BASE.getInstruccion());
		int filas;
		if (temp.length == 2) {
			try {
				filas = Integer.parseInt(temp[1].trim());
				yMaxPosicion = filas;
			} catch (NumberFormatException e) {
				publicarMensajeError();
			}
		} else {
			publicarMensajeError();
		}
	}
	
	/**
	 * Asigna tamano de columna
	 */
	public void asignarMaxColumna(){
		String[] temp = instruccion.split(TipoInstruccionEnum.BASE.getInstruccion());
		int columnas;
		if (temp.length == 2) {
			try {
				columnas = Integer.parseInt(temp[1].trim());
				xMaxPosicion = columnas;
			} catch (NumberFormatException e) {
				publicarMensajeError();
			}
		} else {
			publicarMensajeError();
		}
	}
	
	/**
	 * Verifica instruccion ingresada
	 * @param instruccion
	 * @param tipoInstruccion
	 */
	private void validarInstruccion(String instruccion,
			TipoInstruccionEnum tipoInstruccion) {
		String[] temp = instruccion.split(tipoInstruccion.getInstruccion());
		if (tipoInstruccion == TipoInstruccionEnum.BASE) {
			if (temp.length == 2) {
				validarInstruccion(temp[1], TipoInstruccionEnum.CONJUNTO_COORDENADA);
			} else {
				publicarMensajeError();
			}
		} else if (tipoInstruccion == TipoInstruccionEnum.CONJUNTO_COORDENADA) {
			for (String coordenada : temp) {
				validarInstruccion(coordenada, TipoInstruccionEnum.SIMPLE_COORDENADA);
			}
		} else if (tipoInstruccion == TipoInstruccionEnum.SIMPLE_COORDENADA) {																	
			if (procesarCoordenada(temp)) {
				aplicarCoordenada();
			}
		} else {
			publicarMensajeError();
		}

	}

	/**
	 * Asigna posicion coordenada ingresada
	 */
	private void aplicarCoordenada() {
		if (xPosicion + deltax <= xMaxPosicion) {
			xPosicion = xPosicion + deltax;
		} else if (xPosicion + deltax > xMaxPosicion) {
			xPosicion = xPosicion + (xMaxPosicion - xPosicion);
			System.out.println("Se ha detenido el avance por salir de los límites");
		}
		if (yPosicion + deltay <= yMaxPosicion) {
			yPosicion = yPosicion + deltay;
		} else if (yPosicion + deltay > yMaxPosicion) {
			yPosicion = yPosicion + (yMaxPosicion - yPosicion);
			System.out.println("Se ha detenido el avance por salir de los límites");
		}
	}

	/**
	 * Traduce posicion ingresada
	 * @param temp
	 * @return
	 */
	private boolean procesarCoordenada(String[] temp) {
		boolean coordenadaValida = false;
		if (temp.length == 2) {
			try {
				deltax = Integer.parseInt(temp[0]);
				deltay = deltax;
				switch (temp[1]) {
				case "N":
					deltax = 0;
					coordenadaValida = true;
					break;
				case "S":
					deltay = deltay * -1;
					deltax = 0;
					coordenadaValida = true;
					break;
				case "E":
					deltay = 0;
					coordenadaValida = true;
					break;
				case "O":
					deltax = deltax * -1;
					deltay = 0;
					coordenadaValida = true;
					break;
				default:
					publicarMensajeError();
					coordenadaValida = false;
					break;
				}

			} catch (NumberFormatException e) {
				coordenadaValida = false;
				publicarMensajeError();
			}

		} else {
			coordenadaValida = false;
			publicarMensajeError();

		}
		return coordenadaValida;
	}

	/**
	 * Despliega error cuando el usuario ingresa una instruccion incorrecta
	 */
	private void publicarMensajeError() {
		System.out.println("Error en la instrucción ingresada!!!");
	}

	/**
	 * Metodo get Consola Ejecutandose
	 * @return
	 */
	public boolean isConsolaEjecutando() {
		return consolaEjecutando;
	}

	/**
	 * Metodo set Consolta Ejecutandose
	 * @param consolaEjecutando
	 */
	public void setConsolaEjecutando(boolean consolaEjecutando) {
		this.consolaEjecutando = consolaEjecutando;
	}

	/**
	 * Get xPosicion
	 * @return
	 */
	public int getxPosicion() {
		return xPosicion;
	}

	/**
	 * Set xPosicion
	 * @param xPosicion
	 */
	public void setxPosicion(int xPosicion) {
		this.xPosicion = xPosicion;
	}

	/**
	 * Get yPosicion
	 * @return
	 */
	public int getyPosicion() {
		return yPosicion;
	}

	/**
	 * Set yPosicion
	 * @param yPosicion
	 */
	public void setyPosicion(int yPosicion) {
		this.yPosicion = yPosicion;
	}

	/**
	 * GetxMaxPosicion
	 * @return
	 */
	public int getxMaxPosicion() {
		return xMaxPosicion;
	}

	/**
	 * Set xMaxPosicion
	 * @param xMaxPosicion
	 */
	public void setxMaxPosicion(int xMaxPosicion) {
		this.xMaxPosicion = xMaxPosicion;
	}

	/**
	 * Get xMaxPosicion
	 * @return
	 */
	public int getyMaxPosicion() {
		return yMaxPosicion;
	}

	/**
	 * Set yMaxPosicion
	 * @param yMaxPosicion
	 */
	public void setyMaxPosicion(int yMaxPosicion) {
		this.yMaxPosicion = yMaxPosicion;
	}

	/**
	 * Get Instruccion
	 * @return
	 */
	public String getInstruccion() {
		return instruccion;
	}

	/**
	 * Set Instruccion
	 * @param instruccion
	 */
	public void setInstruccion(String instruccion) {
		this.instruccion = instruccion;
	}
}