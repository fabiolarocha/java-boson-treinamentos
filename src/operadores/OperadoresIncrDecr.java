package operadores;

public class OperadoresIncrDecr {

	public static void main(String[] args) {
		int num = 10;
		int result = 0;
		
		System.out.println("Valor original: " + result);
		result = num ++; // Primeiro atribui, depois incrementa
		System.out.println("Valor de num ap�s o incremento: " + num);
		System.out.println("Valor de result ap�s o incremento: " + result);
		
		num = 10; result = 0;
		
		result = ++num; //Primeiro incremento, depois atribui
		System.out.println("Valor de num ap�s o incremento: " + num);
		
	}

}
