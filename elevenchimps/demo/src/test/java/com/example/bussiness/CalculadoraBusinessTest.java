package com.example.bussiness;

import org.springframework.stereotype.Component;

public class CalculadoraBusinessTest {

	public double calculaPreco(double mValorMinimoInicialDefault, double tValorMaximoInicialDefault, double aFator,
			double xQuilosPorMes, double constanteZeroVirgulaSeteCinco) throws Exception {
		double m = mValorMinimoInicialDefault;
		double t = tValorMaximoInicialDefault;
		double x = xQuilosPorMes;
		double a = aFator;
		double elevado = Math.pow(constanteZeroVirgulaSeteCinco,x);
		double tMenosM = t - m;
		double aMenosM = a*m;
		//tem que testar o coeficiente
		if(a < 0 || a > 1) {
			throw new Exception();
		}
		

		//aqui testa se o valor todo do primeira parte do calculo é maior ou = a m
		double calculo = a*((tMenosM)*(elevado));
//		f(x) = if(((a*(t-m))(0,75^x) + a*m)>=m;
//			 ((a*(t-m))(0,75^x) + a*m);
//			 m)
		
		if(calculo >= m) {
			
		}
		
//		double elevado = Math.pow(constanteZeroVirgulaSeteCinco,x);
		
		
		
		if(true) {
			
		}
		
		
		return a;
	}

}
