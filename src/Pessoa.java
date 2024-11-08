public abstract class Pessoa {
    private String nome;
    private String telefone;

    public Pessoa(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String toString(){
        return String.format("Nome: %s%nTelefone: %s%n", getNome(),getTelefone());
    }

}
