package application;

import java.util.Scanner;

public class URI1018 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		int resto;
		if(numero > 0 && numero < 1000000) {
			int a = numero / 100;
			resto = numero % 100;
			int b = resto / 50;
			resto = resto % 50;
			int c = resto / 20;
			resto = resto % 20;
			int d = resto / 10;
			resto= resto % 10;
			int e = resto / 5;
			resto = resto % 5;
			int f = resto / 2;
			resto = resto % 2;
			int g = resto / 1;
			System.out.println(numero);
			System.out.println(a + " nota(s) de R$ 100,00");
			System.out.println(b + " nota(s) de R$ 50,00");
			System.out.println(c + " nota(s) de R$ 20,00");
			System.out.println(d + " nota(s) de R$ 10,00");
			System.out.println(e + " nota(s) de R$ 5,00");
			System.out.println(f + " nota(s) de R$ 2,00");
			System.out.println(g + " nota(s) de R$ 1,00");
			
		}
	
		sc.close();

	}

}
