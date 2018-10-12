package conexao;

import br.aplicacao.eletrica.entidades.Condutor;
import br.aplicacao.eletrica.entidades.Fonte;
import br.aplicacao.eletrica.entidades.Projeto;
import br.aplicacao.eletrica.entidades.Quadro;
import br.aplicacao.eletrica.servico.QuadroService;

public class testeconexao5 {

    public static void main(String[] args) {

        Projeto projeto = new Projeto();
        projeto.setNome("Chris");
        projeto.setAutor("projeto");
        projeto.setDescricao("teste");

        Fonte fonte = new Fonte();
        fonte.setNome("Teste");
        fonte.setTensaoFN(110);
        fonte.setProjeto(projeto);

        Condutor condutor = new Condutor();
        condutor.setComprimento(100);

        Quadro quadro = new Quadro();
        quadro.setNome("teste");
        quadro.setCondutor(condutor);

        QuadroService.salva(quadro);

        /*
		 * Projeto projeto2 = projeto.clonarSemID();
		 * 
		 * Fonte fonte2 = fonte.clonarSemID(); fonte2.setProjeto(projeto2);
		 * em.persist(fonte2);
         */
        // em.persist(projeto2);
    }
}
