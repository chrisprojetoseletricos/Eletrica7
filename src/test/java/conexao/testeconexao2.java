package conexao;

import br.aplicacao.eletrica.entidades.Projeto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class testeconexao2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EletricaPU");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Projeto projeto = em.find(Projeto.class, 3);
		em.remove(projeto);

		em.getTransaction().commit();
		em.close();
	}

}
