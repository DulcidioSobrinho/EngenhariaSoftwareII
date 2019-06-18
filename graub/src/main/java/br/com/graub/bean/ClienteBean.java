package br.com.graub.bean;

import java.util.List;

import javax.annotation.PostConstruct;

import org.omnifaces.util.Messages;

import br.com.graub.dao.ClienteDao;
import br.com.graub.modelo.Cliente;

public class ClienteBean {

	private List<Cliente>clientes;
	private Cliente cliente;
	
	@PostConstruct
	public void listar() {
	try {	
	ClienteDao clienteDao = new ClienteDao();
	clientes=clienteDao.listar();
		
	 }catch(RuntimeException erro){
		 System.out.println("Erro ao listar cliente");
		 erro.printStackTrace();
	 }
		 
	 }
	
	public void salvar() {
		 
			ClienteDao clienteDao = new ClienteDao();
			clienteDao.merge(cliente);
			
	} 
	
}
