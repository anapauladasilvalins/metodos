package teste.funcao01;

public class MetodoReturn {
	
	static int soma(int a, int b) { // esta parte apenas faz o cálculo // int com retorno ao invés de void. 
		int s = a + b;
		return s;
	}
	public static void main(String[] args) { // esta parte imprime na tela o calculo, é a primeira parte do código a ser executado na tela
		System.out.println("Começou o programa...");
		int sm = soma(4,2);
		System.out.println("A soma vale " + sm);
	}
}

