package Entidades;

public class Cliente {

    private String id;
    private String nome;
    private String cpf;
    private String email;


    public Cliente( String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;


    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {return email;}

    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}