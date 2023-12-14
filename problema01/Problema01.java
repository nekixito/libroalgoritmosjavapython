import java.util.Scanner;

public class Problema01{
	public static void main(String[] args){
		//Variables
		int n1, n2, s;
		
		//Entrada
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Numero 1: " );
		n1 = teclado.nextInt();
		
		System.out.print("Numero 2: " );
		n2 = teclado.nextInt();
		
		//Proceso
		s = n1 + n2;
		
		//Salida
		System.out.println("");
		System.out.println("Suma: " + s);
		
		
	}
}