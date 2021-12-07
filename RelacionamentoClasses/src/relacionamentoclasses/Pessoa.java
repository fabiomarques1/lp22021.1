package relacionamentoclasses;

public class Pessoa {
    private long cpf;
    private String nome;
    private Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(long cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public Pessoa(long cpf, String nome, Endereco endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "cpf=" + cpf + ", nome=" + nome + ", endereco=" + endereco + '}';
    }
     
}
