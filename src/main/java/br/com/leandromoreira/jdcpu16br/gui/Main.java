package br.com.leandromoreira.jdcpu16br.gui;

import br.com.leandromoreira.jdcpu16br.cpu.CPU;
import br.com.leandromoreira.jdcpu16br.misc.HexadecimalUtil;
import br.com.leandromoreira.jdcpu16br.io.Memory;
import br.com.leandromoreira.jdcpu16br.io.ROMLoader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main extends javax.swing.JFrame {

    private static final String EMPTY_STRING = "";
    private static final String ONE_SPACE = " ";
    private final CPU cpu;
    private final Memory memory;
    final HexadecimalUtil formatter = new HexadecimalUtil();
    private final ROMLoader romLoader;
    private int sumCycle;

    public Main() {
        romLoader = new ROMLoader();
        initComponents();
        cpu = new CPU();
        memory = cpu.memory();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblMemory = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtAreaMemory = new javax.swing.JTextArea();
        jTxtPC = new javax.swing.JTextField();
        jTxtSP = new javax.swing.JTextField();
        jTxtO = new javax.swing.JTextField();
        jLblPC = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLblPC1 = new javax.swing.JLabel();
        C = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        A = new javax.swing.JTextField();
        B = new javax.swing.JTextField();
        X = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLblPC2 = new javax.swing.JLabel();
        I = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Y = new javax.swing.JTextField();
        Z = new javax.swing.JTextField();
        J = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTxtAreaDump = new javax.swing.JTextArea();
        jLblDump = new javax.swing.JLabel();
        jBtnLoadDump = new javax.swing.JButton();
        jBtnStep = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTxtOutup = new javax.swing.JTextArea();
        jLblMemory1 = new javax.swing.JLabel();
        jLblMemory2 = new javax.swing.JLabel();
        jTxtWatcher1 = new javax.swing.JTextField();
        jLblMemWatch1 = new javax.swing.JLabel();
        jLblMemory5 = new javax.swing.JLabel();
        jLblCycles = new javax.swing.JLabel();
        jTxtWatcher2 = new javax.swing.JTextField();
        jLblMemWatch2 = new javax.swing.JLabel();
        jTxtWatcher3 = new javax.swing.JTextField();
        jLblMemWatch3 = new javax.swing.JLabel();
        jBtnLoadROM = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JDCPU-16BR - Yet another vm implementation of DCPU-16 and debugger");
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLblMemory.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLblMemory.setText("Memory");

        jTxtAreaMemory.setColumns(20);
        jTxtAreaMemory.setEditable(false);
        jTxtAreaMemory.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jTxtAreaMemory.setRows(5);
        jScrollPane1.setViewportView(jTxtAreaMemory);

        jTxtPC.setEditable(false);
        jTxtPC.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jTxtPC.setText("0xFFFF");

        jTxtSP.setEditable(false);
        jTxtSP.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jTxtSP.setText("0xFFFF");

        jTxtO.setEditable(false);
        jTxtO.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jTxtO.setText("0xFFFF");

        jLblPC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLblPC.setText("PC");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("SP");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("O");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("B");

        jLblPC1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLblPC1.setForeground(new java.awt.Color(102, 102, 102));
        jLblPC1.setText("A");

        C.setEditable(false);
        C.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        C.setText("0xFFFF");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("C");

        A.setEditable(false);
        A.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        A.setText("0xFFFF");

        B.setEditable(false);
        B.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        B.setText("0xFFFF");

        X.setEditable(false);
        X.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        X.setText("0xFFFF");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("X");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Z");

        jLblPC2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLblPC2.setForeground(new java.awt.Color(102, 102, 102));
        jLblPC2.setText("Y");

        I.setEditable(false);
        I.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        I.setText("0xFFFF");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("I");

        Y.setEditable(false);
        Y.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        Y.setText("0xFFFF");

        Z.setEditable(false);
        Z.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        Z.setText("0xFFFF");

        J.setEditable(false);
        J.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        J.setText("0xFFFF");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("J");

        jTxtAreaDump.setColumns(20);
        jTxtAreaDump.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jTxtAreaDump.setRows(5);
        jScrollPane2.setViewportView(jTxtAreaDump);

        jLblDump.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLblDump.setText("Type hexa words separated by space");

        jBtnLoadDump.setText("Load dump");
        jBtnLoadDump.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLoadDumpActionPerformed(evt);
            }
        });

        jBtnStep.setText("Step");
        jBtnStep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnStepActionPerformed(evt);
            }
        });

        jTxtOutup.setColumns(20);
        jTxtOutup.setEditable(false);
        jTxtOutup.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jTxtOutup.setForeground(new java.awt.Color(51, 51, 255));
        jTxtOutup.setRows(5);
        jScrollPane3.setViewportView(jTxtOutup);

        jLblMemory1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLblMemory1.setText("Assembler output");

        jLblMemory2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLblMemory2.setText("Memory watcher");

        jTxtWatcher1.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jTxtWatcher1.setText("0xFFFF");
        jTxtWatcher1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtWatcher1FocusLost(evt);
            }
        });

        jLblMemWatch1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLblMemWatch1.setText("0x0000");

        jLblMemory5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLblMemory5.setText("Registers");

        jLblCycles.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTxtWatcher2.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jTxtWatcher2.setText("0xFFFF");
        jTxtWatcher2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtWatcher1FocusLost(evt);
            }
        });

        jLblMemWatch2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLblMemWatch2.setText("0x0000");

        jTxtWatcher3.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jTxtWatcher3.setText("0xFFFF");
        jTxtWatcher3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtWatcher1FocusLost(evt);
            }
        });

        jLblMemWatch3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLblMemWatch3.setText("0x0000");

        jBtnLoadROM.setText("Load ROM");
        jBtnLoadROM.setToolTipText("");
        jBtnLoadROM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLoadROMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblDump)
                    .addComponent(jLblCycles, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLblPC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnLoadDump)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnLoadROM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnStep, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblMemory1)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLblPC1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel4)
                                                .addComponent(jLblPC2)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel8))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Z, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(I, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(J, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                .addComponent(jLblMemory5)
                                .addGap(20, 20, 20)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblMemory)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblMemory2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTxtWatcher1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLblMemWatch1)
                        .addGap(10, 10, 10)
                        .addComponent(jTxtWatcher2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLblMemWatch2)
                        .addGap(10, 10, 10)
                        .addComponent(jTxtWatcher3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLblMemWatch3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLblMemory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLblMemory2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTxtWatcher3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLblMemWatch3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTxtWatcher1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLblMemWatch1)
                                .addComponent(jTxtWatcher2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLblMemWatch2)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLblDump)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jBtnLoadDump)
                                    .addComponent(jBtnStep)
                                    .addComponent(jBtnLoadROM))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLblMemory1)
                                    .addComponent(jLblMemory5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLblPC1)
                                            .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLblPC2)
                                            .addComponent(Y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(Z, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(I, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8)
                                            .addComponent(J, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblPC)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLblCycles))
                        .addGap(23, 23, 23))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        updateRegisters();
        jTxtWatcher1.setText(EMPTY_STRING);
        jTxtWatcher2.setText(EMPTY_STRING);
        jTxtWatcher3.setText(EMPTY_STRING);
    }//GEN-LAST:event_formWindowOpened

    private void jBtnLoadDumpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLoadDumpActionPerformed
        final String rawText = jTxtAreaDump.getText().replace("\n", ONE_SPACE).replace("\r", EMPTY_STRING);
        final String[] hexadecimalCells = extractValidHexaDecimals(rawText.split(ONE_SPACE));
        cpu.reset();
        memory.load(hexadecimalCells);
        updateMemory();
        updateRegisters();
        jTxtOutup.setText(EMPTY_STRING);
        sumCycle = 0;
    }

    private void updateMemory() {
        final StringBuilder sb = new StringBuilder();

        jTxtAreaMemory.setText(EMPTY_STRING);
        for (int address = 0x0000; address < Memory.MEMORY_SIZE;) {
            if (address % 5 == 0) {
                sb.append("\n").append(formatter.toHexa4Spaces(address)).append(": ");
            }
            sb.append(formatter.toHexa4Spaces(memory.readFrom(address++))).append(ONE_SPACE);
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(0);
        }
        jTxtAreaMemory.setText(sb.toString());
        jTxtAreaMemory.moveCaretPosition(0);
    }//GEN-LAST:event_jBtnLoadDumpActionPerformed

    private void jBtnStepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnStepActionPerformed

        final String assembler = cpu.step();
        final String newOutput = assembler + "\n" + jTxtOutup.getText();
        jTxtOutup.setText(newOutput);
        jTxtOutup.moveCaretPosition(0);
        sumCycle += cpu.getCurrentCycleCost();
        jLblCycles.setText("Last Cycle cost: " + cpu.getCurrentCycleCost() + " Total: " + sumCycle);
        updateMemory();
        updateRegisters();
        updateMemoryWatchers();

    }//GEN-LAST:event_jBtnStepActionPerformed

    private void jTxtWatcher1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtWatcher1FocusLost
        updateMemoryWatchers();
    }//GEN-LAST:event_jTxtWatcher1FocusLost

    private void jBtnLoadROMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLoadROMActionPerformed
        final JFileChooser fileChooser = new JFileChooser();
        final int userAction = fileChooser.showOpenDialog(this);

        if (userAction == JFileChooser.APPROVE_OPTION) {
            final File rom = fileChooser.getSelectedFile();
            cpu.reset();
            romLoader.load(rom).to(memory);
            updateMemory();
            updateRegisters();
            updateMemoryWatchers();
        }

    }//GEN-LAST:event_jBtnLoadROMActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A;
    private javax.swing.JTextField B;
    private javax.swing.JTextField C;
    private javax.swing.JTextField I;
    private javax.swing.JTextField J;
    private javax.swing.JTextField X;
    private javax.swing.JTextField Y;
    private javax.swing.JTextField Z;
    private javax.swing.JButton jBtnLoadDump;
    private javax.swing.JButton jBtnLoadROM;
    private javax.swing.JButton jBtnStep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLblCycles;
    private javax.swing.JLabel jLblDump;
    private javax.swing.JLabel jLblMemWatch1;
    private javax.swing.JLabel jLblMemWatch2;
    private javax.swing.JLabel jLblMemWatch3;
    private javax.swing.JLabel jLblMemory;
    private javax.swing.JLabel jLblMemory1;
    private javax.swing.JLabel jLblMemory2;
    private javax.swing.JLabel jLblMemory5;
    private javax.swing.JLabel jLblPC;
    private javax.swing.JLabel jLblPC1;
    private javax.swing.JLabel jLblPC2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTxtAreaDump;
    private javax.swing.JTextArea jTxtAreaMemory;
    private javax.swing.JTextField jTxtO;
    private javax.swing.JTextArea jTxtOutup;
    private javax.swing.JTextField jTxtPC;
    private javax.swing.JTextField jTxtSP;
    private javax.swing.JTextField jTxtWatcher1;
    private javax.swing.JTextField jTxtWatcher2;
    private javax.swing.JTextField jTxtWatcher3;
    // End of variables declaration//GEN-END:variables

    private void updateRegisters() {
        updateRegiter(jTxtPC, cpu.getProgramCounter());
        updateRegiter(jTxtSP, cpu.getStackPointer());
        updateRegiter(jTxtO, cpu.getOverflow());

        updateRegiter(A, cpu.register(CPU.A));
        updateRegiter(B, cpu.register(CPU.B));
        updateRegiter(C, cpu.register(CPU.C));
        updateRegiter(X, cpu.register(CPU.X));
        updateRegiter(Y, cpu.register(CPU.Y));
        updateRegiter(Z, cpu.register(CPU.Z));
        updateRegiter(I, cpu.register(CPU.I));
        updateRegiter(J, cpu.register(CPU.J));
    }

    private void updateRegiter(final JTextField component, final int value) {
        component.setText(formatter.toHexa4Spaces(value));
    }

    private void updateMemoryWatchers() {
        updateMemoryWatcher(jTxtWatcher1, jLblMemWatch1);
        updateMemoryWatcher(jTxtWatcher2, jLblMemWatch2);
        updateMemoryWatcher(jTxtWatcher3, jLblMemWatch3);
    }

    private void updateMemoryWatcher(final JTextField text, final JLabel label) {
        String textWatcher = text.getText().toLowerCase().replace("x", EMPTY_STRING);
        if (!formatter.isValidHexadecimal(textWatcher)) {
            textWatcher = "0";
        }
        final Integer watcherValue = Integer.valueOf(textWatcher, 16);
        updateRegiter(text, watcherValue);
        label.setText(formatter.toHexa4Spaces(memory.readFrom(watcherValue)));
    }

    private String[] extractValidHexaDecimals(final String[] rawHexadecimal) {
        final List<String> listOfValidHexa = new ArrayList<>();
        for (final String hexa : rawHexadecimal) {
            if (formatter.isValidHexadecimal(hexa)) {
                listOfValidHexa.add(hexa);
            }
        }
        final String[] returnValue = new String[listOfValidHexa.size()];
        return listOfValidHexa.toArray(returnValue);
    }
}
