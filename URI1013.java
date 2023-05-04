package application;

import java.util.Scanner;

public class URI1013 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
	    int[] numeros = new int[3];
	    
	    for (int i = 0; i < 3; i++) { 
	      numeros[i] = entrada.nextInt();
	    }
	    
	    int maiorAB = (numeros[0]+numeros[1] + Math.abs(numeros[0]-numeros[1]))/2;
	    int maiorABC = (maiorAB + numeros[2] + Math.abs(maiorAB - numeros[2]))/2;
	    
	    System.out.println(maiorABC + " eh o maior");
	    
	    entrada.close();
	    

	}

	

}
