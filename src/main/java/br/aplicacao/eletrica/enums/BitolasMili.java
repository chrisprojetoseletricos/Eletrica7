package br.aplicacao.eletrica.enums;

import br.aplicacao.eletrica.uteis.Numero;
import java.util.ArrayList;
import java.util.List;

public enum BitolasMili {

    B4("4"),
    B6("6"),
    B10("10"),
    B16("16"),
    B25("25"),
    B35("35"),
    B50("50"),
    B70("70");
    

    private final String numero;

    private BitolasMili(String sigla) {
        this.numero = sigla;
    }

    public double getNumero() {
        return Numero.stringToDouble(numero,0);
    }

    public static List<BitolasMili> getLista() {
        List<BitolasMili> lista = new ArrayList<>();
        lista.add(BitolasMili.B4);
        lista.add(BitolasMili.B6);
        lista.add(BitolasMili.B10);
        lista.add(BitolasMili.B16);
        lista.add(BitolasMili.B25);
        lista.add(BitolasMili.B35);
        lista.add(BitolasMili.B50);
        lista.add(BitolasMili.B70);
        return lista;
    }
}
