package conexao;

import br.aplicacao.eletrica.entidades.Circuito;
import br.aplicacao.eletrica.entidades.Condutor;
import br.aplicacao.eletrica.entidades.Curto;
import br.aplicacao.eletrica.entidades.Equipamento;
import br.aplicacao.eletrica.entidades.Fonte;
import br.aplicacao.eletrica.entidades.Projeto;
import br.aplicacao.eletrica.entidades.Quadro;
import br.aplicacao.eletrica.servico.CondutorService;
import br.aplicacao.eletrica.servico.CurtoService;
import br.aplicacao.eletrica.servico.EquipamentoService;

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

        Quadro quadro = new Quadro();
        quadro.setNome("teste");
        quadro.setFonte(fonte);
        
        Condutor c = new Condutor();
        c.setComprimento(4);
        CondutorService.salva(c);
        Curto cu = new Curto();
        cu.setCorrenteCurto(23);
        CurtoService.salva(cu);
        
        Circuito circuito = new Circuito();
        circuito.setNome("testeCircuito");
        circuito.setQuadro(quadro);
        circuito.setCondutor(c);
        circuito.setCurto(cu);
        
        Equipamento e = new Equipamento();
        e.setNome("testeequi");
        e.setCircuito(circuito);

        EquipamentoService.salva(e);

        /*
		 * Projeto projeto2 = projeto.clonarSemID();
		 * 
		 * Fonte fonte2 = fonte.clonarSemID(); fonte2.setProjeto(projeto2);
		 * em.persist(fonte2);
         */
        // em.persist(projeto2);
    }
}
