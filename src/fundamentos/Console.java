package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		
		// mesma linha
		System.out.print("Bom"); // não pula linha
		System.out.print(" dia!\n\n"); // continua na mesma linha
		
		// pula linha
		System.out.println("Bom"); // Cria uma nova linha
		System.out.println("dia!");
		
		// mesma linha com formatação
		System.out.printf("Megasena: %d %d %d %d %d %d \n", 1,2,3,4,5,6);
		System.out.printf("Salario: %.1f", 1234.5678); // arredonda
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		
		System.out.printf("%s %s tem %d idade.%n",
				nome, sobrenome, idade);
		
		entrada.close();
		
		
		
		
	}
	

}
