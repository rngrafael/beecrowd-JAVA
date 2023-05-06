package application;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class URI1021 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		
		double valor = entrada.nextDouble();
		
		Double notas[] = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00, 
				1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
		
		
		Double[] quantidade = new Double[12];
		
		
		Double resto=valor;
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		
		
		if(valor > 0.00  && valor < 1000000.00) {
			for(int i=0; i<notas.length;i++) {
				quantidade[i] = resto/notas[i];
				resto=resto%notas[i];
			}
		}
		

		
		System.out.println("NOTAS:");
		for(int i=0; i<notas.length-6;i++) {
			int qtd = quantidade[i].intValue();
			String valorFormatado = df.format(notas[i]);
			System.out.println(qtd + " nota(s) de R$ " + valorFormatado);
		}
		
		
		System.out.println("MOEDAS:");
		for(int i=6; i<notas.length;i++) {
			int qtd = quantidade[i].intValue();
			String valorFormatado = df.format(notas[i]);
			System.out.println(qtd + " moeda(s) de R$ " + valorFormatado);

		}
		
		
		
		
		
		entrada.close();

	}

}
