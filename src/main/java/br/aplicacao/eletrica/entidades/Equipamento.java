/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.aplicacao.eletrica.entidades;

import br.aplicacao.eletrica.calculos.ConversorPotencia;
import br.aplicacao.eletrica.calculos.Corrente;
import br.aplicacao.eletrica.calculos.Demanda;
import br.aplicacao.eletrica.enums.Ligacao;
import br.aplicacao.eletrica.enums.UnidadePotencia;
import br.aplicacao.eletrica.enums.Usabilidade;
import br.aplicacao.eletrica.servico.tableModel.Column;
import br.aplicacao.eletrica.servico.tableModel.TableModel;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author chris
 */
@Entity
@Table(name = "Equipamento")
@TableModel
public class Equipamento implements Serializable, Entidade<Equipamento> {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private Circuito circuito;
    @Enumerated(EnumType.STRING)
    private Ligacao ligacao;
    private String ligacaoReal;
    @Column(colName = "Nome", colPosition = 0)
    private String nome;
    private int nPolos;
    private double perdasReator;
    @Column(colName = "Potência", colPosition = 1)
    private double potencia;
    private int quantidade;
    private double rendimento;
    private String descricao;
    private String localizacao;
    private double fd;
    private double fp;
    private double fs;
    private double fSimu;
    private double fu;
    @Enumerated(EnumType.STRING)
    private UnidadePotencia unidade;
    @Enumerated(EnumType.STRING)
    private Usabilidade usabilidade;
    private double tensaoFN;

    public double getCorrente() {
        return new Corrente()//
                .withLigacao(getLigacao())//
                .withPotencia(this.getPotencia())//
                .withTensao(this.getTensaoFN())//
                .withUnidade(this.getUnidade())
                .withFP(this.fp)//
                .valor();
    }

    public double getDemanda(UnidadePotencia unidadeDestino) {
        return new Demanda()//
                .withFd(this.getFd())//
                .withFp(this.getFp())//
                .withFu(this.getFu())//
                .withPerdasReator(this.getPerdasReator())//
                .withPotencia(this.getPotencia())//
                .withRendimento(this.getRendimento())//
                .withUnidadeOrigem(this.getUnidade())//
                .withUnidadeDestino(unidadeDestino)//
                .withUsabilidade(this.getUsabilidade())//
                .valor();
    }

    public double getPotencia(UnidadePotencia unidadeDestino) {
        return new ConversorPotencia()//
                .withFatorPotencia(fp)//
                .withPotencia(potencia)//
                .withUnidadeOrigem(unidade)//
                .withUnidadeDestino(unidadeDestino)//
                .converte();
    }

    public double getTensaoFN() {
        return tensaoFN;
    }

    public void setTensaoFN(double tensaoFN) {
        this.tensaoFN = tensaoFN;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Circuito getCircuito() {
        return circuito;
    }

    public void setCircuito(Circuito circuito) {
        this.circuito = circuito;
    }

    public Ligacao getLigacao() {
        return ligacao;
    }

    public void setLigacao(Ligacao ligacao) {
        this.ligacao = ligacao;
    }

    public String getLigacaoReal() {
        return ligacaoReal;
    }

    public void setLigacaoReal(String ligacaoReal) {
        this.ligacaoReal = ligacaoReal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnPolos() {
        return nPolos;
    }

    public void setnPolos(int nPolos) {
        this.nPolos = nPolos;
    }

    public double getPerdasReator() {
        return perdasReator;
    }

    public void setPerdasReator(double perdasReator) {
        this.perdasReator = perdasReator;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getFd() {
        return fd;
    }

    public void setFd(double fd) {
        this.fd = fd;
    }

    public double getFp() {
        return fp;
    }

    public void setFp(double fp) {
        this.fp = fp;
    }

    public double getFs() {
        return fs;
    }

    public void setFs(double fs) {
        this.fs = fs;
    }

    public double getfSimu() {
        return fSimu;
    }

    public void setfSimu(double fSimu) {
        this.fSimu = fSimu;
    }

    public double getFu() {
        return fu;
    }

    public void setFu(double fu) {
        this.fu = fu;
    }

    public UnidadePotencia getUnidade() {
        return unidade;
    }

    public void setUnidade(UnidadePotencia unidade) {
        this.unidade = unidade;
    }

    public Usabilidade getUsabilidade() {
        return usabilidade;
    }

    public void setUsabilidade(Usabilidade usabilidade) {
        this.usabilidade = usabilidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipamento)) {
            return false;
        }
        Equipamento other = (Equipamento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public Equipamento clonarSemID() {
        Equipamento e = copiar();
        e.setId(null);
        return e;
    }

    @Override
    public Equipamento copiar() {
        Equipamento e = new Equipamento();
        e.setId(id);
        e.setNome(nome);
        e.setDescricao(descricao);
        e.setFd(fd);
        e.setFp(fp);
        e.setFs(fSimu);
        e.setfSimu(fSimu);
        e.setFu(fu);
        e.setLigacao(ligacao);
        e.setLigacaoReal(ligacaoReal);
        e.setnPolos(nPolos);
        e.setPerdasReator(perdasReator);
        e.setPotencia(potencia);
        e.setQuantidade(quantidade);
        e.setRendimento(rendimento);
        e.setUnidade(unidade);
        e.setUsabilidade(usabilidade);
        e.setCircuito(circuito);
        e.setLocalizacao(localizacao);
        e.setTensaoFN(tensaoFN);
        return e;
    }

    @Override
    public void apagar() {
        id = 0;
        circuito = null;
        ligacao = null;
        ligacaoReal = "";
        nome = "";
        nPolos = 0;
        perdasReator = 0;
        potencia = 0;
        quantidade = 0;
        rendimento = 0;
        descricao = "";
        fd = 0;
        fp = 0;
        fs = 0;
        fSimu = 0;
        fu = 0;
        unidade = null;
        usabilidade = null;
        localizacao = "";
    }
}
