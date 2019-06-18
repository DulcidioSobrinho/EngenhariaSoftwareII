package br.com.graub.teste.cliente;

import java.util.List;

import org.junit.Test;

import br.com.graub.dao.ClienteDao;
import br.com.graub.modelo.Cliente;
import br.com.graub.modelo.Pessoa;

public class ClienteDaoTeste {

	@Test
	public void listar() {
	ClienteDao dao = new ClienteDao();
	List<Cliente> resultado =  dao.listar();
	for(Cliente c:resultado) {
		System.out.println(c);
	}
	
	}
	
	@Test
	public void salvarCliente() {
		
		Cliente cli = new Cliente();
		cli.setEmail("algum email");
		cli.setFone("999999999");
		cli.setRua("Nome da rua");
		Pessoa pessoa = new Pessoa();
		pessoa.setCodigo(1L);
		pessoa.setCpf("99999999");
		pessoa.setIdade(38);
		pessoa.setNome("Aluno nome");
		cli.setPessoa(pessoa);
		
		ClienteDao dao = new ClienteDao();
		dao.merge(cli);
	}
}
