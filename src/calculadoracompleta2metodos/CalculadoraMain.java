package calculadoracompleta2metodos;

import java.util.Scanner;

public class CalculadoraMain {

	public static void main(String[] args) {
		int operacao;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o numero equilavente a opera��o: 1 (soma), 2 (subtra��o), 3 (mutiplica��o), 4 (divis�o) "  );
		operacao = in.nextInt();
		
		
		while(operacao != 0) { 
			if (operacao == 1) {
				
		    calculadora2metodos.metodosoma();
				
			}else if(operacao == 2) {
				
			calculadora2metodos.metodosubtracao();
			
				
			}else if(operacao == 3) { 
				
			calculadora2metodos.metodoMutiplicacao();	
				
			
			}else if(operacao == 4) {
				calculadora2metodos.metododivisao();
			
		
		   }else if(operacao >= 5 ) { System.out.println("Numero invalido, digite novamente! :  ");
		       operacao = in.nextInt();
		   }
			System.out.println("Deseja realizar mais alguma opera��o? digite o valor:  1 (soma), 2 (subtra��o), 3 (mutiplica��o), 4 (divis�o), 0 (finalizar)");
			operacao = in.nextInt();
			
		}System.out.println("opera��es finalizadas");
		
	}

}
