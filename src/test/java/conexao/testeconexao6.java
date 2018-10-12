package conexao;

import br.aplicacao.eletrica.entidades.Fonte;
import br.aplicacao.eletrica.servico.FonteService;

public class testeconexao6 {

    public static void main(String[] args) {

        Fonte fonte = FonteService.getById(4);
        FonteService.remove(fonte);
    }

}
