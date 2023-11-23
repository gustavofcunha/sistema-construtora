package dcc603.construtora;

public class Cliente {
    protected String nome;
    private String cpf;
    private Projeto projetos[];

    public Cliente(String nome_, String cpf_){
        nome = nome_;
        cpf = cpf_;
    }

    public String getCpf(){
        return cpf;
    }

    public Projeto[] getProjetos(){
        return projetos;
    }
}
