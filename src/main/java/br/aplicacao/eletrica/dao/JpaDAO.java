package br.aplicacao.eletrica.dao;

import br.aplicacao.eletrica.entidades.Entidade;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class JpaDAO<T extends Entidade<T>> {

    private static final EntityManager ENTITY_MANAGER = ConnectionFactory.getEntityManager();
    private final Class<T> ENTITYCLASS;

    public JpaDAO(Class<T> entityClass) {

        this.ENTITYCLASS = entityClass;

    }

    @SuppressWarnings("unchecked")
    public List<T> getAll() {
        List<T> lista = ENTITY_MANAGER.createQuery("FROM " + ENTITYCLASS.getName()).getResultList();
        return lista;
    }

    // Query query = manager.createQuery("update Usuario set ativo = false where
    // email like :email");
    // query.setParameter("email", "%@algaworks.com");
    public List<T> getByExpres(String expres, Object[] parameter) {

        TypedQuery<T> query = ENTITY_MANAGER.createQuery(expres, ENTITYCLASS);

        if (!(parameter.length == 0)) {
            int i = 0;
            for (int x = 0; x < parameter.length - 1; x++) {

                query.setParameter((String) parameter[i], parameter[i + 1]);
                i += 2;
            }
        }
        List<T> lista = query.getResultList();
        return lista;
    }

    @SuppressWarnings("unchecked")
    public List<T> getByExpres2(String expres, Object[] parameter) {

        Query query = ENTITY_MANAGER.createQuery(expres);

        if (parameter.length > 0) {
            int i = 0;
            for (int x = 0; x < parameter.length - 1; x++) {

                query.setParameter((String) parameter[i], parameter[i + 1]);

                i += 2;
            }
        }
        List<T> lista = query.getResultList();
        return lista;
    }

    public T getById(Integer id) {
        return ENTITY_MANAGER.find(ENTITYCLASS, id);
    }

    public void remove(T entity) {
        try {
            ENTITY_MANAGER.getTransaction().begin();
            ENTITY_MANAGER.remove(entity);
            ENTITY_MANAGER.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            ENTITY_MANAGER.getTransaction().rollback();
        }
    }

    public void removeById(Integer id) {
        try {
            T t = getById(id);
            remove(t);
        } catch (Exception ex) {
        }
    }

    public void salva(T obj) {
        try {
            ENTITY_MANAGER.getTransaction().begin();
            if (obj.getId() == null) {
                ENTITY_MANAGER.persist(obj);
            } else {
                ENTITY_MANAGER.merge(obj);
            }
            ENTITY_MANAGER.getTransaction().commit();
        } catch (Exception e) {
            ENTITY_MANAGER.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void excluirTodos(String tabelaNome) {
        long init;
        long end;
        long diff;
        init = System.currentTimeMillis();
        try {
            ENTITY_MANAGER.getTransaction().begin();
            ENTITY_MANAGER.createNativeQuery("DELETE FROM " + tabelaNome).executeUpdate();
            ENTITY_MANAGER.createNativeQuery("TRUNCATE TABLE " + tabelaNome).executeUpdate();
        } catch (Exception e) {
            System.out.println("Deu erro!" + e);
            ENTITY_MANAGER.getTransaction().rollback(); // desfaz transacao se ocorrer erro ao persitir
        } finally {
            if (ENTITY_MANAGER.getTransaction().isActive()) {
                ENTITY_MANAGER.getTransaction().commit();
            }
            end = System.currentTimeMillis();
            diff = end - init;
            System.out.println("Tempo de resposta = " + (diff / 1000.0) + " segundos em JPA - Hibernate");
        }
    }
}
