package br.com.caelum.jdbc.teste.contato;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaExcluirContato {
	
	public static void main(String[] args){
		
		Contato contato = new Contato();
		contato.setId((long) 2);
		
		ContatoDao dao = new ContatoDao();
		dao.remove(contato);
		
		System.out.println("Excluído!");
		
	}

}
