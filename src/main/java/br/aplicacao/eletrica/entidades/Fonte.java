/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.aplicacao.eletrica.entidades;

import br.aplicacao.eletrica.enums.UnidadePotencia;
import br.aplicacao.eletrica.servico.tableModel.Column;
import br.aplicacao.eletrica.servico.tableModel.TableModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author chris
 */
@Entity
@Table(name = "Fonte")
@TableModel
public class Fonte implements Serializable, Entidade<Fonte> {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private Projeto projeto;
    @OneToOne()
    @Column(colName = "Concessionária", colPosition = 2)
    private Concessionaria concessionaria;
    @OneToMany(mappedBy = "fonte", targetEntity = Quadro.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Quadro> quadros = new ArrayList<>();
    @Column(colName = "Nome", colPosition = 0)
    private String nome;
    @Column(colName = "TensãoFN", colPosition = 1)
    private double tensaoFN;
    @Lob
    private String descricao;

    public double getPotenciaInstalada(UnidadePotencia unidadeDestino) {
        double total = 0;
        for (Quadro quadro : this.getQuadros()) {
            total += quadro.getPotenciaInstalada(unidadeDestino);
        }
        return total;
    }

    public double getDemanda(UnidadePotencia unidadeDestino) {
        double total = 0;
        List<Quadro> lista = this.getQuadros();
        for (int i = 0; i < lista.size(); i++) {
            total += lista.get(i).getDemanda(unidadeDestino);
        }
        return total;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Concessionaria getConcessionaria() {
        return concessionaria;
    }

    public void setConcessionaria(Concessionaria concessionaria) {
        this.concessionaria = concessionaria;
    }

    public List<Quadro> getQuadros() {
        return quadros;
    }

    public void setQuadros(List<Quadro> quadros) {
        this.quadros = quadros;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTensaoFN() {
        return tensaoFN;
    }

    public void setTensaoFN(double tensaoFN) {
        this.tensaoFN = tensaoFN;
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
        if (!(object instanceof Fonte)) {
            return false;
        }
        Fonte other = (Fonte) object;
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
    public Fonte clonarSemID() {
        Fonte f = copiar();
        f.setId(null);
        return f;
    }

    @Override
    public Fonte copiar() {
        Fonte f = new Fonte();
        f.setId(id);
        f.setNome(nome);
        f.setConcessionaria(concessionaria);
        f.setTensaoFN(tensaoFN);
        f.setProjeto(projeto);

        for (Quadro q : quadros) {
            f.quadros.add(q);
        }
        return f;
    }

    @Override
    public void apagar() {

        id = 0;
        concessionaria = null;
        quadros.clear();
        nome = "";
        tensaoFN = 0;
    }
}
