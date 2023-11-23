package dcc603.construtora.test;

import static org.junit.Assert.*;
import org.junit.Test;
import dcc603.construtora.*;

public class FornecedorTest {
    @Test
    public void testGetMateriais() {
        //nota que eu tenho
        Fornecedor fornecedor;

        //quando eu faco
        fornecedor = new Fornecedor("Gerdau", 35435, new Material[10]);

        //eu espero
        assertNotNull("A lista de materiais não deve ser nula", fornecedor.getMateriais());
        assertEquals("O fornecedor não deve ter materiais inicialmente", 0, fornecedor.getNumeroMateriais());
    }

    @Test
    public void testIncluirMaterial() {
        //nota que eu tenho...
        Fornecedor fornecedor = new Fornecedor("Gerdau", 35435, new Material[10]);
        Material material1 = new Material("ferro", 89, fornecedor);
        Material material2 = new Material("aço", 120, fornecedor);

        //quando eu faco...
        fornecedor.incluirMaterial(material1);
        fornecedor.incluirMaterial(material2);
        Material[] materiais = fornecedor.getMateriais();

        //entao eu espero que aconteca...
        assertTrue("O fornecedor deve ter 2 materiais", fornecedor.getNumeroMateriais() == 2);
        assertTrue("O primeiro material deve ser igual a material1", materiais[0] == material1);
        assertTrue("O segundo material deve ser igual a material2", materiais[1] == material2);
    }
}
