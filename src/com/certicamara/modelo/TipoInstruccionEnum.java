package com.certicamara.modelo;

public enum TipoInstruccionEnum {
    BASE(" "), 
    CONJUNTO_COORDENADA (";"),
    SIMPLE_COORDENADA(",");

    private TipoInstruccionEnum(String instruccion) {
		this.instruccion = instruccion;
	}
 
    private final String instruccion;

	public String getInstruccion() {
		return instruccion;
	}
 

  


}