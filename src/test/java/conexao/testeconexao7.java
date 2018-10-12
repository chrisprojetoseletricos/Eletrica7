package conexao;

import br.aplicacao.eletrica.entidades.Fonte;
import br.aplicacao.eletrica.servico.FonteService;

public class testeconexao7 {

    public static void main(String[] args) {

        Fonte fonte = FonteService.getById(1);
        Fonte fonte2 = new Fonte();
        fonte2 = fonte.copiar();
        fonte2.setNome("chris");
        FonteService.salva(fonte2);
    }

}
