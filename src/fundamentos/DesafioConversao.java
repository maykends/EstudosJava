package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro salário:"); //8343.65
		String salario1 = entrada.next().replace(",", "."); // funcao repalce, se o usuario entrar com "," é sustituido por "."
		System.out.print("Informe o segundo salário:"); //8410,87
		String salario2 = entrada.next().replace(",", ".");
		System.out.print("Informe o terceiro salário:"); //1234,10
		String salario3 = entrada.next().replace(",", ".");
		
		System.out.println(salario1 + salario2 + salario3);
		
		double numero1 = Double.parseDouble(salario1);
		double numero2 = Double.parseDouble(salario2);
		double numero3 = Double.parseDouble(salario3);

		double soma = numero1 + numero2 + numero3;
		
		System.out.println("Soma é " + soma);
		System.out.println("Média é " + soma / 3);
		
		entrada.close();
		

	}

}
