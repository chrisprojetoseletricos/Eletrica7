package br.aplicacao.eletrica.calculos;

import br.aplicacao.eletrica.entidades.Circuito;
import br.aplicacao.eletrica.entidades.Equipamento;
import br.aplicacao.eletrica.entidades.Quadro;
import br.aplicacao.eletrica.enums.UnidadePotencia;
import br.aplicacao.eletrica.servico.QuadroService;

public class PotenciaInstalada {

    private Quadro quadro;
    private UnidadePotencia unidadeDestino;

    public double valor() {
        double valor = 0;
        if (unidadeDestino == UnidadePotencia.VA) {
            for (Integer q : quadro.getListaQuadros()) {
                for (Circuito c : QuadroService.getById(q).getCircuitos()) {
                    for (Equipamento e : c.getEquipamentos()) {
                        valor += e.getQuantidade() * e.getDemanda(UnidadePotencia.VA);
                    }
                }
            }
        } else if (unidadeDestino == UnidadePotencia.W) {
            for (Integer q : quadro.getListaQuadros()) {
                for (Circuito c : QuadroService.getById(q).getCircuitos()) {
                    for (Equipamento e : c.getEquipamentos()) {
                        valor += e.getQuantidade() * e.getDemanda(UnidadePotencia.W);
                    }
                }
            }
        }
        return valor;
    }

    public PotenciaInstalada withQuadro(Quadro quadro) {
        this.quadro = quadro;
        return this;
    }

    public PotenciaInstalada withUnidadeDestino(UnidadePotencia unidadeDestino) {
        this.unidadeDestino = unidadeDestino;
        return this;
    }
}
