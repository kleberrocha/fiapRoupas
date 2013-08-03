package br.com.fiap.loja;

import java.util.Scanner;

public class LojaFreeShop {

	
	public static void main(String[] args) {
		
		MoedaEstrangeiraProxy converter = new MoedaEstrangeiraProxy();
		
		System.out.println("Digite o valor em Dólar: ");
		
		
		try {
			
			Scanner teclado = new Scanner(System.in);
			
			int valorDolar = teclado.nextInt();		
		
			int valorReal = converter.converterDolar(valorDolar);
			
			System.out.println("Valor em Real: "+ valorReal);
			
		} catch (Exception e) {
			
			System.out.println("Erro. Tente Mais tarde!");
			
		}
		
		
		
		
	}

}
