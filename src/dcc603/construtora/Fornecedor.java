package dcc603.construtora;

public class Fornecedor {
    public static final int maximoMateriais = 10;

    private String nome;
    private int cnpj;
    private Material materiais[];
    private int numeroMateriais;

    public Fornecedor(String nome_, int cnpj_, Material[] materiais_){
        materiais = new Material[maximoMateriais];
        numeroMateriais = 0;
        nome = nome_;
        cnpj = cnpj_;
        materiais = materiais_;
    }

    public String getNome(){
        return nome;
    }

    public int getCnpj(){
        return cnpj;
    }

    public Material[] getMateriais(){
        return materiais;
    }

    public int getNumeroMateriais(){
        return numeroMateriais;
    }

    public void incluirMaterial(Material material){
        materiais[numeroMateriais] = material;
        numeroMateriais += 1;
    }
}
