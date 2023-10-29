package contas.cliente;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacao {
	
	public static Boolean Email(String email) {
		String regexEmail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Pattern emailPattern = Pattern.compile(regexEmail, Pattern.CASE_INSENSITIVE);

		Matcher validar = emailPattern.matcher(email);
		return validar.find();
	}
	
	public static Boolean Cpf(String cpf) {
		String regexCpf="^(\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}|\\d{11})$";
		Pattern cpfPattern = Pattern.compile(regexCpf);

		Matcher validar = cpfPattern.matcher(cpf);
		return validar.find();
	}
}
