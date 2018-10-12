package conexao;

import br.aplicacao.eletrica.entidades.Quadro;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class testeconexao4 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EletricaPU");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Quadro quadro = em.find(Quadro.class, 3);
		em.remove(quadro);

		em.getTransaction().commit();
		em.close();
	}

}
