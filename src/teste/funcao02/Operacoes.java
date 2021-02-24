package teste.funcao02;

public class Operacoes {     // nesta classe não precisa inserir o public static void main(String[] args)
	 static String contador(int i, int f) {  // precisa colocar public static para a outra classe TesteFuncao02 funcionar
		String s = " ";
		for (int c = 1; c <= f; c++) {
			s += c + " "; 
		}
		return s; 
	}

}

// esta classe faz apenas o calculo, não tem System.out.println()