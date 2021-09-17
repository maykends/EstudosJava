package fundamentos;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		//int a = 3 * 4 - 10;
		//int b = (int) Math.pow(a, 3); // variavel a elevado a 3, foi convertido ou CAST por conta que a função System.out.println(a / (double) b); retonar double
		//double c = Math.pow(a, 3);
		
		//System.out.println(b);
		//System.out.println(c);
		
		// Resolução do desafio feita por mim
		
		/**
		
		int a = (6* (3 + 2)); 
		int b = (int) Math.pow(a, 2);
		int c = 3 * 2;
		
		int d = (((1 - 5) * (2 - 7)) / 2);
		int e = (int) Math.pow(d, 2);
		
		int etapa01 = b / c;
		int etapa02 = etapa01 - e;
		int etapa03 = (int) Math.pow(etapa02, 3);
		int etapa04 = 10;
		int etapa05 = (int) Math.pow(etapa04, 3);
		
		int resultado = etapa03 / etapa05;
		
		System.out.println(resultado);
		
		**/
		
		// resolução professor
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println("O resultado é " + resultado);
		
		
		
		
		
		
		
	}

}
