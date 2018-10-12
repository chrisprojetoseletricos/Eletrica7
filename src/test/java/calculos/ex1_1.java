package calculos;
import br.aplicacao.eletrica.calculos.CalculoUtils;
import br.aplicacao.eletrica.calculos.CalculoUtils.MODELO_INSTALACAO;
import java.util.ArrayList;
import java.util.List;


import br.aplicacao.eletrica.entidades.Circuito;
import br.aplicacao.eletrica.entidades.Equipamento;
import br.aplicacao.eletrica.entidades.Fonte;
import br.aplicacao.eletrica.entidades.Projeto;
import br.aplicacao.eletrica.entidades.Quadro;
import br.aplicacao.eletrica.enums.UnidadePotencia;

import br.aplicacao.eletrica.enums.Usabilidade;

public class ex1_1 {

	public static void main(String[] args) {

		Projeto pro = new Projeto();
		pro.setNome("Projeto");

		Fonte fonte = new Fonte();
		fonte.setNome("Fonte");

		Quadro QGF = new Quadro();
		QGF.setId(1);
		QGF.setNome("QGF");

		Quadro CCM1 = new Quadro();
		CCM1.setNome("CCM1");
		CCM1.setId(2);
                CCM1.setQuadroPai(1);

		Quadro CCM2 = new Quadro();
		CCM2.setNome("CCM2");
		CCM2.setId(3);
                CCM2.setQuadroPai(1);

		Quadro QDL = new Quadro();
		QDL.setNome("QDL");
		QDL.setId(4);
                QDL.setQuadroPai(1);

		Circuito CIR_1 = new Circuito();
		CIR_1.setNome("CIR_1");
		Circuito CIR_2 = new Circuito();
		CIR_2.setNome("CIR_2");
		Circuito CIR_3 = new Circuito();
		CIR_3.setNome("CIR_3");
		Circuito CIR_FL = new Circuito();
		CIR_FL.setNome("CIR_FL");
		Circuito CIR_IN = new Circuito();
		CIR_IN.setNome("CIR_IN");

		Equipamento motor1 = new Equipamento();
		motor1.setNome("Motor1");
		motor1.setPotencia(75);
		motor1.setUnidade(UnidadePotencia.CV);
		motor1.setQuantidade(10);
		motor1.setFd(0.87);
		motor1.setRendimento(0.92);
		motor1.setFp(0.86);
		motor1.setfSimu(0.65);
		motor1.setUsabilidade(Usabilidade.GERAL);

		Equipamento motor2 = new Equipamento();
		motor2.setNome("Motor2");
		motor2.setPotencia(30);
		motor2.setUnidade(UnidadePotencia.CV);
		motor2.setQuantidade(10);
		motor2.setFd(0.85);
		motor2.setRendimento(0.9);
		motor2.setFp(0.83);
		motor2.setfSimu(0.65);
		motor2.setUsabilidade(Usabilidade.GERAL);

		Equipamento motor3 = new Equipamento();
		motor3.setNome("Motor3");
		motor3.setPotencia(50);
		motor3.setUnidade(UnidadePotencia.CV);
		motor3.setQuantidade(5);
		motor3.setFd(0.87);
		motor3.setRendimento(0.92);
		motor3.setFp(0.86);
		motor3.setfSimu(0.70);
		motor3.setUsabilidade(Usabilidade.GERAL);

		Equipamento lampFlu = new Equipamento();
		lampFlu.setNome("LampFlu");
		lampFlu.setQuantidade(150);
		lampFlu.setPotencia(40);
		lampFlu.setUnidade(UnidadePotencia.W);
		lampFlu.setPerdasReator(15.3);
		lampFlu.setFp(0.4);
		lampFlu.setUsabilidade(Usabilidade.ILUMINACAO_FLUORESCENTE);

		Equipamento lampInc = new Equipamento();
		lampInc.setNome("LampInc");
		lampInc.setQuantidade(52);
		lampInc.setPotencia(100);
		lampInc.setUnidade(UnidadePotencia.W);
		lampInc.setUsabilidade(Usabilidade.ILUMINACAO_INCADESCENTE);

		CIR_1.getEquipamentos().add(motor1);
		CIR_2.getEquipamentos().add(motor2);
		CIR_3.getEquipamentos().add(motor3);
		CIR_FL.getEquipamentos().add(lampFlu);
		CIR_IN.getEquipamentos().add(lampInc);

		CCM1.getCircuitos().add(CIR_1);
		CCM2.getCircuitos().add(CIR_2);
		CCM2.getCircuitos().add(CIR_3);
		QDL.getCircuitos().add(CIR_FL);
		QDL.getCircuitos().add(CIR_IN);

		List<Integer> lista = new ArrayList<>();
		lista.add(CCM1.getId());
		lista.add(CCM2.getId());
		lista.add(QDL.getId());
		QGF.setListaQuadros(lista);

		List<Quadro> lista2 = new ArrayList<>();
		lista2.add(QGF);
		fonte.setQuadros(lista2);
		List<Fonte> lista3 = new ArrayList<>();
		lista3.add(fonte);
		pro.setFontes(lista3);

		UnidadePotencia unidade = UnidadePotencia.VA;
		double demanda = new CalculoUtils()//
                        .comFonte(fonte)//
                        .comModelo(MODELO_INSTALACAO.INDUSTRIAL)//
			.getDemanda(unidade);
		double potInstalada = new CalculoUtils()//
                        .comFonte(fonte).comModelo(MODELO_INSTALACAO.INDUSTRIAL)//
                        .getPotenciaInstalada(unidade);
		double fatorDemanda = demanda / potInstalada;

		System.out.println("Demanda: " + demanda+" "+unidade);
		System.out.println("Potência instalada: " + potInstalada+" "+unidade);
		System.out.println("Fator demanda: " + fatorDemanda);
		
		//Demanda: 725323.3924744732 VA
		//Potência instalada: 1086152.8840336066 VA
		//Fator demanda: 0.667791250326442

	}
}
