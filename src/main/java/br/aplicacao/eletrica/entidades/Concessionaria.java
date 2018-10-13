/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.aplicacao.eletrica.entidades;

import br.aplicacao.eletrica.enums.BitolasMili;
import br.aplicacao.eletrica.enums.DiametroPolegadas;
import br.aplicacao.eletrica.enums.DisjuntorTermoMag;
import br.aplicacao.eletrica.enums.MetodoCalculo;
import br.aplicacao.eletrica.enums.TiposCondutores;
import br.aplicacao.eletrica.enums.TiposFornecimento;
import br.aplicacao.eletrica.servico.tableModel.TableModel;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author chris
 */
@Entity
@Table(name = "Concessionaria")
@TableModel
public class Concessionaria implements Serializable, Entidade<Concessionaria> {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String localizacao;
    private double tensaoFN;
    private MetodoCalculo metodoCalculo;
    private TiposFornecimento tiposFornecimento;
    private String carga;
    private DisjuntorTermoMag disjuntorTermoMag;
    private TiposCondutores tipoCondutor;
    private BitolasMili faseMinimaCobreIsolado;
    private BitolasMili neutroMinimoCobreIsolado;
    private DiametroPolegadas diametroEletroAcoGalva;
    private DiametroPolegadas diametroEletroAterramento;

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public double getTensaoFN() {
        return tensaoFN;
    }

    public void setTensaoFN(double tensaoFN) {
        this.tensaoFN = tensaoFN;
    }

    public MetodoCalculo getMetodoCalculo() {
        return metodoCalculo;
    }

    public void setMetodoCalculo(MetodoCalculo metodoCalculo) {
        this.metodoCalculo = metodoCalculo;
    }

    public TiposFornecimento getTiposFornecimento() {
        return tiposFornecimento;
    }

    public void setTiposFornecimento(TiposFornecimento tiposFornecimento) {
        this.tiposFornecimento = tiposFornecimento;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public DisjuntorTermoMag getDisjuntorTermoMag() {
        return disjuntorTermoMag;
    }

    public void setDisjuntorTermoMag(DisjuntorTermoMag disjuntorTermoMag) {
        this.disjuntorTermoMag = disjuntorTermoMag;
    }

    public TiposCondutores getTipoCondutor() {
        return tipoCondutor;
    }

    public void setTipoCondutor(TiposCondutores tipoCondutor) {
        this.tipoCondutor = tipoCondutor;
    }

    public BitolasMili getFaseMinimaCobreIsolado() {
        return faseMinimaCobreIsolado;
    }

    public void setFaseMinimaCobreIsolado(BitolasMili faseMinimaCobreIsolado) {
        this.faseMinimaCobreIsolado = faseMinimaCobreIsolado;
    }

    public BitolasMili getNeutroMinimoCobreIsolado() {
        return neutroMinimoCobreIsolado;
    }

    public void setNeutroMinimoCobreIsolado(BitolasMili neutroMinimoCobreIsolado) {
        this.neutroMinimoCobreIsolado = neutroMinimoCobreIsolado;
    }

    public DiametroPolegadas getDiametroEletroAcoGalva() {
        return diametroEletroAcoGalva;
    }

    public void setDiametroEletroAcoGalva(DiametroPolegadas diametroEletroAcoGalva) {
        this.diametroEletroAcoGalva = diametroEletroAcoGalva;
    }

    public DiametroPolegadas getDiametroEletroAterramento() {
        return diametroEletroAterramento;
    }

    public void setDiametroEletroAterramento(DiametroPolegadas diametroEletroAterramento) {
        this.diametroEletroAterramento = diametroEletroAterramento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        if (!(object instanceof Concessionaria)) {
            return false;
        }
        Concessionaria other = (Concessionaria) object;
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
    public Concessionaria clonarSemID() {
        Concessionaria p = copiar();
        p.setId(null);
        return p;
    }

    @Override
    public Concessionaria copiar() {
        Concessionaria c = new Concessionaria();
        c.setId(id);
        c.setNome(nome);
        return c;
    }

    @Override
    public void apagar() {

        id = null;
        //carga = 0;
        //disjuntorTM = 0;
        //eletroduto = "";
        //fase = 0;
        //fornecimento = "";
        //local = "";
        //metodo = "";
        //neutro = 0;
        //nome = "";
        //tensaoFN = 0;
        //terra = 0;

    }
}
