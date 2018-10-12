/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.aplicacao.eletrica.janelas;

import br.aplicacao.eletrica.controle.DesktopPane;
import br.aplicacao.eletrica.controle.Ids;
import br.aplicacao.eletrica.entidades.Circuito;
import br.aplicacao.eletrica.entidades.Equipamento;
import br.aplicacao.eletrica.entidades.Quadro;
import br.aplicacao.eletrica.enums.Instalacao;
import br.aplicacao.eletrica.enums.TempAmbiente;
import br.aplicacao.eletrica.enums.Usabilidade;
import br.aplicacao.eletrica.enums.UsoDr;
import br.aplicacao.eletrica.servico.CircuitoService;
import br.aplicacao.eletrica.servico.EquipamentoService;
import br.aplicacao.eletrica.servico.FonteService;
import br.aplicacao.eletrica.servico.QuadroService;
import br.aplicacao.eletrica.uteis.ApenasNumero;
import br.aplicacao.eletrica.uteis.Numero;
import br.aplicacao.eletrica.uteis.TrataID;
import br.aplicacao.eletrica.servico.tableModel.GenericTableModel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chris
 */
public class QuadroFrm extends javax.swing.JInternalFrame implements KeyListener {

    private GenericTableModel tabelaModelo;
    private CondutorFrm condutorFrm;
    private CurtoCircuitoFrm curtoFrm;

    /**
     * Creates new form ProjetoFrm
     */
    public QuadroFrm() {
        initComponents();
        this.iniciaTabelaQuadros();
        this.eventoSelecaoTabela();
        this.adicionarKeyListener();
        this.cbUsabilidadeItens();
        this.cbQuadroPaiItens();
        this.cbTemperaturaAmbienteItens();
        this.cbInstalacaoItens();
        this.cbUsoDeDRItens();
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
        lblIdQuadro = new javax.swing.JLabel();
        scrollEsquerdo = new javax.swing.JScrollPane();
        painelEsquerdo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoLocal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoFatorPotencia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoFatorDemanda = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbUsabilidade = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbUsoDeDR = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbQuadroPai = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbTemperaturaAmbiente = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cbInstalacao = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        campoPot100Demanda = new javax.swing.JTextField();
        painelDireito = new javax.swing.JPanel();
        scrollDireito = new javax.swing.JScrollPane();
        tabelaQuadro = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Quadro");
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
                .addComponent(lblIdQuadro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExcluir)
                        .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblIdQuadro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        scrollEsquerdo.setBorder(null);
        scrollEsquerdo.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        painelEsquerdo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 204))); // NOI18N
        painelEsquerdo.setPreferredSize(new java.awt.Dimension(300, 500));

        jLabel1.setText("Nome:");

        jLabel2.setText("Local:");

        jLabel3.setText("Fator de potência:");

        campoFatorPotencia.setName("campoFatorPotencia"); // NOI18N

        jLabel5.setText("Fator de demanda:");

        campoFatorDemanda.setName("campoFatorDemanda"); // NOI18N

        jLabel6.setText("Usabilidade:");

        cbUsabilidade.setMaximumSize(new java.awt.Dimension(0, 0));

        jLabel7.setText("Uso de DR:");

        jLabel8.setText("Quadro pai:");

        jLabel9.setText("Temperatura ambiente (°C):");

        jLabel10.setText("Instalação:");

        jLabel11.setText("Potência para 100% de demanda:");

        campoPot100Demanda.setName("campoPot100Demanda"); // NOI18N

        javax.swing.GroupLayout painelEsquerdoLayout = new javax.swing.GroupLayout(painelEsquerdo);
        painelEsquerdo.setLayout(painelEsquerdoLayout);
        painelEsquerdoLayout.setHorizontalGroup(
            painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEsquerdoLayout.createSequentialGroup()
                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEsquerdoLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(campoLocal)
                            .addComponent(campoFatorPotencia)
                            .addComponent(campoFatorDemanda)))
                    .addGroup(painelEsquerdoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelEsquerdoLayout.createSequentialGroup()
                                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbQuadroPai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbUsoDeDR, 0, 321, Short.MAX_VALUE)
                                    .addComponent(cbUsabilidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(painelEsquerdoLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbTemperaturaAmbiente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(painelEsquerdoLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbInstalacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(painelEsquerdoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoPot100Demanda, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jLabel2)
                    .addComponent(campoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoFatorPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoFatorDemanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(campoPot100Demanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbUsabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbUsoDeDR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbQuadroPai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbTemperaturaAmbiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbInstalacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(197, Short.MAX_VALUE))
        );

        scrollEsquerdo.setViewportView(painelEsquerdo);

        painelDireito.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 255))); // NOI18N

        scrollDireito.setBorder(null);

        tabelaQuadro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabelaQuadro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaQuadroMouseClicked(evt);
            }
        });
        scrollDireito.setViewportView(tabelaQuadro);

        javax.swing.GroupLayout painelDireitoLayout = new javax.swing.GroupLayout(painelDireito);
        painelDireito.setLayout(painelDireitoLayout);
        painelDireitoLayout.setHorizontalGroup(
            painelDireitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollDireito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
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
                    .addComponent(scrollEsquerdo, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                    .addComponent(painelDireito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 691, 463);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Quadro quadro = this.getDados();
            condutorFrm = new CondutorFrm(null,true);
            curtoFrm = new CurtoCircuitoFrm(null,true);
            //DesktopPane.desktop.add(condutorFrm);
            try {
                condutorFrm.setDados(QuadroService.getById(Ids.idQuadro).getCondutor());
                curtoFrm.setDados(QuadroService.getById(Ids.idQuadro).getCurto());
            } catch (Exception e) {
            }
            condutorFrm.setVisible(true);
            curtoFrm.setVisible(true);
        try {
            quadro.setCondutor(condutorFrm.getCondutor());
            quadro.setCurto(curtoFrm.getCurto());
        } catch (Exception e) {
        }

        QuadroService.salva(quadro);

        this.apagaDadosFrm();
        this.iniciaTabelaQuadros();
       // Ids.idQuadro = 0;
        Ids.idCondutor = 0;
        Ids.idCurto = 0;

    }//GEN-LAST:event_btnSalvarActionPerformed


    
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        QuadroService.removeById(Ids.idQuadro);
        this.iniciaTabelaQuadros();
        this.apagaDadosFrm();
        Ids.idQuadro = 0;
        Ids.idCondutor = 0;
        Ids.idCurto = 0;
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        Quadro q = QuadroService.getById(Ids.idQuadro).clonarSemID();
        QuadroService.salva(q);
        for (Circuito circuito : q.getCircuitos()) {
            Circuito c = circuito.clonarSemID();
            CircuitoService.salva(c);
            for (Equipamento equipamento : c.getEquipamentos()) {
                Equipamento e = equipamento.clonarSemID();
                EquipamentoService.salva(e);
            }
        }
        this.iniciaTabelaQuadros();
        this.apagaDadosFrm();
        Ids.idQuadro = 0;
        Ids.idCondutor = 0;
        Ids.idCurto = 0;
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void tabelaQuadroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaQuadroMouseClicked
        if (evt.getClickCount() == 1) {

        }
        if (evt.getClickCount() == 2) {
            if (Ids.idQuadro > 0) {
                this.setVisible(false);
                CircuitoFrm circuito = new CircuitoFrm();
                DesktopPane.desktop.add(circuito);
                circuito.setVisible(true);
                Ids.idCondutor = 0;
                Ids.idCurto = 0;
            }
        }
    }//GEN-LAST:event_tabelaQuadroMouseClicked

    private void cbUsabilidadeItens() {
        cbUsabilidade.removeAllItems();
        cbUsabilidade.addItem(null);
        for (Usabilidade usa : Usabilidade.getLista()) {
            cbUsabilidade.addItem(usa);
        }
    }

    private void cbQuadroPaiItens() {
        cbQuadroPai.removeAllItems();
        cbQuadroPai.addItem(null);
        for (Quadro qua : QuadroService.getAll()) {
            cbQuadroPai.addItem(qua);
        }
    }

    private void cbTemperaturaAmbienteItens() {
        cbTemperaturaAmbiente.removeAllItems();
        cbTemperaturaAmbiente.addItem(null);
        for (TempAmbiente tem : TempAmbiente.getLista()) {
            cbTemperaturaAmbiente.addItem(tem);
        }
    }

    private void cbInstalacaoItens() {
        cbInstalacao.removeAllItems();
        cbInstalacao.addItem(null);
        for (Instalacao ins : Instalacao.getLista()) {
            cbInstalacao.addItem(ins);
        }
    }

    private void cbUsoDeDRItens() {
        cbUsoDeDR.removeAllItems();
        cbUsoDeDR.addItem(null);
        for (UsoDr uso : UsoDr.getLista()) {
            cbUsoDeDR.addItem(uso);
        }
    }

    private void eventoSelecaoTabela() {
        tabelaQuadro.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent evt) {
                int linha = tabelaQuadro.getSelectedRow();
                if (evt.getValueIsAdjusting() == true && linha > -1) {
                    Quadro quadro = (Quadro) tabelaModelo.loadItem(linha);
                    setDados(quadro);
                    Ids.idQuadro = quadro.getId();
                    try {
                        Ids.idCondutor = quadro.getCondutor().getId();
                        Ids.idCurto = quadro.getCurto().getId();
                    } catch (Exception e) {
                    }
                }
            }
        }
        );
    }

    private void adicionarKeyListener() {
        this.campoFatorDemanda.addKeyListener(this);
        this.campoFatorPotencia.addKeyListener(this);
        this.campoPot100Demanda.addKeyListener(this);
    }

    public void iniciaTabelaQuadros() {
        //Verificar porque não posso usar List<Fonte> lista = ProjetoService.getById(Ids.idProjeto).getFontes(); 
        //A tabelaFonte não atualiza a última inclusão como de a Entidade anterior não atualizasse.
        List<Quadro> todos = QuadroService.getAll();
        List<Quadro> lista = new ArrayList<>();
        for (Quadro q : todos) {
            if (Objects.equals(q.getFonte().getId(), Ids.idFonte)) {
                lista.add(q);
            }
        }

        if (!lista.isEmpty()) {
            tabelaModelo = new GenericTableModel(lista, Quadro.class);
            tabelaQuadro.setModel(tabelaModelo);
        } else {
            DefaultTableModel model = new DefaultTableModel();
            this.tabelaQuadro.setModel(model);
        }
    }

    private Quadro getDados() {
        Quadro quadro;
        if (Ids.idQuadro > 0) {
            quadro = QuadroService.getById(TrataID.IntegerToInteger(Ids.idQuadro));
        } else {
            quadro = new Quadro();
            quadro.setFonte(FonteService.getById(TrataID.IntegerToInteger(Ids.idFonte)));
        }
        quadro.setId(TrataID.IntegerToInteger(Ids.idQuadro));
        quadro.setNome(this.campoNome.getText());
        quadro.setFd(Numero.stringToDouble(this.campoFatorDemanda.getText(), 1));
        quadro.setFp(Numero.stringToDouble(this.campoFatorPotencia.getText(), 1));
        quadro.setLocalizacao(this.campoLocal.getText());
        quadro.setPot100PercDem(Numero.stringToDouble(this.campoPot100Demanda.getText(), 1));
        quadro.setUsabilidade((Usabilidade) cbUsabilidade.getModel().getSelectedItem());
        quadro.setUsoDeDR((UsoDr) cbUsoDeDR.getModel().getSelectedItem());
        quadro.setTempAmbiente((TempAmbiente) cbTemperaturaAmbiente.getModel().getSelectedItem());
        quadro.setInstalacao((Instalacao) cbInstalacao.getModel().getSelectedItem());

        try {
            quadro.setQuadroPai(((Quadro) cbQuadroPai.getModel().getSelectedItem()).getId());
        } catch (Exception e) {
            quadro.setQuadroPai(null);
        }

        return quadro;
    }

    public void apagaDadosFrm() {
        this.lblIdQuadro.setText("0");
        this.campoNome.setText("");
        this.campoFatorDemanda.setText("");
        this.campoFatorPotencia.setText("");
        this.campoLocal.setText("");
        this.campoPot100Demanda.setText("");
        this.cbQuadroPai.setSelectedIndex(-1);
        this.cbUsabilidade.setSelectedIndex(-1);
        this.cbUsoDeDR.setSelectedIndex(-1);
        this.cbTemperaturaAmbiente.setSelectedIndex(-1);
        this.cbInstalacao.setSelectedIndex(-1);
    }

    public void setDados(Quadro quadro) {
        if (quadro != null) {
            Ids.idQuadro = quadro.getId();
            this.lblIdQuadro.setText(Ids.idQuadro.toString());
            this.campoNome.setText(quadro.getNome());
            this.campoFatorDemanda.setText(Numero.decimal(quadro.getFd(), "##.##"));
            this.campoFatorPotencia.setText(Numero.decimal(quadro.getFp(), "##.##"));
            this.campoLocal.setText(quadro.getLocalizacao());
            this.campoPot100Demanda.setText(Numero.decimal(quadro.getPot100PercDem(), "##.##"));
            this.cbUsabilidade.getModel().setSelectedItem(quadro.getUsabilidade());
            this.cbUsoDeDR.getModel().setSelectedItem(quadro.getUsoDeDR());
            this.cbTemperaturaAmbiente.getModel().setSelectedItem(quadro.getTempAmbiente());
            this.cbInstalacao.getModel().setSelectedItem(quadro.getInstalacao());
            try {
                this.cbQuadroPai.getModel().setSelectedItem(QuadroService.getById(quadro.getQuadroPai()));
            } catch (Exception e) {

            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField campoFatorDemanda;
    private javax.swing.JTextField campoFatorPotencia;
    private javax.swing.JTextField campoLocal;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoPot100Demanda;
    private javax.swing.JComboBox<Instalacao> cbInstalacao;
    private javax.swing.JComboBox<Quadro> cbQuadroPai;
    private javax.swing.JComboBox<TempAmbiente> cbTemperaturaAmbiente;
    private javax.swing.JComboBox<Usabilidade> cbUsabilidade;
    private javax.swing.JComboBox<UsoDr> cbUsoDeDR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblIdQuadro;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelDireito;
    private javax.swing.JPanel painelEsquerdo;
    private javax.swing.JScrollPane scrollDireito;
    private javax.swing.JScrollPane scrollEsquerdo;
    private javax.swing.JTable tabelaQuadro;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        ApenasNumero.campo(e, "campoPot100Demanda");
        ApenasNumero.campo(e, "campoFatorPotencia");
        ApenasNumero.campo(e, "campoFatorDemanda");
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}