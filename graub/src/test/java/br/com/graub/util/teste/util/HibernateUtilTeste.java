package br.com.graub.util.teste.util;

import org.hibernate.Session;
import org.junit.Test;

import br.com.graub.util.HibernateUtil;

 

public class HibernateUtilTeste {

@Test
	
	public void conectar(){
		
	Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
	sessao.close();
	HibernateUtil.getFabricaDeSessoes().close();
}
}
