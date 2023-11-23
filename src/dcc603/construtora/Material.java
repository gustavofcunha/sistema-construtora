package dcc603.construtora;

public class Material {
    private String nome;
    private int preco;
    private Fornecedor fornecedor;

    public Material(String nome_, int preco_, Fornecedor fornecedor_){
        nome = nome_;
        preco = preco_;
        fornecedor = fornecedor_;
    }

    public String getNome(){
        return nome;
    }

    public int getPreco(){
        return preco;
    }

    public Fornecedor getFornecedor(){
        return fornecedor;
    }
}
