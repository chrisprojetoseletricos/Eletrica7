package br.aplicacao.eletrica.enums;

import java.util.ArrayList;
import java.util.List;

public enum Ligacao {

    FF("2"),
    FN("1"),
    FFF("3"),
    FFFN("3"),
    FFN("2");

    private final String numero;

    private Ligacao(String sigla) {
        this.numero = sigla;
    }

    public int getNumeroFases() {
        return Integer.parseInt(numero);
    }

    public static List<Ligacao> getLista() {
        List<Ligacao> lista = new ArrayList<>();
        lista.add(Ligacao.FF);
        lista.add(Ligacao.FFF);
        lista.add(Ligacao.FFFN);
        lista.add(Ligacao.FFN);
        lista.add(Ligacao.FN);
        return lista;
    }
}
