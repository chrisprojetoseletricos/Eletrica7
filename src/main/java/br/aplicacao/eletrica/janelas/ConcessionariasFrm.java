/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.aplicacao.eletrica.janelas;

import br.aplicacao.eletrica.controle.Ids;
import br.aplicacao.eletrica.entidades.Concessionaria;
import br.aplicacao.eletrica.enums.BitolasMili;
import br.aplicacao.eletrica.enums.DiametroPolegadas;
import br.aplicacao.eletrica.enums.DisjuntorTermoMag;
import br.aplicacao.eletrica.enums.MetodoCalculo;
import br.aplicacao.eletrica.enums.TiposCondutores;
import br.aplicacao.eletrica.enums.TiposFornecimento;
import br.aplicacao.eletrica.servico.ConcessionariaService;
import br.aplicacao.eletrica.uteis.ApenasNumero;
import br.aplicacao.eletrica.uteis.TrataID;
import br.aplicacao.eletrica.servico.tableModel.GenericTableModel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chris
 */
public final class ConcessionariasFrm extends javax.swing.JInternalFrame {

    private static final long serialVersionUID = 1L;

    private GenericTableModel tabelaModelo;

    /**
     * Creates new form ProjetoFrm
     */
    public ConcessionariasFrm() {
        initComponents();
        this.iniciaTabelaConcessionarias();
        this.eventoSelecaoTabela();
        this.eventoDigitar();
        cbMetodoCalculoItens();
        cbTiposFornecimentoItens();
        cbTipoCondutorItens();
        cbFaseMinimaItens();
        cbNeutroMinimoItens();
        cbDiametroEletroAcoGalvaItens();
        cbDiametroEletroAcoGalva1Itens();
        cbdisjuntorTermoMagItens();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelBotoes = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCopiar = new javax.swing.JButton();
        lblIdFonte = new javax.swing.JLabel();
        scrollEsquerdo = new javax.swing.JScrollPane();
        painelEsquerdo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoTensao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbMetodoCalculo = new javax.swing.JComboBox<>();
        cbTiposFornecimento = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        campoCarga = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbdisjuntorTermoMag = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        campoLocal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbTipoCondutor = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbFaseMinima = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cbNeutroMinimo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cbDiametroEletroAcoGalva = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cbDiametroEletroAcoGalvaEnterrado = new javax.swing.JComboBox<>();
        painelDireito = new javax.swing.JPanel();
        scrollDireito = new javax.swing.JScrollPane();
        tabelaConcessionaria = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Concessionaria");
        setName("ProjetoFrm"); // NOI18N

        btnSalvar.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSalvar.setIconTextGap(2);
        btnSalvar.setMargin(new java.awt.Insets(1, 1, 1, 1));
        btnSalvar.setMaximumSize(new java.awt.Dimension(71, 32));
        btnSalvar.setMinimumSize(new java.awt.Dimension(71, 32));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnExcluir.setIconTextGap(2);
        btnExcluir.setMargin(new java.awt.Insets(1, 1, 1, 1));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCopiar.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnCopiar.setText("Copiar");
        btnCopiar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCopiar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCopiar.setIconTextGap(2);
        btnCopiar.setMargin(new java.awt.Insets(1, 1, 1, 1));
        btnCopiar.setMaximumSize(new java.awt.Dimension(71, 32));
        btnCopiar.setMinimumSize(new java.awt.Dimension(71, 32));
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIdFonte, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBotoesLayout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluir)
                            .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblIdFonte, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        scrollEsquerdo.setBorder(null);
        scrollEsquerdo.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        painelEsquerdo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 204))); // NOI18N
        painelEsquerdo.setPreferredSize(new java.awt.Dimension(300, 200));

        jLabel1.setText("Nome:");

        jLabel2.setText("Tensão nominal F-N (V):");

        campoTensao.setName("campoTensao"); // NOI18N

        jLabel4.setText("Tipo de fornecimento:");

        jLabel5.setText("Método de cálculo:");

        jLabel3.setText("Carga (KW):");

        campoCarga.setName("campoCarga"); // NOI18N

        jLabel6.setText("Disjuntor termo-magnético (A):");

        jLabel7.setText("Local:");

        jLabel8.setText("Tipo de condutor:");

        jLabel9.setText("Fase mínima de cobre isolado (mm2):");

        jLabel10.setText("Neutro mínima de cobre isolado (mm2):");

        jLabel11.setText("Diâmetro do eletroduto de aço galva (pol): ");

        jLabel12.setText("Diâmetro do eletroduto de aterramento (pol): ");

        javax.swing.GroupLayout painelEsquerdoLayout = new javax.swing.GroupLayout(painelEsquerdo);
        painelEsquerdo.setLayout(painelEsquerdoLayout);
        painelEsquerdoLayout.setHorizontalGroup(
            painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEsquerdoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEsquerdoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(24, 24, 24)
                        .addComponent(cbdisjuntorTermoMag, 0, 202, Short.MAX_VALUE))
                    .addGroup(painelEsquerdoLayout.createSequentialGroup()
                        .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(12, 12, 12)
                        .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoLocal)
                            .addComponent(campoCarga)
                            .addComponent(cbTiposFornecimento, 0, 265, Short.MAX_VALUE)
                            .addGroup(painelEsquerdoLayout.createSequentialGroup()
                                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                                    .addComponent(campoTensao, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                                    .addComponent(cbMetodoCalculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEsquerdoLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbTipoCondutor, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelEsquerdoLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(24, 24, 24)
                        .addComponent(cbFaseMinima, 0, 159, Short.MAX_VALUE))
                    .addGroup(painelEsquerdoLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(24, 24, 24)
                        .addComponent(cbNeutroMinimo, 0, 144, Short.MAX_VALUE))
                    .addGroup(painelEsquerdoLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(24, 24, 24)
                        .addComponent(cbDiametroEletroAcoGalva, 0, 115, Short.MAX_VALUE))
                    .addGroup(painelEsquerdoLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(24, 24, 24)
                        .addComponent(cbDiametroEletroAcoGalvaEnterrado, 0, 92, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelEsquerdoLayout.setVerticalGroup(
            painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEsquerdoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoTensao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbMetodoCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbTiposFornecimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbdisjuntorTermoMag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbTipoCondutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbFaseMinima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbNeutroMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbDiametroEletroAcoGalva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cbDiametroEletroAcoGalvaEnterrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrollEsquerdo.setViewportView(painelEsquerdo);

        painelDireito.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 255))); // NOI18N
        painelDireito.setPreferredSize(new java.awt.Dimension(172, 22));

        scrollDireito.setBorder(null);

        tabelaConcessionaria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabelaConcessionaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaConcessionariaMouseClicked(evt);
            }
        });
        scrollDireito.setViewportView(tabelaConcessionaria);

        javax.swing.GroupLayout painelDireitoLayout = new javax.swing.GroupLayout(painelDireito);
        painelDireito.setLayout(painelDireitoLayout);
        painelDireitoLayout.setHorizontalGroup(
            painelDireitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollDireito, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
        );
        painelDireitoLayout.setVerticalGroup(
            painelDireitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollDireito, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollEsquerdo, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelDireito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollEsquerdo, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                    .addComponent(painelDireito, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 691, 481);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Concessionaria concessionaria = this.getDados();
        ConcessionariaService.salva(concessionaria);
        this.apagaDadosFrm();
        this.iniciaTabelaConcessionarias();
        //Ids.idConcessionaria = 0;
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        ConcessionariaService.removeById(Ids.idConcessionaria);
        this.iniciaTabelaConcessionarias();
        this.apagaDadosFrm();
        Ids.idConcessionaria = 0;
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        Concessionaria concessionaria = ConcessionariaService.getById(Ids.idConcessionaria).clonarSemID();
        ConcessionariaService.salva(concessionaria);

        this.iniciaTabelaConcessionarias();
        this.apagaDadosFrm();
        Ids.idConcessionaria = 0;
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void tabelaConcessionariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaConcessionariaMouseClicked
        if (evt.getClickCount() == 1) {

        }
        if (evt.getClickCount() == 2) {

        }
    }//GEN-LAST:event_tabelaConcessionariaMouseClicked

    private void cbMetodoCalculoItens() {
        cbMetodoCalculo.removeAllItems();
        cbMetodoCalculo.addItem(null);
        for (MetodoCalculo usa : MetodoCalculo.getLista()) {
            cbMetodoCalculo.addItem(usa);
        }
    }

    private void cbTiposFornecimentoItens() {
        cbTiposFornecimento.removeAllItems();
        cbTiposFornecimento.addItem(null);
        for (TiposFornecimento usa : TiposFornecimento.getLista()) {
            cbTiposFornecimento.addItem(usa);
        }
    }

    private void cbdisjuntorTermoMagItens() {
        cbdisjuntorTermoMag.removeAllItems();
        cbdisjuntorTermoMag.addItem(null);
        for (DisjuntorTermoMag usa : DisjuntorTermoMag.getLista()) {
            cbdisjuntorTermoMag.addItem(usa);
        }
    }

    private void cbTipoCondutorItens() {
        cbTipoCondutor.removeAllItems();
        cbTipoCondutor.addItem(null);
        for (TiposCondutores usa : TiposCondutores.getLista()) {
            cbTipoCondutor.addItem(usa);
        }
    }

    private void cbFaseMinimaItens() {
        cbFaseMinima.removeAllItems();
        cbFaseMinima.addItem(null);
        for (BitolasMili usa : BitolasMili.getLista()) {
            cbFaseMinima.addItem(usa);
        }
    }

    private void cbNeutroMinimoItens() {
        cbNeutroMinimo.removeAllItems();
        cbNeutroMinimo.addItem(null);
        for (BitolasMili usa : BitolasMili.getLista()) {
            cbNeutroMinimo.addItem(usa);
        }
    }

    private void cbDiametroEletroAcoGalvaItens() {
        cbDiametroEletroAcoGalva.removeAllItems();
        cbDiametroEletroAcoGalva.addItem(null);
        for (DiametroPolegadas usa : DiametroPolegadas.getLista()) {
            cbDiametroEletroAcoGalva.addItem(usa);
        }
    }

    private void cbDiametroEletroAcoGalva1Itens() {
        cbDiametroEletroAcoGalvaEnterrado.removeAllItems();
        cbDiametroEletroAcoGalvaEnterrado.addItem(null);
        for (DiametroPolegadas usa : DiametroPolegadas.getLista()) {
            cbDiametroEletroAcoGalvaEnterrado.addItem(usa);
        }
    }

    private void eventoSelecaoTabela() {
        tabelaConcessionaria.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent evt) {
                int linha = tabelaConcessionaria.getSelectedRow();
                if (evt.getValueIsAdjusting() == true && linha > -1) {
                    Concessionaria concessionaria = (Concessionaria) tabelaModelo.loadItem(linha);
                    setDados(concessionaria);
                    Ids.idConcessionaria = concessionaria.getId();
                }
            }
        }
        );
    }

    private void eventoDigitar() {
        this.campoTensao.addKeyListener(
                new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                ApenasNumero.campo(e, "campoTensao");
                ApenasNumero.campo(e, "campoCarga");
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    public void iniciaTabelaConcessionarias() {
        //Verificar porque não posso usar List<Concessionaria> lista = ProjetoService.getById(Ids.idProjeto).getConcessionarias(); 
        //A tabelaConcessionaria não atualiza a última inclusão como de a Entidade anterior não atualizasse.
        List<Concessionaria> todos = ConcessionariaService.getAll();

        if (!todos.isEmpty()) {
            tabelaModelo = new GenericTableModel(todos, Concessionaria.class);
            tabelaConcessionaria.setModel(tabelaModelo);
        } else {
            DefaultTableModel model = new DefaultTableModel();
            this.tabelaConcessionaria.setModel(model);
        }
    }

    private Concessionaria getDados() {
        Concessionaria concessionaria;
        if (Ids.idConcessionaria > 0) {
            concessionaria = ConcessionariaService.getById(Ids.idConcessionaria);
        } else {
            concessionaria = new Concessionaria();
        }
        concessionaria.setId(TrataID.IntegerToInteger(Ids.idConcessionaria));
        concessionaria.setCarga(this.campoCarga.getText());
        concessionaria.setNome(this.campoNome.getText());
        concessionaria.setNome(this.campoLocal.getText());
        concessionaria.setMetodoCalculo((MetodoCalculo) cbMetodoCalculo.getModel().getSelectedItem());
        concessionaria.setTiposFornecimento((TiposFornecimento) cbTiposFornecimento.getModel().getSelectedItem());
        concessionaria.setDisjuntorTermoMag((DisjuntorTermoMag) cbdisjuntorTermoMag.getModel().getSelectedItem());
        concessionaria.setTipoCondutor((TiposCondutores) cbTipoCondutor.getModel().getSelectedItem());
        concessionaria.setFaseMinimaCobreIsolado((BitolasMili) cbFaseMinima.getModel().getSelectedItem());
        concessionaria.setNeutroMinimoCobreIsolado((BitolasMili) cbNeutroMinimo.getModel().getSelectedItem());
        concessionaria.setDiametroEletroAcoGalva((DiametroPolegadas) cbDiametroEletroAcoGalva.getModel().getSelectedItem());
        concessionaria.setDiametroEletroAterramento((DiametroPolegadas) cbDiametroEletroAcoGalvaEnterrado.getModel().getSelectedItem());
        return concessionaria;
    }

    public void apagaDadosFrm() {

        Ids.idConcessionaria = 0;
        this.campoCarga.setText("");
        this.campoNome.setText("");
        this.campoLocal.setText("");
        cbMetodoCalculo.setSelectedIndex(-1);
        cbTiposFornecimento.setSelectedIndex(-1);
        cbdisjuntorTermoMag.setSelectedIndex(-1);
        cbTipoCondutor.setSelectedIndex(-1);
        cbFaseMinima.setSelectedIndex(-1);
        cbNeutroMinimo.setSelectedIndex(-1);
        cbDiametroEletroAcoGalva.setSelectedIndex(-1);
        cbDiametroEletroAcoGalvaEnterrado.setSelectedIndex(-1);
    }

    public void setDados(Concessionaria concessionaria) {
        if (concessionaria != null) {
            Ids.idConcessionaria = concessionaria.getId();
            this.campoCarga.setText(concessionaria.getCarga());
            this.campoNome.setText(concessionaria.getNome());
            this.campoLocal.setText(concessionaria.getLocalizacao());
            cbMetodoCalculo.getModel().setSelectedItem(concessionaria.getMetodoCalculo());
            cbTiposFornecimento.getModel().setSelectedItem(concessionaria.getTiposFornecimento());
            cbdisjuntorTermoMag.getModel().setSelectedItem(concessionaria.getDisjuntorTermoMag());
            cbTipoCondutor.getModel().setSelectedItem(concessionaria.getTipoCondutor());
            cbFaseMinima.getModel().setSelectedItem(concessionaria.getFaseMinimaCobreIsolado());
            cbNeutroMinimo.getModel().setSelectedItem(concessionaria.getNeutroMinimoCobreIsolado());
            cbDiametroEletroAcoGalva.getModel().setSelectedItem(concessionaria.getDiametroEletroAcoGalva());
            cbDiametroEletroAcoGalvaEnterrado.getModel().setSelectedItem(concessionaria.getDiametroEletroAterramento());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField campoCarga;
    private javax.swing.JTextField campoLocal;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoTensao;
    private javax.swing.JComboBox<DiametroPolegadas> cbDiametroEletroAcoGalva;
    private javax.swing.JComboBox<DiametroPolegadas> cbDiametroEletroAcoGalvaEnterrado;
    private javax.swing.JComboBox<BitolasMili> cbFaseMinima;
    private javax.swing.JComboBox<MetodoCalculo> cbMetodoCalculo;
    private javax.swing.JComboBox<BitolasMili> cbNeutroMinimo;
    private javax.swing.JComboBox<TiposCondutores> cbTipoCondutor;
    private javax.swing.JComboBox<TiposFornecimento> cbTiposFornecimento;
    private javax.swing.JComboBox<DisjuntorTermoMag> cbdisjuntorTermoMag;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblIdFonte;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelDireito;
    private javax.swing.JPanel painelEsquerdo;
    private javax.swing.JScrollPane scrollDireito;
    private javax.swing.JScrollPane scrollEsquerdo;
    private javax.swing.JTable tabelaConcessionaria;
    // End of variables declaration//GEN-END:variables
}