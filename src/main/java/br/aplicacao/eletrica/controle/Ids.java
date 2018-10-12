/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.aplicacao.eletrica.controle;

/**
 *
 * @author chris
 */
public class Ids {
    public static Integer idProjeto = 0;
    public static Integer idFonte = 0;
    public static Integer idQuadro = 0;
    public static Integer idCircuito = 0;
    public static Integer idEquipamento = 0;
    public static Integer idCondutor = 0;
    public static Integer idCurto = 0;
    
    public static void imprimiIds(){
        System.out.println("idProjeto: "+ idProjeto);
        System.out.println("idFonte: "+ idFonte);
        System.out.println("idQuadro: "+ idQuadro);
        System.out.println("idCircuito: "+ idCircuito);
        System.out.println("idEquipamento: "+ idEquipamento);
        System.out.println("idCondutor: "+ idCondutor);
        System.out.println("idCurto: "+ idCurto);
    }
}
