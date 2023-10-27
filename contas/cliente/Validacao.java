package contas.cliente;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacao {
	
	//Regexs para validação de Emails e CPFS
	private static final String regexEmail = 
		        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	private static final String regexCpf="^(\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}|\\d{11})$";
	
	
	private static final Pattern emailPattern = Pattern.compile(regexEmail, Pattern.CASE_INSENSITIVE);
	private static final Pattern cpfPattern = Pattern.compile(regexCpf);
	    
	
	public static Boolean Email(String email) {
		Matcher validar = emailPattern.matcher(email);
		return validar.find();
	}
	
	public static Boolean Cpf(String cpf) {
		Matcher validar = cpfPattern.matcher(cpf);
		return validar.find();
	}
}
