package conexao;

import br.aplicacao.eletrica.entidades.Fonte;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class testeconexao3 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EletricaPU");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Fonte fonte = em.find(Fonte.class, 2);
		em.remove(fonte);

		em.getTransaction().commit();
		em.close();
	}

}
