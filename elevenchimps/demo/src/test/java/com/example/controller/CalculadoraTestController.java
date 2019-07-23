package com.example.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.bussiness.CalculadoraBusinessTest;
import com.example.constants.ConstantsTest;
import com.example.rest.CalculadoraController;

@RunWith(MockitoJUnitRunner.class)
public class CalculadoraTestController {
	
	@Mock
	private CalculadoraController calculadoraController;
	
	@Autowired
	private CalculadoraBusinessTest calculadoraBussiness;
	
	@Before
	public void setUp() {
		calculadoraController = new CalculadoraController();
	}

	@Test
	public void deve_realizar_calculo_de_dieta_default() throws Exception{
//		calculadoraBussiness.calculaPreco(ConstantsTest.mValorMinimoInicialDefault, ConstantsTest.tValorMaximoInicialDefault, ConstantsTest.aFator, ConstantsTest.xQuilosPorMes,ConstantsTest.constanteZeroVirgulaSeteCinco);
		double m = ConstantsTest.mValorMinimoInicialDefault;
		double t = ConstantsTest.tValorMaximoInicialDefault;
		double x = ConstantsTest.xQuilosPorMes;
		double a = ConstantsTest.aFator;
		double elevado = Math.pow(ConstantsTest.constanteZeroVirgulaSeteCinco,x);
		double tMenosM = t - m;
		double aMenosM = a*m;
		//tem que testar o coeficiente
		if(a < 0 || a > 1) {
			throw new Exception();
		}
		
//		(0,9*(10))*(0.31640625)+0,9*10
//
//		9*0.31640625
//
//		2,84765625 + 0,9*10
//
//		11,85
//
//		x4
//
//		47

		//aqui testa se o valor todo do primeira parte do calculo é maior ou = a m
		double calculo = a*((tMenosM)*(elevado));
//		f(x) = if(((a*(t-m))(0,75^x) + a*m)>=m;
//			 ((a*(t-m))(0,75^x) + a*m);
//			 m)
		
		if(calculo >= m) {
			System.out.println(calculo+"  Parou aqui no metodo");
		}
	}
	
	@Test
	public void deve_realizar_calculo_de_dieta_com_parametros(){
		
	}
	
	@Test
	public void deve_retornar_valor_da_dieta() {
		
	}
	
	@Test
	public void deve_receber_post_com_valor_maximo() {
		
	}
	
	@Test
	public void deve_receber_post_com_valor_minimo() {
		
	}
	
	@Test
	public void deve_receber_post_valor_maximo_e_minimo() {
		
	}

}
