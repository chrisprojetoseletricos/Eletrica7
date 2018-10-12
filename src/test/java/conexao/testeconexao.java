package conexao;

import br.aplicacao.eletrica.entidades.Fonte;
import br.aplicacao.eletrica.entidades.Projeto;
import br.aplicacao.eletrica.entidades.Quadro;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class testeconexao {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EletricaPU");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Projeto projeto = new Projeto();
		projeto.setNome("Chris");
		projeto.setAutor("projeto");
		projeto.setDescricao("teste");

		Fonte fonte = new Fonte();
		fonte.setNome("Teste");
		fonte.setTensaoFN(110);
		fonte.setProjeto(projeto);
		
		Quadro quadro = new Quadro();
		quadro.setNome("nomeQuadro");
		quadro.setLocalizacao("Local");
		quadro.setFonte(fonte);

		em.persist(quadro);

/*		Projeto projeto2 = projeto.clonarSemID();

		Fonte fonte2 = fonte.clonarSemID();
		fonte2.setProjeto(projeto2);
		em.persist(fonte2);*/

		// em.persist(projeto2);

		em.getTransaction().commit();
		em.close();
	}

}
