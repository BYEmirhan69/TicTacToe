
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author cembaydogan
 */
public class TicTacToe extends javax.swing.JFrame {

    /**
     * Creates new form TicTacToe
     */
    int sayi=0;
    int []kullanilanButonlar={0,0,0,0,0,0,0,0,0};
    int []xKazanmasi={0,0,0,0,0,0,0,0,0};
    int []oKazanmasi={0,0,0,0,0,0,0,0,0};
    boolean bitis=false;
    public int xKazansin(){
        if (xKazanmasi[0]==1 && xKazanmasi[1]==1 && xKazanmasi[2]==1) {
            return 1;
        }
        if (xKazanmasi[0]==1 && xKazanmasi[3]==1 && xKazanmasi[6]==1) {
            return 1;
        }
        if (xKazanmasi[0]==1 && xKazanmasi[4]==1 && xKazanmasi[8]==1) {
            return 1;
        }
        if (xKazanmasi[1]==1 && xKazanmasi[4]==1 && xKazanmasi[7]==1) {
            return 1;
        }
        if (xKazanmasi[2]==1 && xKazanmasi[4]==1 && xKazanmasi[6]==1) {
            return 1;
        }
        if (xKazanmasi[2]==1 && xKazanmasi[5]==1 && xKazanmasi[8]==1) {
            return 1;
        }
        if (xKazanmasi[3]==1 && xKazanmasi[4]==1 && xKazanmasi[5]==1) {
            return 1;
        }
        if (xKazanmasi[6]==1 && xKazanmasi[7]==1 && xKazanmasi[8]==1) {
            return 1;
        }
        return 0;
    } 
    public int oKazansin(){
        if (oKazanmasi[0]==1 && oKazanmasi[1]==1 && oKazanmasi[2]==1) {
            return 1;
        }
        if (oKazanmasi[0]==1 && oKazanmasi[3]==1 && oKazanmasi[6]==1) {
            return 1;
        }
        if (oKazanmasi[0]==1 && oKazanmasi[4]==1 && oKazanmasi[8]==1) {
            return 1;
        }
        if (oKazanmasi[1]==1 && oKazanmasi[4]==1 && oKazanmasi[7]==1) {
            return 1;
        }
        if (oKazanmasi[2]==1 && oKazanmasi[4]==1 && oKazanmasi[6]==1) {
            return 1;
        }
        if (oKazanmasi[2]==1 && oKazanmasi[5]==1 && oKazanmasi[8]==1) {
            return 1;
        }
        if (oKazanmasi[3]==1 && oKazanmasi[4]==1 && oKazanmasi[5]==1) {
            return 1;
        }
        if (oKazanmasi[6]==1 && oKazanmasi[7]==1 && oKazanmasi[8]==1) {
            return 1;
        }
        return 0;
    } 
    public TicTacToe() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(this);
        oyuncuYazdir(sayi);
    }
    public void oyuncuYazdir(int sayac){
        if (sayac%2==0) {
            jLabel3.setText("X's Oynuyor");
        }
        else jLabel3.setText("O's Oynuyor");
    }
    public void resetle(){
        btn0.setText("");
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        
        sayi=0;
        for (int i = 0; i < kullanilanButonlar.length; i++) {
            kullanilanButonlar[i]=0;
            xKazanmasi[i]=0;
            oKazanmasi[i]=0;
        }
        oyuncuYazdir(sayi);
    }
    public void oyunBitir(boolean kontrol){
        if (kontrol==true) {
            JOptionPane.showMessageDialog(rootPane, "Oyun Bitti! Yeniden Başlatılıyor...");
            resetle();
        }
        int berabere=0;
        for (int i = 0; i < kullanilanButonlar.length; i++) {
            if (kullanilanButonlar[0]!=0 && 
                kullanilanButonlar[1]!=0 &&
                    kullanilanButonlar[2]!=0 && 
                kullanilanButonlar[3]!=0 &&
                    kullanilanButonlar[4]!=0 && 
                kullanilanButonlar[5]!=0 &&
                    kullanilanButonlar[6]!=0 && 
                kullanilanButonlar[7]!=0 &&
                    kullanilanButonlar[8]!=0
                    ) {
                berabere=1;
            }
        }
        if (berabere==1) {
            JOptionPane.showMessageDialog(rootPane, "Oyun Bitti! ' Skor Berabere ' Yeniden Başlatılıyor...");
            resetle();
        }
        bitis=false;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn0 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Hubballi", 1, 36)); // NOI18N
        jLabel1.setText("Tic Tac Toe");

        jLabel2.setText("Oyun Sırası -> ");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setText("X's Oynuyor");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Tic_tac_toe.svg.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(104, 104, 104)))
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        btn0.setBackground(new java.awt.Color(255, 255, 204));
        btn0.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        btn0.setPreferredSize(new java.awt.Dimension(120, 120));
        btn0.setSize(new java.awt.Dimension(120, 120));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(255, 255, 204));
        btn1.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        btn1.setPreferredSize(new java.awt.Dimension(120, 120));
        btn1.setSize(new java.awt.Dimension(120, 120));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(255, 255, 204));
        btn2.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        btn2.setPreferredSize(new java.awt.Dimension(120, 120));
        btn2.setSize(new java.awt.Dimension(120, 120));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(255, 255, 204));
        btn3.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        btn3.setPreferredSize(new java.awt.Dimension(120, 120));
        btn3.setSize(new java.awt.Dimension(120, 120));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(255, 255, 204));
        btn4.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        btn4.setPreferredSize(new java.awt.Dimension(120, 120));
        btn4.setSize(new java.awt.Dimension(120, 120));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(255, 255, 204));
        btn5.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        btn5.setPreferredSize(new java.awt.Dimension(120, 120));
        btn5.setSize(new java.awt.Dimension(120, 120));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(255, 255, 204));
        btn6.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        btn6.setPreferredSize(new java.awt.Dimension(120, 120));
        btn6.setSize(new java.awt.Dimension(120, 120));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(255, 255, 204));
        btn7.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        btn7.setPreferredSize(new java.awt.Dimension(120, 120));
        btn7.setSize(new java.awt.Dimension(120, 120));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(255, 255, 204));
        btn8.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        btn8.setPreferredSize(new java.awt.Dimension(120, 120));
        btn8.setSize(new java.awt.Dimension(120, 120));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(153, 153, 0));
        jButton10.setText("Try Again");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton10)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        if (kullanilanButonlar[0]==0) {
            if (sayi%2==0) {
                btn0.setText("X");
                sayi++;
                kullanilanButonlar[0]=1;
                xKazanmasi[0]=1;
                int resultX=xKazansin();
                int resultO=oKazansin();
                if (resultX==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'X' ");
                    bitis=true;
                }
                if (resultO==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'O' ");
                    bitis=true;
                }
            }
            else {
                btn0.setText("O");
                sayi++;
                kullanilanButonlar[0]=1;                
                oKazanmasi[0]=1;
                int resultX=xKazansin();
                int resultO=oKazansin();
                if (resultX==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'X' ");
                    bitis=true;
                }
                if (resultO==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'O' ");
                    bitis=true;
                }
            }
        }else JOptionPane.showMessageDialog(rootPane, "Hamle geri alınamaz!");
        oyuncuYazdir(sayi);
        oyunBitir(bitis);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        if (kullanilanButonlar[1]==0) {
            if (sayi%2==0) {
                btn1.setText("X");
                sayi++;
                kullanilanButonlar[1]=1;
                xKazanmasi[1]=1;
                int resultX=xKazansin();
                int resultO=oKazansin();
                if (resultX==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'X' ");
                    bitis=true;
                }
                if (resultO==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'O' ");
                    bitis=true;
                }
            }
            else {
                btn1.setText("O");
                sayi++;
                kullanilanButonlar[1]=1;                
                oKazanmasi[1]=1;
                int resultX=xKazansin();
                int resultO=oKazansin();
                if (resultX==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'X' ");
                    bitis=true;
                }
                if (resultO==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'O' ");
                    bitis=true;
                }
            }
        }else JOptionPane.showMessageDialog(rootPane, "Hamle geri alınamaz!");
        oyuncuYazdir(sayi);
        oyunBitir(bitis);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        if (kullanilanButonlar[2]==0) {
            if (sayi%2==0) {
                btn2.setText("X");
                sayi++;
                kullanilanButonlar[2]=1;
                xKazanmasi[2]=1;
                int resultX=xKazansin();
                int resultO=oKazansin();
                if (resultX==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'X' ");bitis=true;
                }
                if (resultO==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'O' ");bitis=true;
                }
            }
            else {
                btn2.setText("O");
                sayi++;
                kullanilanButonlar[2]=1;                
                oKazanmasi[2]=1;
                int resultX=xKazansin();
                int resultO=oKazansin();
                if (resultX==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'X' ");bitis=true;
                }
                if (resultO==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'O' ");bitis=true;
                }
            }
        }else JOptionPane.showMessageDialog(rootPane, "Hamle geri alınamaz!");
        oyuncuYazdir(sayi);
        oyunBitir(bitis);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        if (kullanilanButonlar[3]==0) {
            if (sayi%2==0) {
                btn3.setText("X");
                sayi++;
                kullanilanButonlar[3]=1;
                xKazanmasi[3]=1;
                int resultX=xKazansin();
                int resultO=oKazansin();
                if (resultX==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'X' ");bitis=true;
                }
                if (resultO==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'O' ");bitis=true;
                }
            }
            else {
                btn3.setText("O");
                sayi++;
                kullanilanButonlar[3]=1;                
                oKazanmasi[3]=1;
                int resultX=xKazansin();
                int resultO=oKazansin();
                if (resultX==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'X' ");bitis=true;
                }
                if (resultO==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'O' ");bitis=true;
                }
            }
        }else JOptionPane.showMessageDialog(rootPane, "Hamle geri alınamaz!");
        oyuncuYazdir(sayi);
        oyunBitir(bitis);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        if (kullanilanButonlar[4]==0) {
            if (sayi%2==0) {
                btn4.setText("X");
                sayi++;
                kullanilanButonlar[4]=1;
                xKazanmasi[4]=1;
                int resultX=xKazansin();
                int resultO=oKazansin();
                if (resultX==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'X' ");bitis=true;
                }
                if (resultO==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'O' ");bitis=true;
                }
            }
            else {
                btn4.setText("O");
                sayi++;
                kullanilanButonlar[4]=1;                
                oKazanmasi[4]=1;
                int resultX=xKazansin();
                int resultO=oKazansin();
                if (resultX==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'X' ");bitis=true;
                }
                if (resultO==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'O' ");bitis=true;
                }
            }
        }else JOptionPane.showMessageDialog(rootPane, "Hamle geri alınamaz!");
        oyuncuYazdir(sayi);
        oyunBitir(bitis);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        if (kullanilanButonlar[5]==0) {
            if (sayi%2==0) {
                btn5.setText("X");
                sayi++;
                kullanilanButonlar[5]=1;
                xKazanmasi[5]=1;
                int resultX=xKazansin();
                int resultO=oKazansin();
                if (resultX==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'X' ");bitis=true;
                }
                if (resultO==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'O' ");bitis=true;
                }
            }
            else {
                btn5.setText("O");
                sayi++;
                kullanilanButonlar[5]=1;                
                oKazanmasi[5]=1;
                int resultX=xKazansin();
                int resultO=oKazansin();
                if (resultX==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'X' ");bitis=true;
                }
                if (resultO==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'O' ");bitis=true;
                }
            }
        }else JOptionPane.showMessageDialog(rootPane, "Hamle geri alınamaz!");
        oyuncuYazdir(sayi);
        oyunBitir(bitis);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        if (kullanilanButonlar[6]==0) {
            if (sayi%2==0) {
                btn6.setText("X");
                sayi++;
                kullanilanButonlar[6]=1;
                xKazanmasi[6]=1;
                int resultX=xKazansin();
                int resultO=oKazansin();
                if (resultX==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'X' ");bitis=true;
                }
                if (resultO==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'O' ");bitis=true;
                }
            }
            else {
                btn6.setText("O");
                sayi++;
                kullanilanButonlar[6]=1;                
                oKazanmasi[6]=1;
                int resultX=xKazansin();
                int resultO=oKazansin();
                if (resultX==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'X' ");bitis=true;
                }
                if (resultO==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'O' ");bitis=true;
                }
            }
        }else JOptionPane.showMessageDialog(rootPane, "Hamle geri alınamaz!");
        oyuncuYazdir(sayi);
        oyunBitir(bitis);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        if (kullanilanButonlar[7]==0) {
            if (sayi%2==0) {
                btn7.setText("X");
                sayi++;
                kullanilanButonlar[7]=1;
                xKazanmasi[7]=1;
                int resultX=xKazansin();
                int resultO=oKazansin();
                if (resultX==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'X' ");bitis=true;
                }
                if (resultO==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'O' ");bitis=true;
                }
            }
            else {
                btn7.setText("O");
                sayi++;
                kullanilanButonlar[7]=1;                
                oKazanmasi[7]=1;
                int resultX=xKazansin();
                int resultO=oKazansin();
                if (resultX==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'X' ");bitis=true;
                }
                if (resultO==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'O' ");bitis=true;
                }
            }
        }else JOptionPane.showMessageDialog(rootPane, "Hamle geri alınamaz!");
        oyuncuYazdir(sayi);
        oyunBitir(bitis);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        if (kullanilanButonlar[8]==0) {
            if (sayi%2==0) {
                btn8.setText("X");
                sayi++;
                kullanilanButonlar[8]=1;
                xKazanmasi[8]=1;
                int resultX=xKazansin();
                int resultO=oKazansin();
                if (resultX==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'X' ");bitis=true;
                }
                if (resultO==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'O' ");bitis=true;
                }
            }
            else {
                btn8.setText("O");
                sayi++;
                kullanilanButonlar[8]=1;                
                oKazanmasi[8]=1;
                int resultX=xKazansin();
                int resultO=oKazansin();
                if (resultX==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'X' ");bitis=true;
                }
                if (resultO==1) {
                    JOptionPane.showMessageDialog(rootPane, "Kazanan -> 'O' ");bitis=true;
                }
            }
        }else JOptionPane.showMessageDialog(rootPane, "Hamle geri alınamaz!");
        oyuncuYazdir(sayi);
        oyunBitir(bitis);
    }//GEN-LAST:event_btn8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        resetle();
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}