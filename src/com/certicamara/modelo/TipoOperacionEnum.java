package com.certicamara.modelo;
public enum TipoOperacionEnum {
    CONSUL_COMAND ("C", "Lista las opciones disponibles."), 
    CERRAR ("Q","Cerrar la aplicacion."),
    MOVER_VEH("MV","Mover el vehículo."),
    CONSUL_POS_VEH ("CPV","Consultar posicion actual del vehiculo."),
    ASIGNAR_FILAS ("AF","Asigna el numero de filas."),
    ASIGNAR_COLUMNAS ("AC","Asigna el numero de columnas.");
 
    private final String operacion; 
    private final String descripcion; 
 
    TipoOperacionEnum (String operacion, String descripcion) { 
        this.operacion = operacion;
        this.descripcion = descripcion;
    } 

	public String getOperacion() {
		return operacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

}