package teste.funcao01;

public class MetodoReturn {
	
	static int soma(int a, int b) { // esta parte apenas faz o c�lculo // int com retorno ao inv�s de void. 
		int s = a + b;
		return s;
	}
	public static void main(String[] args) { // esta parte imprime na tela o calculo, � a primeira parte do c�digo a ser executado na tela
		System.out.println("Come�ou o programa...");
		int sm = soma(4,2);
		System.out.println("A soma vale " + sm);
	}
}

