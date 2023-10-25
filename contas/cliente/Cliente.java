package contas.cliente;

import java.util.ArrayList;
import contas.contaBancarias.ContaBancaria;

public class Cliente{


  private int id;
  private String nome;
  private String telefone;
  private String cpf;
  private String email;
  
  private ArrayList<String> enderecos = new ArrayList<String>();
  private ArrayList<ContaBancaria> conta = new ArrayList<ContaBancaria>();
  
  public Cliente(int id,String nome){
    this.setId(id);
    this.setNome(nome);
  }

  public int getId() {
    return id;
  }
  public void setId(int id) {
    if(id > 0){
      this.id = id;
      return;
    }
  }


  public String getNome() {
    return nome;
  }

  public Boolean setNome(String nome) {
    if(!nome.isBlank() && nome!=null){
      this.nome = nome;
      return true;
    }
    return false;
  }


  public String getTelefone() {
    return telefone;
  }
  public Boolean setTelefone(String telefone) {
	if(telefone!=null && !telefone.isBlank()) {
		this.telefone = telefone;
		return true;
	}
	System.out.println("Telefone não aceito");
	return false;
  }

  public String getCpf() {
    return cpf;
  }

  //Validar e setar o CPF
  public Boolean setCpf(String cpf) {
	  
    if(Validacao.Cpf(cpf) && cpf!=null && !cpf.isBlank()) {
      this.cpf = cpf;
      return true;
    }
    return false;
  }


  public String getEmail() {
	return this.email;
  }

  public Boolean setEmail(String email) {

    if(!email.isBlank() && email!=null && Validacao.Email(email)){
      this.email = email;
      System.out.println("Email aceito");
      return true;
    }
    System.out.print("Email não aceito");
    return false;
  }

  //Setar o endereço apartir de um array já difinida
  public void setEnderecos(ArrayList<String> enderecos) {
    this.enderecos = enderecos;
  }
  
  //Adicionar um endereço ao cliente
  public void addEndereco(String endereco) {
    this.enderecos.add(endereco);
  }
  public ArrayList<String> getEnderecos() {
    return enderecos;
  }

  
  //
  public void criarConta(ContaBancaria c) {
    this.conta.add(c);
  }
  public ArrayList<ContaBancaria> getContasBancarias(){
    return this.conta;
  }
}
