package br.aplicacao.eletrica.calculos;

import br.aplicacao.eletrica.entidades.Fonte;
import br.aplicacao.eletrica.enums.UnidadePotencia;

public class CalculoUtils {

    public enum MODELO_INSTALACAO {
        INDUSTRIAL, PREDIAL
    }

    private Fonte fonte;
    @SuppressWarnings("unused")
    private MODELO_INSTALACAO modelo;

    public CalculoUtils comFonte(Fonte f) {
        this.fonte = f;
        return this;
    }

    public CalculoUtils comModelo(MODELO_INSTALACAO m) {
        this.modelo = m;
        return this;
    }

    public double getDemanda(UnidadePotencia UnidadeDestino) {

        return fonte.getDemanda(UnidadeDestino);
    }

    public double getPotenciaInstalada(UnidadePotencia UnidadeDestino) {

        return fonte.getPotenciaInstalada(UnidadeDestino);
    }
}
