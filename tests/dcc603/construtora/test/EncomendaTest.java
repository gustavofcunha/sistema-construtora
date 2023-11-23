package dcc603.construtora.test;

import static org.junit.Assert.*;
import org.junit.Test;
import dcc603.construtora.*;

public class EncomendaTest {
    @Test
	public void testProjetoEncomendoNaoNulo(){
		//nota que eu tenho...
        Engenheiro eng1963 = new Engenheiro("Roberto Nunes", 1963, null);
        Projeto p = new Projeto("projeto5000", eng1963);
        Fornecedor gerdau = new Fornecedor("Gerdau", 35435, new Material[10]);
        Material m = new Material("ferro", 89, gerdau);
        gerdau.incluirMaterial(m);
        
		Encomenda encomenda = new Encomenda(p, m, 2, gerdau);
		
		//quando eu faco...
		Projeto projetoObtido = encomenda.getProjeto();
		
		//entao eu epero que aconteca...
		assertNotNull("A encomenda precisa ter um projeto associado", projetoObtido);
	}
    
}
