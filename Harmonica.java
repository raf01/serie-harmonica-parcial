/* 
	Programa para mostrar o somatório parcial da série
	harmônica divergente descrita pela equação
	
		$$\sum_{n=1}^{\infty} \frac{1}{n}$$,
	
	com precisão decimal selecionável.
	
	@author Rafael G. Pontes
	@date 1 de fevereiro de 2016.
	
*/

import java.math.*;

public class Harmonica {
	public static void main (String[] args) {
		int K = 1000000000; // Testa até o bilionésimo termo da série.
		int PRECISAO_DECIMAL = 1000; // Precisão decimal
		BigDecimal sum = new BigDecimal("0.0");
		BigDecimal numerador = new BigDecimal("1.0");
		for(int i = 1; i <= K; i++){
			BigDecimal denominador = new BigDecimal(String.format("%d.0", i));
			sum = sum.add(numerador.divide(denominador, PRECISAO_DECIMAL, RoundingMode.HALF_UP));
			System.out.println("Com " + i + " termos, a soma parcial é " + sum + ".\n");
		}
		System.out.println("O somatório da série harmônica até seu termo de número "
			+ K + " é " + sum + ".");
	}

}
