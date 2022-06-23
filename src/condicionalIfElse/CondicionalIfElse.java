package condicionalIfElse;

import java.util.Scanner;

public class CondicionalIfElse {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double livroLinux;
		double livroJava;
		
		System.out.println("Entre com o pre�o do livro de Linux:");
		livroLinux = entrada.nextDouble();
		System.out.println("Entre com o pre�o do livro de Java:");
		livroJava = entrada.nextDouble();
		
		double total = livroLinux + livroJava;
		System.out.println("O pre�o total � " + total);
		
		if (livroLinux == 10) {
			System.out.println("Livro de Linux quase de gra�a!\n");
		}
		
		if (total <= 120.00) {
			System.out.println("O pre�o est� bom!");
		}
		else {
			System.out.println("Livros muito caros!");
		}
		
		if (livroLinux < livroJava) {
			System.out.println("Livro de Linux mais barato");
		}
		else if (livroLinux > livroJava) {
			System.out.println("Livro de Java mais barato");
		}
		else {
			System.out.println("Livros com o mesmo pre�o");
		}

	}

}
