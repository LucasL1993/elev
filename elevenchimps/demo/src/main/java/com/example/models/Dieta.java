package com.example.models;

import java.io.Serializable;

public class Dieta implements Serializable {
	
	private static final long serialVersionUID = 1406171186317898492L;
	private String caloriasPorGrama;
	private String coeficiente;
	
	//ainda não tenho certeza onde vai
	private String caloria;
	private String grama;
	
	//dados de formula
	
	private String xQuantidadeProduzidaEmQuilos;
	private String aCoeficienteParaCalculoDoPeso;
	private String mPrecoMinimoQuiloDieta;
	private String tPrecoMaximoQuiloDieta;
}
