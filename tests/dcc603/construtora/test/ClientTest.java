package dcc603.construtora.test;

import static org.junit.Assert.*;
import org.junit.Test;
import dcc603.construtora.*;

public class ClientTest {
    @Test
	public void testGetCpfCliente(){
		//nota que eu tenho...
		Cliente cliente = new Cliente("Gustavo", "70084783648");
		
		//quando eu faco...
		String cpfObtido = cliente.getCpf();
		
		//entao eu espero que aconteca...
		assertTrue("O CPF deveria ser igual a 70084783648", cpfObtido == cliente.getCpf());
	}
}
