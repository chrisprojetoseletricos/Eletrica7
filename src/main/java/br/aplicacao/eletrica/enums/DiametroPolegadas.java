package br.aplicacao.eletrica.enums;

import java.util.ArrayList;
import java.util.List;

public enum DiametroPolegadas {

    P1("1'"),
    P1_1_2("1 1/2'"),
    D2("2'"),
    D3("3'");
    

    private final String numero;

    private DiametroPolegadas(String sigla) {
        this.numero = sigla;
    }

    public String getString() {
        return numero;
    }

    public static List<DiametroPolegadas> getLista() {
        List<DiametroPolegadas> lista = new ArrayList<>();
        lista.add(DiametroPolegadas.P1);
        lista.add(DiametroPolegadas.P1_1_2);
        lista.add(DiametroPolegadas.D2);
        lista.add(DiametroPolegadas.D3);
        return lista;
    }
}
