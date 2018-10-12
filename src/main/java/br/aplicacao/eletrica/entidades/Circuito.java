/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.aplicacao.eletrica.entidades;

import br.aplicacao.eletrica.calculos.CorrenteIB;
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author chris
 */
@Entity
@Table(name = "Circuito")
@TableModel
public class Circuito implements Serializable, Entidade<Circuito> {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private Quadro quadro;
    @OneToOne(cascade = CascadeType.ALL)
    @Column(colName = "Condutor", colPosition = 1)
    private Condutor condutor;
    @OneToOne(cascade = CascadeType.ALL)
    @Column(colName = "Dados CC", colPosition = 2)
    private Curto curto;
    @OneToMany(mappedBy = "circuito", targetEntity = Equipamento.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Equipamento> equipamentos = new ArrayList<Equipamento>();
    @Column(colName = "Circuito", colPosition = 0)
    private String nome;

    public double getCorrenteIB() {
        return new CorrenteIB()//
                .withEquipamentos(this.getEquipamentos())//
                .valor();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Quadro getQuadro() {
        return quadro;
    }

    public void setQuadro(Quadro quadro) {
        this.quadro = quadro;
    }

    public Condutor getCondutor() {
        return condutor;
    }

    public void setCondutor(Condutor condutor) {
        this.condutor = condutor;
    }

    public Curto getCurto() {
        return curto;
    }

    public void setCurto(Curto curto) {
        this.curto = curto;
    }

    public List<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
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
        if (!(object instanceof Circuito)) {
            return false;
        }
        Circuito other = (Circuito) object;
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
    public Circuito clonarSemID() {
        Circuito c = copiar();
        c.setId(null);
        return c;
    }

    @Override
    public Circuito copiar() {
        Circuito c = new Circuito();
        c.setId(id);
        c.setNome(nome);
        c.setQuadro(quadro);
        c.setCondutor(condutor);
        c.setCurto(curto);
        for (Equipamento e : equipamentos) {
            c.equipamentos.add(e);
        }
        return c;
    }

    @Override
    public void apagar() {
        id = 0;
        quadro = null;
        condutor = null;
        curto = null;
        equipamentos.clear();
        nome = "";
    }
}
