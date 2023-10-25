package contas.cliente;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import contas.contaBancarias.ContaBancaria;

public class Cliente{


  private int id;
  private String nome;
  private String telefone;
  private String cpf;
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

  public void setNome(String nome) {
    if(!nome.isBlank() && nome!=null){
      this.nome = nome;
      return;
    }
    this.nome="";
  }


  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getCpf() {
    return cpf;
  }

  public Boolean setCpf(String cpf) {
    Pattern pattern = Pattern.compile("^(\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}|\\d{11})$");
    Matcher matcher = pattern.matcher(cpf);

    if(matcher.matches()) {
      this.cpf = cpf;
      return true;
    }
    return false;
  }


  public void setEnderecos(ArrayList<String> enderecos) {
    this.enderecos = enderecos;
  }
  public void addEndereco(String endereco) {
    this.enderecos.add(endereco);
  }
  public ArrayList<String> getEnderecos() {
    return enderecos;
  }

  public void criarConta(ContaBancaria c) {
    this.conta.add(c);
  }
  public ArrayList<ContaBancaria> getContasBancarias(){
    return this.conta;
  }
}
