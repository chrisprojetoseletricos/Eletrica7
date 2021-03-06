package br.aplicacao.eletrica.calculos;

import br.aplicacao.eletrica.enums.UnidadePotencia;

public class ConversorPotencia {

    private double fatorPotencia;
    private double potencia;
    private UnidadePotencia unidadeDestino;
    private UnidadePotencia unidadeOrigem;
    private final double WATT_BTU = 0.29307107;
    private final double WATT_CV = 735.499;
    private final double WATT_HP = 745.699872;

    public double converte() {

        if (unidadeOrigem == unidadeDestino) {
            return potencia;
        }

        if (unidadeOrigem == UnidadePotencia.W && unidadeDestino == UnidadePotencia.CV) {
            return potencia / WATT_CV;
        }
        if (unidadeOrigem == UnidadePotencia.CV && unidadeDestino == UnidadePotencia.W) {
            return potencia * WATT_CV;
        }
        if (unidadeOrigem == UnidadePotencia.BTU && unidadeDestino == UnidadePotencia.W) {
            return potencia * WATT_BTU;
        }
        if (unidadeOrigem == UnidadePotencia.W && unidadeDestino == UnidadePotencia.BTU) {
            return potencia / WATT_BTU;
        }
        if (unidadeOrigem == UnidadePotencia.HP && unidadeDestino == UnidadePotencia.W) {
            return potencia * WATT_HP;
        }
        if (unidadeOrigem == UnidadePotencia.W && unidadeDestino == UnidadePotencia.HP) {
            return potencia / WATT_HP;
        }
        if (unidadeOrigem == UnidadePotencia.W && unidadeDestino == UnidadePotencia.VA) {
            return potencia / fatorPotencia;
        }
        if (unidadeOrigem == UnidadePotencia.BTU && unidadeDestino == UnidadePotencia.VA) {
            return potencia * WATT_BTU / fatorPotencia;
        }
        if (unidadeOrigem == UnidadePotencia.CV && unidadeDestino == UnidadePotencia.VA) {
            return potencia * WATT_CV / fatorPotencia;
        }
        if (unidadeOrigem == UnidadePotencia.HP && unidadeDestino == UnidadePotencia.VA) {
            return potencia * WATT_HP / fatorPotencia;
        }

        throw new RuntimeException(
                "Nao foi possivel converter a potencia de " + unidadeOrigem + " para " + unidadeDestino);
    }

    public ConversorPotencia withFatorPotencia(Double fatorPotencia) {
        this.fatorPotencia = fatorPotencia;
        return this;
    }

    public ConversorPotencia withPotencia(Double potencia) {
        this.potencia = potencia;
        return this;
    }

    public ConversorPotencia withUnidadeDestino(UnidadePotencia unidadeDestino) {
        this.unidadeDestino = unidadeDestino;
        return this;
    }

    public ConversorPotencia withUnidadeOrigem(UnidadePotencia unidadeOrigem) {
        this.unidadeOrigem = unidadeOrigem;
        return this;
    }
}
