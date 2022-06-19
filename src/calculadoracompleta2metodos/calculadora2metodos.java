package calculadoracompleta2metodos;

import java.util.Scanner;

public class calculadora2metodos {	
	
	public static Scanner in = new Scanner(System.in);
	
	public static void metodosoma() { 
		int valor1, valor2;
		System.out.println("Soma");
		
		System.out.println("digite o valor:  "  );
	    valor1 = in.nextInt();
	    System.out.println("digite o valor:  "  );
	    valor2 = in.nextInt();
	    
		int resultadosoma = valor1 + valor2 ;
		System.out.println("Resultado:  " + resultadosoma );
	}
	public static void metodosubtracao() {
		int valor1, valor2;
		System.out.println("Subtração");
		
		System.out.println("digite o valor:  "  );
	    valor1 = in.nextInt();
	    System.out.println("digite o valor:  "  );
	    valor2 = in.nextInt();
	    
	    int resultadosubtracao = valor1 - valor2 ;
	    System.out.println("Resultado:  " + resultadosubtracao );
		 
		;
	}
	public static void metodoMutiplicacao() {
		int valor1, valor2;
		System.out.println("Mutiplicação");
		
		System.out.println("digite o valor:  "  );
	    valor1 = in.nextInt();
	    System.out.println("digite o valor:  "  );
	    valor2 = in.nextInt();
	    
	    int resultadoMutiplicacao = valor1 * valor2 ;
	    System.out.println("Resultado:  " + resultadoMutiplicacao );
		
		
	}
	public static void metododivisao() {
		int valor1, valor2;
		System.out.println("Divisão");
		
		System.out.println("digite o valor:  "  );
	    valor1 = in.nextInt();
	    System.out.println("digite o valor:  "  );
	    valor2 = in.nextInt();
	    
		int resultadodivisao = valor1 / valor2;
		System.out.println("Resultado:  " + resultadodivisao );
		
	}		
} 

	
		
		

		   
		    
			
			
		