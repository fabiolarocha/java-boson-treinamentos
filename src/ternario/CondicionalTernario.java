package ternario;

public class CondicionalTernario {

	public static void main(String[] args) {
		int a;
		String b;
		/*
		a = 12;
		b = (a == 5) ? "a � igual a 5": "a � diferente de 5";
		System.out.println("Resultado: " + b);
		
		b = (a == 12) ? "a � igual a 12": "a � diferente de 12";
		System.out.println("Resultado: " + b);
		*/
		a = 15;
		b = (a > 14) ? "Atrasado": (a < 14) ? "Adiantado" : "No hor�rio";
		System.out.println("Resultado: " + b);
	}

}
