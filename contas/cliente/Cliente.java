package contas.cliente;

public class Cliente implements ClienteAbstract{
    private int id;
    private String nome;
    private String telefone;

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

    

}
