package calculadoracompleta;

import java.util.Scanner;

public class CalculadoraCompleta {
	
	
	
	public static void main(String[] args) {
		int operacao;
		int valor1;
		int valor2;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o numero equilavente a opera��o: 1 (soma), 2 (subtra��o), 3 (mutiplica��o), 4 (divis�o) "  );
		operacao = in.nextInt();
		
		
	
		int resultadosoma ;
		int resultadosubtracao;
		int resultadoMutiplicacao;
		int resultadodivisao;
		
		
		
		while(operacao != 0) { 
			if (operacao == 1) { System.out.println("Soma");
			
			System.out.println("digite o valor:  "  );
		    valor1 = in.nextInt();
		    System.out.println("digite o valor:  "  );
		    valor2 = in.nextInt();
		    resultadosoma = valor1 + valor2 ;
		    System.out.println("Resultado:  " + resultadosoma );
		    
		   
			
				
			}else if(operacao == 2) { System.out.println("Subtra��o");
			
			System.out.println("digite o valor:  "  );
		    valor1 = in.nextInt();
		    System.out.println("digite o valor:  "  );
		    valor2 = in.nextInt();
		    resultadosubtracao = valor1 - valor2 ;
		    System.out.println("Resultado:  " + resultadosubtracao );
		   
		    
			
				
			}else if(operacao == 3) { System.out.println("Mutiplica��o");
			
			System.out.println("digite o valor:  "  );
		    valor1 = in.nextInt();
		    System.out.println("digite o valor:  "  );
		    valor2 = in.nextInt();
		    resultadoMutiplicacao = valor1 * valor2 ;
		    System.out.println("Resultado:  " + resultadoMutiplicacao );
		 
				
			}else if(operacao == 4) { System.out.println("Divis�o");
			
			System.out.println("digite o valor:  "  );
		    valor1 = in.nextInt();
		    System.out.println("digite o valor:  "  );
		    valor2 = in.nextInt();
		    resultadodivisao = valor1 / valor2 ;
		    System.out.println("Resultado:  " + resultadodivisao );
		    
		   	
		   }else if(operacao >= 5 ) { System.out.println("Numero invalido, digite novamente! :  ");
		       operacao = in.nextInt();
		   }
			System.out.println("Deseja realizar mais alguma opera��o? digite o valor:  1 (soma), 2 (subtra��o), 3 (mutiplica��o), 4 (divis�o), 0 (finalizar)");
			operacao = in.nextInt();
			
      }System.out.println("opera��es finalizadas");
		
		
   }
}

		
		
	


