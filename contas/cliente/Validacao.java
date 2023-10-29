package contas.cliente;

import java.util.regex.Pattern;

public class Validacao {
	
	private final static String regexEmail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private final static String regexCpf="^(\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}|\\d{11})$";


	public static Boolean Email(String email) {
		
		Pattern emailPattern = Pattern.compile(regexEmail, Pattern.CASE_INSENSITIVE);
		return emailPattern.matcher(email).find();
	}
	
	public static Boolean Cpf(String cpf) {
		
		Pattern cpfPattern = Pattern.compile(regexCpf);
		return cpfPattern.matcher(cpf).find();
	}
}
