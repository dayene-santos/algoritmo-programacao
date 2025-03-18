package AtividadePratica03;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um número: ");
			num = sc.nextInt();

        System.out.println("O valor absoluto de " + num + " é " + Math.abs(num));

        sc.close();
	}

}
