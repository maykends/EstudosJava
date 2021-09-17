package fundamentos;

//import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		
		//Scanner entrada = new Scanner(System.in);
		
		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
				
		//Integer.parseInt(entrada.next()); // int conversao
		Long l = 100000L;
		
		//Usa-se a classe com letras maiusculas Byte, Short...pra ter acesso as funçoes que estão abaixo
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i*5);
		System.out.println(l / 3);
	

		//entrada.close();

		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //char
		System.out.println(c + "...");
		
		
	}

}
