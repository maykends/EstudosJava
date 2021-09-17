package fundamentos;

public class Aritmeticos {

	public static void main(String[] args) {
		
		System.out.println(2 + 3);
		
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // note que aqui o n�mer oi dividido, houve valor fracionado e n�o foi mostrado por ser inteiro
		System.out.println(a / (double) b); // reaiza CAST
		System.out.println(a / (float) b); // precisa� menor com float
		
		System.out.println(8 % 3);
		System.out.println(8 % b);
		System.out.println(a % 3);
		
		System.out.println(x + y - a * b);
		

	}

}
