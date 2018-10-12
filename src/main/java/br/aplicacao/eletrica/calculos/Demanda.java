package br.aplicacao.eletrica.calculos;

import br.aplicacao.eletrica.enums.UnidadePotencia;
import br.aplicacao.eletrica.enums.Usabilidade;

public class Demanda {

    private double potencia;
    private UnidadePotencia unidadeOrigem;
    private UnidadePotencia unidadeDestino;
    private double fp;
    private double fu;
    private double fd;
    private Usabilidade usabilidade;
    private double perdasReator;
    private double rendimento;

    public Demanda() {

    }

    public double valor() {
        double valor = 0;

        if (usabilidade == Usabilidade.ILUMINACAO_FLUORESCENTE) {
            if (unidadeDestino == UnidadePotencia.VA) {
                valor = 1.8 * ((this.getPotenciaEmW() * fd) + (perdasReator / fp));
            } else if (unidadeDestino == UnidadePotencia.W) {
                valor = 1.8 * ((this.getPotenciaEmW() * fd) + (perdasReator));
            }
        }
        if (usabilidade == Usabilidade.ILUMINACAO_INCADESCENTE) {
            if (unidadeDestino == UnidadePotencia.VA) {
                valor = this.getPotenciaEmVA() * fu * fd / rendimento;
            } else if (unidadeDestino == UnidadePotencia.W) {
                valor = this.getPotenciaEmW() * fu * fd / rendimento;
            }
        }
        if (usabilidade == Usabilidade.GERAL) {
            if (unidadeDestino == UnidadePotencia.VA) {
                valor = this.getPotenciaEmVA() * fu * fd / rendimento;
            } else if (unidadeDestino == UnidadePotencia.W) {
                valor = this.getPotenciaEmW() * fu * fd / rendimento;
            }
        }
        if (usabilidade == Usabilidade.MOTOR) {
            if (unidadeDestino == UnidadePotencia.VA) {
                valor = this.getPotenciaEmVA() * fu * fd / rendimento;
            } else if (unidadeDestino == UnidadePotencia.W) {
                valor = this.getPotenciaEmW() * fu * fd / rendimento;
            }
        }
        if (usabilidade == Usabilidade.EQUIPAMENTOS_ESPECIAIS) {
            if (unidadeDestino == UnidadePotencia.VA) {
                valor = this.getPotenciaEmVA() * fu * fd / rendimento;
            } else if (unidadeDestino == UnidadePotencia.W) {
                valor = this.getPotenciaEmW() * fu * fd / rendimento;
            }
        }

        return valor;
    }

    public Demanda withPotencia(Double potencia) {
        this.potencia = potencia;
        return this;
    }

    public Demanda withUnidadeOrigem(UnidadePotencia unidadeOrigem) {
        this.unidadeOrigem = unidadeOrigem;
        return this;
    }

    public Demanda withUnidadeDestino(UnidadePotencia unidadeDestino) {
        this.unidadeDestino = unidadeDestino;
        return this;
    }

    public Demanda withRendimento(Double rendimento) {
        this.rendimento = rendimento;
        return this;
    }

    public Demanda withPerdasReator(Double perdasReator) {
        this.perdasReator = perdasReator;
        return this;
    }

    public Demanda withFu(Double fu) {
        this.fu = fu;
        return this;
    }

    public Demanda withFd(Double fd) {
        this.fd = fd;
        return this;
    }

    public Demanda withFp(Double fp) {
        this.fp = fp;
        return this;
    }

    public Demanda withUsabilidade(Usabilidade usabilidade) {
        this.usabilidade = usabilidade;
        return this;
    }

    private double getPotenciaEmVA() {
        return new ConversorPotencia()//
                .withFatorPotencia(fp)//
                .withPotencia(potencia)//
                .withUnidadeOrigem(unidadeOrigem)//
                .withUnidadeDestino(UnidadePotencia.VA)//
                .converte();
    }

    private double getPotenciaEmW() {
        return new ConversorPotencia()//
                .withFatorPotencia(fp)//
                .withPotencia(potencia)//
                .withUnidadeOrigem(unidadeOrigem)//
                .withUnidadeDestino(UnidadePotencia.W)//
                .converte();
    }
}
