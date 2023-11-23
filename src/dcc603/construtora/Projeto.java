package dcc603.construtora;

public class Projeto {

	protected String nome;
	protected Engenheiro engenheiroResponsavel;
	
	public Projeto(String nome_, Engenheiro engenheiroResponsavel_){
		nome = nome_;
		engenheiroResponsavel = engenheiroResponsavel_;
	}

	public void encomendarMateriaPrima() {

		/* Este metodo faz requisicao de materia prima aos fornecedores
		 * para o projeto
		 */
		
	}
}
