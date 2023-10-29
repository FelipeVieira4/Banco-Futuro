package contas.cliente;

import java.util.regex.Pattern;

public class Validacao {
	
	public static Boolean Email(String email) {
		String regexEmail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Pattern emailPattern = Pattern.compile(regexEmail, Pattern.CASE_INSENSITIVE);

		return emailPattern.matcher(email).find();
	}
	
	public static Boolean Cpf(String cpf) {
		String regexCpf="^(\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}|\\d{11})$";
		Pattern cpfPattern = Pattern.compile(regexCpf);

		return cpfPattern.matcher(cpf).find();
	}
}
