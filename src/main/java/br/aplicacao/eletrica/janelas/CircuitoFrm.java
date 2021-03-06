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
import br.aplicacao.eletrica.servico.CircuitoService;
import br.aplicacao.eletrica.servico.EquipamentoService;
import br.aplicacao.eletrica.servico.QuadroService;
import br.aplicacao.eletrica.uteis.TrataID;
import br.aplicacao.eletrica.servico.tableModel.GenericTableModel;
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
public class CircuitoFrm extends javax.swing.JInternalFrame {

    private GenericTableModel tabelaModelo;
    private CondutorFrm condutorFrm;
    private CurtoCircuitoFrm curtoFrm;

    /**
     * Creates new form ProjetoFrm
     */
    public CircuitoFrm() {
        initComponents();
        this.iniciaTabelaCircuitos();
        this.eventoSelecaoTabela();
        Ids.setIdCircuito((Integer) 0);
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
        btnNovo = new javax.swing.JButton();
        scrollEsquerdo = new javax.swing.JScrollPane();
        painelEsquerdo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        painelDireito = new javax.swing.JPanel();
        scrollDireito = new javax.swing.JScrollPane();
        tabelaCircuito = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Circuito");
        setName("ProjetoFrm"); // NOI18N
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        btnNovo.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNovo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNovo.setIconTextGap(2);
        btnNovo.setMargin(new java.awt.Insets(1, 1, 1, 1));
        btnNovo.setMaximumSize(new java.awt.Dimension(71, 32));
        btnNovo.setMinimumSize(new java.awt.Dimension(71, 32));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(481, Short.MAX_VALUE))
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir)
                    .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(painelBotoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 681, -1));

        scrollEsquerdo.setBorder(null);
        scrollEsquerdo.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollEsquerdo.setMinimumSize(new java.awt.Dimension(15, 5));
        scrollEsquerdo.setPreferredSize(new java.awt.Dimension(100, 100));

        painelEsquerdo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 204))); // NOI18N
        painelEsquerdo.setPreferredSize(new java.awt.Dimension(50, 100));

        jLabel1.setText("Nome:");

        javax.swing.GroupLayout painelEsquerdoLayout = new javax.swing.GroupLayout(painelEsquerdo);
        painelEsquerdo.setLayout(painelEsquerdoLayout);
        painelEsquerdoLayout.setHorizontalGroup(
            painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEsquerdoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEsquerdoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 131, Short.MAX_VALUE))
                    .addComponent(campoNome))
                .addContainerGap())
        );
        painelEsquerdoLayout.setVerticalGroup(
            painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEsquerdoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        scrollEsquerdo.setViewportView(painelEsquerdo);

        getContentPane().add(scrollEsquerdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 49, 210, 100));

        painelDireito.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 255))); // NOI18N

        scrollDireito.setBorder(null);

        tabelaCircuito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabelaCircuito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCircuitoMouseClicked(evt);
            }
        });
        scrollDireito.setViewportView(tabelaCircuito);

        javax.swing.GroupLayout painelDireitoLayout = new javax.swing.GroupLayout(painelDireito);
        painelDireito.setLayout(painelDireitoLayout);
        painelDireitoLayout.setHorizontalGroup(
            painelDireitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollDireito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        painelDireitoLayout.setVerticalGroup(
            painelDireitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollDireito, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );

        getContentPane().add(painelDireito, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 154, 210, 260));

        setBounds(0, 0, 305, 463);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Circuito circuito = this.getDados();
        condutorFrm = new CondutorFrm(null, true);
        curtoFrm = new CurtoCircuitoFrm(null, true);
        //DesktopPane.desktop.add(condutorFrm);
        try {
            condutorFrm.setDados(CircuitoService.getById(Ids.getIdCircuito()).getCondutor());
            curtoFrm.setDados(CircuitoService.getById(Ids.getIdCircuito()).getCurto());
        } catch (Exception e) {

        }
        condutorFrm.setVisible(true);
        curtoFrm.setVisible(true);
        try {
            circuito.setCondutor(condutorFrm.getCondutor());
            circuito.setCurto(curtoFrm.getCurto());
        } catch (Exception e) {
        }

        CircuitoService.salva(circuito);

        this.apagaDadosFrm();
        this.iniciaTabelaCircuitos();
        //Ids.idCircuito = 0;
        Ids.setIdCondutor((Integer) 0);
        Ids.setIdCurto((Integer) 0);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Ids.imprimiIds();
        CircuitoService.removeById(Ids.getIdCircuito());
        this.iniciaTabelaCircuitos();
        this.apagaDadosFrm();
        Ids.setIdCircuito((Integer) 0);
        Ids.setIdCondutor((Integer) 0);
        Ids.setIdCurto((Integer) 0);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        
        Circuito q = CircuitoService.getById(Ids.getIdCircuito()).clonarSemID();
        CircuitoService.salva(q);

        for (Equipamento equipamento : q.getEquipamentos()) {
            Equipamento e = equipamento.clonarSemID();
            e.setCircuito(q);
            EquipamentoService.salva(e);
        }

        this.iniciaTabelaCircuitos();
        this.apagaDadosFrm();
        Ids.setIdCircuito((Integer) 0);
        Ids.setIdCondutor((Integer) 0);
        Ids.setIdCurto((Integer) 0);
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void tabelaCircuitoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCircuitoMouseClicked
        if (evt.getClickCount() == 1) {

        }
        if (evt.getClickCount() == 2) {
            if (Ids.getIdCircuito() > 0) {
                this.setVisible(false);
                EquipamentoFrm equipamento = new EquipamentoFrm();
                DesktopPane.desktop.add(equipamento);
                equipamento.setVisible(true);
                Ids.setIdCondutor((Integer) 0);
                Ids.setIdCurto((Integer) 0);
            }
        }
    }//GEN-LAST:event_tabelaCircuitoMouseClicked

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.apagaDadosFrm();
        this.iniciaTabelaCircuitos();
        Ids.setIdCircuito((Integer) 0);
        Ids.setIdCondutor((Integer) 0);
        Ids.setIdCurto((Integer) 0);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        QuadroFrm frm = new QuadroFrm();
        DesktopPane.desktop.add(frm);
        frm.setVisible(true);
        Ids.setIdCircuito((Integer) 0);
    }//GEN-LAST:event_formInternalFrameClosing
    
    private void eventoSelecaoTabela() {
        tabelaCircuito.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent evt) {
                int linha = tabelaCircuito.getSelectedRow();
                if (evt.getValueIsAdjusting() == true && linha > -1) {
                    Circuito circuito = (Circuito) tabelaModelo.loadItem(linha);
                    setDados(circuito);
                    Ids.setIdCircuito(circuito.getId());
                    Ids.imprimiIds();
                    try {
                        Ids.setIdCondutor(circuito.getCondutor().getId());
                        Ids.setIdCurto(circuito.getCurto().getId());
                    } catch (Exception e) {
                    }
                }
            }
        }
        );
    }

    public void iniciaTabelaCircuitos() {
        //Verificar porque não posso usar List<Fonte> lista = ProjetoService.getById(Ids.idProjeto).getFontes(); 
        //A tabelaFonte não atualiza a última inclusão como de a Entidade anterior não atualizasse.
        List<Circuito> todos = CircuitoService.getAll();
        List<Circuito> lista = new ArrayList<>();
        for (Circuito q : todos) {
            if (Objects.equals(q.getQuadro().getId(), Ids.getIdQuadro())) {
                lista.add(q);
            }
        }

        if (!lista.isEmpty()) {
            tabelaModelo = new GenericTableModel(lista, Circuito.class);
            tabelaCircuito.setModel(tabelaModelo);
        } else {
            DefaultTableModel model = new DefaultTableModel();
            this.tabelaCircuito.setModel(model);
        }
    }

    private Circuito getDados() {
        Circuito circuito;
        if (Ids.getIdCircuito() > 0) {
            circuito = CircuitoService.getById(TrataID.IntegerToInteger(Ids.getIdCircuito()));
        } else {
            circuito = new Circuito();
            circuito.setQuadro(QuadroService.getById(TrataID.IntegerToInteger(Ids.getIdQuadro())));
        }
        circuito.setId(TrataID.IntegerToInteger(Ids.getIdCircuito()));
        circuito.setNome(this.campoNome.getText());

        return circuito;
    }

    public void apagaDadosFrm() {
        Ids.setIdCircuito((Integer) 0);
        this.campoNome.setText("");
    }

    public void setDados(Circuito circuito) {
        if (circuito != null) {
            Ids.setIdCircuito(circuito.getId());
            this.campoNome.setText(circuito.getNome());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField campoNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelDireito;
    private javax.swing.JPanel painelEsquerdo;
    private javax.swing.JScrollPane scrollDireito;
    private javax.swing.JScrollPane scrollEsquerdo;
    private javax.swing.JTable tabelaCircuito;
    // End of variables declaration//GEN-END:variables
}
