/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.aplicacao.eletrica.entidades;

import br.aplicacao.eletrica.calculos.PotenciaInstalada;
import br.aplicacao.eletrica.enums.Instalacao;
import br.aplicacao.eletrica.enums.TempAmbiente;
import br.aplicacao.eletrica.enums.UnidadePotencia;
import br.aplicacao.eletrica.enums.Usabilidade;
import br.aplicacao.eletrica.enums.UsoDr;
import br.aplicacao.eletrica.servico.QuadroService;
import br.aplicacao.eletrica.servico.tableModel.Column;
import br.aplicacao.eletrica.servico.tableModel.TableModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name = "Quadro")
@TableModel
public class Quadro implements Serializable, Entidade<Quadro> {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private Fonte fonte;
    @OneToMany(mappedBy = "quadro", targetEntity = Circuito.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Circuito> circuitos = new ArrayList<Circuito>();
    @OneToOne(cascade = CascadeType.ALL)
    private Condutor condutor;
    @OneToOne(cascade = CascadeType.ALL)
    private Curto curto;
    @Enumerated(EnumType.STRING)
    private UsoDr usoDeDR;
    private double fd;
    private double fp;
    private double fSimu;
    @Column(colName = "Local", colPosition = 1)
    private String localizacao;
    @Column(colName = "Nome", colPosition = 0)
    private String nome;
    private double pot100PercDem;
    @Enumerated(EnumType.STRING)
    private Usabilidade usabilidade;
    @Enumerated(EnumType.STRING)
    private TempAmbiente tempAmbiente;
    @Enumerated(EnumType.STRING)
    private Instalacao instalacao;
    private Integer quadroPai;
    @ElementCollection
    private List<Integer> listaQuadros = new ArrayList<>();

    public double getDemanda(UnidadePotencia unidadeDestino) {
        double total = 0;

        for (Circuito c : this.getCircuitos()) {
            for (Equipamento e : c.getEquipamentos()) {
                total += e.getQuantidade() * e.getDemanda(unidadeDestino) * fSimu;
            }
        }

        try {
            for (Integer subQuadroId : this.listaQuadros) {
                total += QuadroService.getById(subQuadroId).getDemanda(unidadeDestino);
            }
        } catch (Exception e) {
        }
        return total;
    }

    public double getPotenciaInstalada(UnidadePotencia unidadeDestino) {
        return new PotenciaInstalada()//
                .withQuadro(this)//
                .withUnidadeDestino(unidadeDestino)//
                .valor();
    }

    public double getfSimu() {
        return fSimu;
    }

    public void setfSimu(double fSimu) {
        this.fSimu = fSimu;
    }

    
    
    public List<Integer> getListaQuadros() {
        return listaQuadros;
    }

    public void setListaQuadros(List<Integer> listaQuadros) {
        this.listaQuadros = listaQuadros;
    }

    public Integer getQuadroPai() {
        return quadroPai;
    }

    public void setQuadroPai(Integer quadroPai) {
        this.quadroPai = quadroPai;
    }

    public Instalacao getInstalacao() {
        return instalacao;
    }

    public void setInstalacao(Instalacao instalacao) {
        this.instalacao = instalacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public TempAmbiente getTempAmbiente() {
        return tempAmbiente;
    }

    public void setTempAmbiente(TempAmbiente tempAmbiente) {
        this.tempAmbiente = tempAmbiente;
    }

    public Fonte getFonte() {
        return fonte;
    }

    public void setFonte(Fonte fonte) {
        this.fonte = fonte;
    }

    public List<Circuito> getCircuitos() {
        return circuitos;
    }

    public void setCircuitos(List<Circuito> circuitos) {
        this.circuitos = circuitos;
    }

    public Condutor getCondutor() {
        return condutor;
    }

    public void setCondutor(Condutor condutor) {
        if (condutor != null) {
            this.condutor = condutor;
        }
    }

    public Curto getCurto() {
        return curto;
    }

    public void setCurto(Curto curto) {
        this.curto = curto;
    }

    public UsoDr getUsoDeDR() {
        return usoDeDR;
    }

    public void setUsoDeDR(UsoDr usoDeDR) {
        this.usoDeDR = usoDeDR;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPot100PercDem() {
        return pot100PercDem;
    }

    public void setPot100PercDem(double pot100PercDem) {
        this.pot100PercDem = pot100PercDem;
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
        if (!(object instanceof Quadro)) {
            return false;
        }
        Quadro other = (Quadro) object;
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
    public Quadro clonarSemID() {
        Quadro q = copiar();
        q.setId(null);
        return q;
    }

    @Override
    public Quadro copiar() {
        Quadro q = new Quadro();
        q.setId(id);
        q.setNome(nome);
        q.setFonte(fonte);
        q.setCondutor(condutor);
        q.setCurto(curto);
        q.setFd(fd);
        q.setFp(fp);
        q.setLocalizacao(localizacao);
        q.setPot100PercDem(pot100PercDem);
        q.setUsabilidade(usabilidade);
        q.setUsoDeDR(usoDeDR);
        q.setInstalacao(instalacao);
        q.setTempAmbiente(tempAmbiente);
        q.setfSimu(fSimu);
        q.setQuadroPai(quadroPai);
        for (Circuito c : circuitos) {
            q.circuitos.add(c);
        }
        return q;
    }

    @Override
    public void apagar() {

        id = 0;
        fonte = null;
        circuitos.clear();
        condutor = null;
        curto = null;
        usoDeDR = null;
        fd = 0;
        fp = 0;
        localizacao = "";
        nome = "";
        pot100PercDem = 0;
        usabilidade = null;
        fSimu = 0;
        quadroPai = 0;
    }

}
