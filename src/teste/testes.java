package teste;

import java.util.Random;

public class testes {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		float valor = aleatorio.nextFloat() * 100;
		System.out.println("N�mero gerado: " + valor);

	}

}
