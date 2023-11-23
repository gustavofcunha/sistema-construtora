package dcc603.construtora;

public class Engenheiro {
    protected String nome;
    protected int credencial;
    protected Projeto projetos[];

    public Engenheiro(String nome_, int credencial_, Projeto[] projetos_){
        nome = nome_;
        credencial = credencial_;
        projetos = projetos_;
    }
}
