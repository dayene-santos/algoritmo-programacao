package AtividadePratica03;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char letra;
		
		System.out.print("Digite uma letra: ");
			letra = sc.nextLine().charAt(0);
			
		System.out.print("A letra digitada foi: " + letra);		
		
		sc.close();

	}

}

//Solicite ao usuário que insira um caractere e exiba o valor digitado.