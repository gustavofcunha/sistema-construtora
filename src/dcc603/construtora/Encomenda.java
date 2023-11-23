package dcc603.construtora;

public class Encomenda {
    private Projeto projeto;
    private Material material;
    private int quantidade;
    private Fornecedor fornecedor;

    public Encomenda(Projeto projeto_, Material material_, int quantidade_, Fornecedor fornecedor_){
        projeto = projeto_;
        material = material_;
        quantidade = quantidade_;
        fornecedor = fornecedor_;
    }

    public Projeto getProjeto(){
        return projeto;
    }

    public Material getMaterial(){
        return material;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public Fornecedor getFornecedor(){
        return fornecedor;
    }
}
