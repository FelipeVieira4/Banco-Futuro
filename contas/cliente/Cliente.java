package contas.cliente;

import java.util.ArrayList;

public class Cliente{
    private int id;
    private String nome;
    private String telefone;
    private String cpf;
    private ArrayList<String> enderecos = new ArrayList<String>();

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
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	public ArrayList<String> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(ArrayList<String> enderecos) {
		this.enderecos = enderecos;
	}
	public void addEndereco(String endereco) {
		this.enderecos.add(endereco);
	}
}
