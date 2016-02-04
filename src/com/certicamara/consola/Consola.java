package com.certicamara.consola;
import java.util.Scanner;

import com.certicamara.comando.ListadoComandoConsola;
import com.certicamara.comando.Operacion;
import com.certicamara.comando.OperacionFabrica;
import com.certicamara.modelo.TableroVehiculo;


public class Consola {

	private static Scanner sc;

	/**
	 * Main del programa
	 * @param args
	 */
	public static void main(String[] args) {
		boolean consolaEjecutando = true;
		sc = new Scanner(System.in);
		ListadoComandoConsola listadoComandoConsola = new ListadoComandoConsola();
		TableroVehiculo tableroVehiculo = new TableroVehiculo();
		listadoComandoConsola.ejecutar();
		System.out.println(); 
		while (consolaEjecutando){
			 System.out.print("Por favor ingrese un comando: "); 
		     String comando = sc.nextLine(); 
		     procesarComando(comando, tableroVehiculo);
		     consolaEjecutando = tableroVehiculo.isConsolaEjecutando();
		}
	}

	/**
	 * Procesa comando ingresado por el usuario
	 * @param comando
	 * @param tableroVehiculo
	 */
	public static void procesarComando(String comando, TableroVehiculo tableroVehiculo) {
		OperacionFabrica operacionFabrica = new OperacionFabrica();
		Operacion operacion = operacionFabrica.getOperacion(comando.trim().toUpperCase(), tableroVehiculo);
		if (operacion != null) {
			operacion.ejecutar();
	      }
	}

}
