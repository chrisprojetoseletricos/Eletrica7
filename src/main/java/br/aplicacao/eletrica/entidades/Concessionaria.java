/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.aplicacao.eletrica.entidades;

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
