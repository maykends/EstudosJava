package fundamentos;

import java.util.Date;

public class Import {

	public static void main(String[] args) {

		java.lang.String b = "Boa noite!";
		java.lang.System.out.println(b);
		
		// o coigo acima � o mesmo que o de baixo, vsito que o ava.lang est� em toda estrutura do java
		
		String c = "Boa noite!";
		System.out.println(c);
		
		Date d = new Date();
		System.out.println(d);

	}

}
