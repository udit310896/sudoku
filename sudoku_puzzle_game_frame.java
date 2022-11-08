
import static java.awt.Color.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class sudoku_puzzle_game_frame extends javax.swing.JFrame {

    /**
     * Creates new form Sudoku_Puzzle_Game
     */
    private String turn = "1";
    private boolean globalFlag = true; 
    public String solvedBoard [][] = {
        {"2","9","8","5","1","6","7","3","4"},
        {"4","1","3","2","7","8","5","6","9"},
        {"7","5","6","3","4","9","1","2","8"},
        {"8","2","1","4","3","5","6","9","7"},
        {"5","3","4","6","9","7","2","8","1"},
        {"9","6","7","1","8","2","3","4","5"},
        {"1","4","2","8","5","3","9","7","6"},
        {"3","7","5","9","6","4","8","1","2"},
        {"6","8","9","7","2","1","4","5","3"}
    };

    public sudoku_puzzle_game_frame() {
        initComponents();
    }
    
    public void resetBoard(){
        
        JButton buttons[] = { txtbtn4,txtbtn7,txtbtn8,txtbtn9,txtbtn10,txtbtn14,txtbtn15,txtbtn16,txtbtn18,txtbtn19,
                            txtbtn21,txtbtn23,txtbtn26,txtbtn32,txtbtn33,txtbtn35,txtbtn38,
                            txtbtn39,txtbtn43,txtbtn44,txtbtn47,txtbtn49,txtbtn50,txtbtn56,txtbtn59,txtbtn61,
                            txtbtn63,txtbtn64,txtbtn66,txtbtn67,txtbtn68,txtbtn72,txtbtn73,txtbtn74,txtbtn75,txtbtn78 };
        JButton board[][] = {
            {txtbtn1,txtbtn2,txtbtn3,txtbtn4,txtbtn5,txtbtn6,txtbtn7,txtbtn8,txtbtn9},
            {txtbtn10,txtbtn11,txtbtn12,txtbtn13,txtbtn14,txtbtn15,txtbtn16,txtbtn17,txtbtn18},
            {txtbtn19,txtbtn20,txtbtn21,txtbtn22,txtbtn23,txtbtn24,txtbtn25,txtbtn26,txtbtn27},
            {txtbtn28,txtbtn29,txtbtn30,txtbtn31,txtbtn32,txtbtn33,txtbtn34,txtbtn35,txtbtn36},
            {txtbtn37,txtbtn38,txtbtn39,txtbtn40,txtbtn41,txtbtn42,txtbtn43,txtbtn44,txtbtn45},
            {txtbtn46,txtbtn47,txtbtn48,txtbtn49,txtbtn50,txtbtn51,txtbtn52,txtbtn53,txtbtn54},
            {txtbtn55,txtbtn56,txtbtn57,txtbtn58,txtbtn59,txtbtn60,txtbtn61,txtbtn62,txtbtn63},
            {txtbtn64,txtbtn65,txtbtn66,txtbtn67,txtbtn68,txtbtn69,txtbtn70,txtbtn71,txtbtn72},
            {txtbtn73,txtbtn74,txtbtn75,txtbtn76,txtbtn77,txtbtn78,txtbtn79,txtbtn80,txtbtn81}
        };
        
//        if(globalFlag == true){
//            globalFlag = false;
        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                boolean flag = true;
                for(int k = 0 ; k <buttons.length ; k++){
                    if(board[i][j] == buttons[k]) flag = false;
                }
                if(flag == true) {
                    board[i][j].setText("");
                    board[i][j].setForeground(black);
                    board[i][j].setBackground(white);
                }
            }
        }
    }
    
    public void seeSolution(){
        JButton buttons[] = { txtbtn4,txtbtn7,txtbtn8,txtbtn9,txtbtn10,txtbtn14,txtbtn15,txtbtn16,txtbtn18,txtbtn19,
                            txtbtn21,txtbtn23,txtbtn26,txtbtn32,txtbtn33,txtbtn35,txtbtn38,
                            txtbtn39,txtbtn43,txtbtn44,txtbtn47,txtbtn49,txtbtn50,txtbtn56,txtbtn59,txtbtn61,
                            txtbtn63,txtbtn64,txtbtn66,txtbtn67,txtbtn68,txtbtn72,txtbtn73,txtbtn74,txtbtn75,txtbtn78 };
        JButton board[][] = {
            {txtbtn1,txtbtn2,txtbtn3,txtbtn4,txtbtn5,txtbtn6,txtbtn7,txtbtn8,txtbtn9},
            {txtbtn10,txtbtn11,txtbtn12,txtbtn13,txtbtn14,txtbtn15,txtbtn16,txtbtn17,txtbtn18},
            {txtbtn19,txtbtn20,txtbtn21,txtbtn22,txtbtn23,txtbtn24,txtbtn25,txtbtn26,txtbtn27},
            {txtbtn28,txtbtn29,txtbtn30,txtbtn31,txtbtn32,txtbtn33,txtbtn34,txtbtn35,txtbtn36},
            {txtbtn37,txtbtn38,txtbtn39,txtbtn40,txtbtn41,txtbtn42,txtbtn43,txtbtn44,txtbtn45},
            {txtbtn46,txtbtn47,txtbtn48,txtbtn49,txtbtn50,txtbtn51,txtbtn52,txtbtn53,txtbtn54},
            {txtbtn55,txtbtn56,txtbtn57,txtbtn58,txtbtn59,txtbtn60,txtbtn61,txtbtn62,txtbtn63},
            {txtbtn64,txtbtn65,txtbtn66,txtbtn67,txtbtn68,txtbtn69,txtbtn70,txtbtn71,txtbtn72},
            {txtbtn73,txtbtn74,txtbtn75,txtbtn76,txtbtn77,txtbtn78,txtbtn79,txtbtn80,txtbtn81}
        };
        
        if(globalFlag == true){
            globalFlag = false;
            solutionbtn.setText("HIDE");
                for(int i = 0 ; i < 9 ; i++){
                for(int j = 0 ; j < 9 ; j++){
                    boolean flag = true;
                    for(int k = 0 ; k <buttons.length ; k++){
                        if(board[i][j] == buttons[k]) flag = false;
                    }
                    if(flag == true) {
                        board[i][j].setText(solvedBoard[i][j]);
                        board[i][j].setForeground(white);
                        board[i][j].setBackground(black);
                    }
                }
            }
        } else{
            solutionbtn.setText("SOLUTION");
            globalFlag = true;
            resetBoard();
        }
        
    }
        public void checkMoves(){
            JButton buttons[] = { txtbtn4,txtbtn7,txtbtn8,txtbtn9,txtbtn10,txtbtn14,txtbtn15,txtbtn16,txtbtn18,txtbtn19,
                            txtbtn21,txtbtn23,txtbtn26,txtbtn32,txtbtn33,txtbtn35,txtbtn38,
                            txtbtn39,txtbtn43,txtbtn44,txtbtn47,txtbtn49,txtbtn50,txtbtn56,txtbtn59,txtbtn61,
                            txtbtn63,txtbtn64,txtbtn66,txtbtn67,txtbtn68,txtbtn72,txtbtn73,txtbtn74,txtbtn75,txtbtn78 };
        JButton board[][] = {
            {txtbtn1,txtbtn2,txtbtn3,txtbtn4,txtbtn5,txtbtn6,txtbtn7,txtbtn8,txtbtn9},
            {txtbtn10,txtbtn11,txtbtn12,txtbtn13,txtbtn14,txtbtn15,txtbtn16,txtbtn17,txtbtn18},
            {txtbtn19,txtbtn20,txtbtn21,txtbtn22,txtbtn23,txtbtn24,txtbtn25,txtbtn26,txtbtn27},
            {txtbtn28,txtbtn29,txtbtn30,txtbtn31,txtbtn32,txtbtn33,txtbtn34,txtbtn35,txtbtn36},
            {txtbtn37,txtbtn38,txtbtn39,txtbtn40,txtbtn41,txtbtn42,txtbtn43,txtbtn44,txtbtn45},
            {txtbtn46,txtbtn47,txtbtn48,txtbtn49,txtbtn50,txtbtn51,txtbtn52,txtbtn53,txtbtn54},
            {txtbtn55,txtbtn56,txtbtn57,txtbtn58,txtbtn59,txtbtn60,txtbtn61,txtbtn62,txtbtn63},
            {txtbtn64,txtbtn65,txtbtn66,txtbtn67,txtbtn68,txtbtn69,txtbtn70,txtbtn71,txtbtn72},
            {txtbtn73,txtbtn74,txtbtn75,txtbtn76,txtbtn77,txtbtn78,txtbtn79,txtbtn80,txtbtn81}
        };
        
        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                if(board[i][j].getText()!=solvedBoard[i][j] && board[i][j].getText()!=""){
                    board[i][j].setBackground(red);
                    
                }
            }
        }
     }
        
        public void isSolved(){
            boolean flag = true;
            JButton board[][] = {
            {txtbtn1,txtbtn2,txtbtn3,txtbtn4,txtbtn5,txtbtn6,txtbtn7,txtbtn8,txtbtn9},
            {txtbtn10,txtbtn11,txtbtn12,txtbtn13,txtbtn14,txtbtn15,txtbtn16,txtbtn17,txtbtn18},
            {txtbtn19,txtbtn20,txtbtn21,txtbtn22,txtbtn23,txtbtn24,txtbtn25,txtbtn26,txtbtn27},
            {txtbtn28,txtbtn29,txtbtn30,txtbtn31,txtbtn32,txtbtn33,txtbtn34,txtbtn35,txtbtn36},
            {txtbtn37,txtbtn38,txtbtn39,txtbtn40,txtbtn41,txtbtn42,txtbtn43,txtbtn44,txtbtn45},
            {txtbtn46,txtbtn47,txtbtn48,txtbtn49,txtbtn50,txtbtn51,txtbtn52,txtbtn53,txtbtn54},
            {txtbtn55,txtbtn56,txtbtn57,txtbtn58,txtbtn59,txtbtn60,txtbtn61,txtbtn62,txtbtn63},
            {txtbtn64,txtbtn65,txtbtn66,txtbtn67,txtbtn68,txtbtn69,txtbtn70,txtbtn71,txtbtn72},
            {txtbtn73,txtbtn74,txtbtn75,txtbtn76,txtbtn77,txtbtn78,txtbtn79,txtbtn80,txtbtn81}
        };
             for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                if(board[i][j].getText() != solvedBoard[i][j]) flag = false;
                if(board[i][j].getText()!=solvedBoard[i][j] && board[i][j].getText()!=""){
                    board[i][j].setBackground(red);
                    
                }
            }
        }
             if(flag == true){
                 JOptionPane.showMessageDialog(this,"Sudoku is Solved","SUDOKU PUZZLE GAME",JOptionPane.INFORMATION_MESSAGE);
             }
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
        txtbtn1 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn10 = new javax.swing.JButton();
        txtbtn11 = new javax.swing.JButton();
        txtbtn12 = new javax.swing.JButton();
        txtbtn21 = new javax.swing.JButton();
        txtbtn20 = new javax.swing.JButton();
        txtbtn19 = new javax.swing.JButton();
        selectionbtn1 = new javax.swing.JButton();
        selectionbtn2 = new javax.swing.JButton();
        selectionbtn3 = new javax.swing.JButton();
        selectionbtn4 = new javax.swing.JButton();
        selectionbtn5 = new javax.swing.JButton();
        selectionbtn6 = new javax.swing.JButton();
        selectionbtn7 = new javax.swing.JButton();
        selectionbtn8 = new javax.swing.JButton();
        selectionbtn9 = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        checkmovesbtn = new javax.swing.JButton();
        solutionbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        txtbtn4 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn13 = new javax.swing.JButton();
        txtbtn14 = new javax.swing.JButton();
        txtbtn15 = new javax.swing.JButton();
        txtbtn24 = new javax.swing.JButton();
        txtbtn23 = new javax.swing.JButton();
        txtbtn22 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        txtbtn31 = new javax.swing.JButton();
        txtbtn32 = new javax.swing.JButton();
        txtbtn33 = new javax.swing.JButton();
        txtbtn40 = new javax.swing.JButton();
        txtbtn41 = new javax.swing.JButton();
        txtbtn42 = new javax.swing.JButton();
        txtbtn51 = new javax.swing.JButton();
        txtbtn50 = new javax.swing.JButton();
        txtbtn49 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        txtbtn28 = new javax.swing.JButton();
        txtbtn29 = new javax.swing.JButton();
        txtbtn30 = new javax.swing.JButton();
        txtbtn37 = new javax.swing.JButton();
        txtbtn38 = new javax.swing.JButton();
        txtbtn39 = new javax.swing.JButton();
        txtbtn48 = new javax.swing.JButton();
        txtbtn47 = new javax.swing.JButton();
        txtbtn46 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        txtbtn7 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtbtn16 = new javax.swing.JButton();
        txtbtn17 = new javax.swing.JButton();
        txtbtn18 = new javax.swing.JButton();
        txtbtn27 = new javax.swing.JButton();
        txtbtn26 = new javax.swing.JButton();
        txtbtn25 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        txtbtn34 = new javax.swing.JButton();
        txtbtn35 = new javax.swing.JButton();
        txtbtn36 = new javax.swing.JButton();
        txtbtn43 = new javax.swing.JButton();
        txtbtn44 = new javax.swing.JButton();
        txtbtn45 = new javax.swing.JButton();
        txtbtn54 = new javax.swing.JButton();
        txtbtn53 = new javax.swing.JButton();
        txtbtn52 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        txtbtn55 = new javax.swing.JButton();
        txtbtn56 = new javax.swing.JButton();
        txtbtn57 = new javax.swing.JButton();
        txtbtn64 = new javax.swing.JButton();
        txtbtn65 = new javax.swing.JButton();
        txtbtn66 = new javax.swing.JButton();
        txtbtn75 = new javax.swing.JButton();
        txtbtn74 = new javax.swing.JButton();
        txtbtn73 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        txtbtn58 = new javax.swing.JButton();
        txtbtn59 = new javax.swing.JButton();
        txtbtn60 = new javax.swing.JButton();
        txtbtn67 = new javax.swing.JButton();
        txtbtn68 = new javax.swing.JButton();
        txtbtn69 = new javax.swing.JButton();
        txtbtn78 = new javax.swing.JButton();
        txtbtn77 = new javax.swing.JButton();
        txtbtn76 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        txtbtn61 = new javax.swing.JButton();
        txtbtn62 = new javax.swing.JButton();
        txtbtn63 = new javax.swing.JButton();
        txtbtn70 = new javax.swing.JButton();
        txtbtn71 = new javax.swing.JButton();
        txtbtn72 = new javax.swing.JButton();
        txtbtn81 = new javax.swing.JButton();
        txtbtn80 = new javax.swing.JButton();
        txtbtn79 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SUDOKU PUZZLE GAME");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbtn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn10.setText("4");
        txtbtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn10ActionPerformed(evt);
            }
        });

        txtbtn11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn11ActionPerformed(evt);
            }
        });

        txtbtn12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn12ActionPerformed(evt);
            }
        });

        txtbtn21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn21.setText("6");
        txtbtn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn21ActionPerformed(evt);
            }
        });

        txtbtn20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn20ActionPerformed(evt);
            }
        });

        txtbtn19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn19.setText("7");
        txtbtn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtbtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtbtn19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        selectionbtn1.setBackground(new java.awt.Color(51, 51, 255));
        selectionbtn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        selectionbtn1.setForeground(new java.awt.Color(255, 255, 255));
        selectionbtn1.setText("1");
        selectionbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbtn1ActionPerformed(evt);
            }
        });

        selectionbtn2.setBackground(new java.awt.Color(0, 0, 0));
        selectionbtn2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        selectionbtn2.setForeground(new java.awt.Color(255, 255, 255));
        selectionbtn2.setText("2");
        selectionbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbtn2ActionPerformed(evt);
            }
        });

        selectionbtn3.setBackground(new java.awt.Color(0, 0, 0));
        selectionbtn3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        selectionbtn3.setForeground(new java.awt.Color(255, 255, 255));
        selectionbtn3.setText("3");
        selectionbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbtn3ActionPerformed(evt);
            }
        });

        selectionbtn4.setBackground(new java.awt.Color(0, 0, 0));
        selectionbtn4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        selectionbtn4.setForeground(new java.awt.Color(255, 255, 255));
        selectionbtn4.setText("4");
        selectionbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbtn4ActionPerformed(evt);
            }
        });

        selectionbtn5.setBackground(new java.awt.Color(0, 0, 0));
        selectionbtn5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        selectionbtn5.setForeground(new java.awt.Color(255, 255, 255));
        selectionbtn5.setText("5");
        selectionbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbtn5ActionPerformed(evt);
            }
        });

        selectionbtn6.setBackground(new java.awt.Color(0, 0, 0));
        selectionbtn6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        selectionbtn6.setForeground(new java.awt.Color(255, 255, 255));
        selectionbtn6.setText("6");
        selectionbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbtn6ActionPerformed(evt);
            }
        });

        selectionbtn7.setBackground(new java.awt.Color(0, 0, 0));
        selectionbtn7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        selectionbtn7.setForeground(new java.awt.Color(255, 255, 255));
        selectionbtn7.setText("7");
        selectionbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbtn7ActionPerformed(evt);
            }
        });

        selectionbtn8.setBackground(new java.awt.Color(0, 0, 0));
        selectionbtn8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        selectionbtn8.setForeground(new java.awt.Color(255, 255, 255));
        selectionbtn8.setText("8");
        selectionbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbtn8ActionPerformed(evt);
            }
        });

        selectionbtn9.setBackground(new java.awt.Color(0, 0, 0));
        selectionbtn9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        selectionbtn9.setForeground(new java.awt.Color(255, 255, 255));
        selectionbtn9.setText("9");
        selectionbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbtn9ActionPerformed(evt);
            }
        });

        resetbtn.setBackground(new java.awt.Color(0, 204, 255));
        resetbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        resetbtn.setText("RESET");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        checkmovesbtn.setBackground(new java.awt.Color(255, 153, 153));
        checkmovesbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        checkmovesbtn.setText("CHECK MOVES");
        checkmovesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkmovesbtnActionPerformed(evt);
            }
        });

        solutionbtn.setBackground(new java.awt.Color(255, 204, 102));
        solutionbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        solutionbtn.setText("SOLUTION");
        solutionbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solutionbtnActionPerformed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(255, 0, 0));
        exitbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitbtn.setText("EXIT");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(255, 255, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbtn4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn4.setText("5");
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn13ActionPerformed(evt);
            }
        });

        txtbtn14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn14.setText("7");
        txtbtn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn14ActionPerformed(evt);
            }
        });

        txtbtn15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn15.setText("8");
        txtbtn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn15ActionPerformed(evt);
            }
        });

        txtbtn24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn24ActionPerformed(evt);
            }
        });

        txtbtn23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn23.setText("4");
        txtbtn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn23ActionPerformed(evt);
            }
        });

        txtbtn22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtbtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtbtn22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtbtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtbtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtbtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbtn31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn31ActionPerformed(evt);
            }
        });

        txtbtn32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn32.setText("3");
        txtbtn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn32ActionPerformed(evt);
            }
        });

        txtbtn33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn33.setText("5");
        txtbtn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn33ActionPerformed(evt);
            }
        });

        txtbtn40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn40ActionPerformed(evt);
            }
        });

        txtbtn41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn41ActionPerformed(evt);
            }
        });

        txtbtn42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn42ActionPerformed(evt);
            }
        });

        txtbtn51.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn51ActionPerformed(evt);
            }
        });

        txtbtn50.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn50.setText("8");
        txtbtn50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn50ActionPerformed(evt);
            }
        });

        txtbtn49.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn49.setText("1");
        txtbtn49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn49ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtbtn31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtbtn40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtbtn49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtbtn33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtbtn32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtbtn31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtbtn49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtbtn50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtbtn51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 204));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbtn28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn28ActionPerformed(evt);
            }
        });

        txtbtn29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn29ActionPerformed(evt);
            }
        });

        txtbtn30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn30ActionPerformed(evt);
            }
        });

        txtbtn37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn37ActionPerformed(evt);
            }
        });

        txtbtn38.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn38.setText("3");
        txtbtn38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn38ActionPerformed(evt);
            }
        });

        txtbtn39.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn39.setText("4");
        txtbtn39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn39ActionPerformed(evt);
            }
        });

        txtbtn48.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn48ActionPerformed(evt);
            }
        });

        txtbtn47.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn47.setText("6");
        txtbtn47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn47ActionPerformed(evt);
            }
        });

        txtbtn46.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn46ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(txtbtn28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(txtbtn37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(txtbtn46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtbtn38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtbtn39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtbtn37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 204));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbtn7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn7.setText("7");
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn8.setText("3");
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn9.setText("4");
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtbtn16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn16.setText("5");
        txtbtn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn16ActionPerformed(evt);
            }
        });

        txtbtn17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn17ActionPerformed(evt);
            }
        });

        txtbtn18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn18.setText("9");
        txtbtn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn18ActionPerformed(evt);
            }
        });

        txtbtn27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn27ActionPerformed(evt);
            }
        });

        txtbtn26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn26.setText("2");
        txtbtn26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn26ActionPerformed(evt);
            }
        });

        txtbtn25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(txtbtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(txtbtn25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 204));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbtn34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn34ActionPerformed(evt);
            }
        });

        txtbtn35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn35.setText("9");
        txtbtn35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn35ActionPerformed(evt);
            }
        });

        txtbtn36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn36ActionPerformed(evt);
            }
        });

        txtbtn43.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn43.setText("2");
        txtbtn43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn43ActionPerformed(evt);
            }
        });

        txtbtn44.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn44.setText("8");
        txtbtn44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn44ActionPerformed(evt);
            }
        });

        txtbtn45.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn45ActionPerformed(evt);
            }
        });

        txtbtn54.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn54ActionPerformed(evt);
            }
        });

        txtbtn53.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn53ActionPerformed(evt);
            }
        });

        txtbtn52.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn52ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(txtbtn34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(txtbtn43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(txtbtn52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn54, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtbtn43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtbtn44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtbtn45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn54, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 204));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbtn55.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn55ActionPerformed(evt);
            }
        });

        txtbtn56.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn56.setText("4");
        txtbtn56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn56ActionPerformed(evt);
            }
        });

        txtbtn57.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn57ActionPerformed(evt);
            }
        });

        txtbtn64.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn64.setText("3");
        txtbtn64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn64ActionPerformed(evt);
            }
        });

        txtbtn65.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn65ActionPerformed(evt);
            }
        });

        txtbtn66.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn66.setText("5");
        txtbtn66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn66ActionPerformed(evt);
            }
        });

        txtbtn75.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn75.setText("9");
        txtbtn75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn75ActionPerformed(evt);
            }
        });

        txtbtn74.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn74.setText("8");
        txtbtn74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn74ActionPerformed(evt);
            }
        });

        txtbtn73.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn73.setText("6");
        txtbtn73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn73ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(txtbtn55, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn56, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn57, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(txtbtn64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn65, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn66, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(txtbtn73, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn74, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn75, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn57, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn56, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn55, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn65, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn66, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn73, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn74, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn75, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 204));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbtn58.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn58ActionPerformed(evt);
            }
        });

        txtbtn59.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn59.setText("5");
        txtbtn59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn59ActionPerformed(evt);
            }
        });

        txtbtn60.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn60ActionPerformed(evt);
            }
        });

        txtbtn67.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn67.setText("9");
        txtbtn67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn67ActionPerformed(evt);
            }
        });

        txtbtn68.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn68.setText("6");
        txtbtn68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn68ActionPerformed(evt);
            }
        });

        txtbtn69.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn69ActionPerformed(evt);
            }
        });

        txtbtn78.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn78.setText("1");
        txtbtn78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn78ActionPerformed(evt);
            }
        });

        txtbtn77.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn77ActionPerformed(evt);
            }
        });

        txtbtn76.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn76ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(txtbtn58, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn59, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn60, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(txtbtn67, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn68, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn69, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(txtbtn76, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn77, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn78, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn60, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn59, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn58, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtbtn67, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtbtn68, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtbtn69, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn77, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn76, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn78, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 204));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbtn61.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn61.setText("9");
        txtbtn61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn61ActionPerformed(evt);
            }
        });

        txtbtn62.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn62ActionPerformed(evt);
            }
        });

        txtbtn63.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn63.setText("6");
        txtbtn63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn63ActionPerformed(evt);
            }
        });

        txtbtn70.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn70ActionPerformed(evt);
            }
        });

        txtbtn71.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn71ActionPerformed(evt);
            }
        });

        txtbtn72.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn72.setText("2");
        txtbtn72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn72ActionPerformed(evt);
            }
        });

        txtbtn81.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn81ActionPerformed(evt);
            }
        });

        txtbtn80.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn80ActionPerformed(evt);
            }
        });

        txtbtn79.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn79ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(txtbtn61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn63, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(txtbtn70, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn71, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn72, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(txtbtn79, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn80, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn81, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn63, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn71, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn70, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn72, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn80, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn79, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn81, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(selectionbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(resetbtn)
                            .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkmovesbtn)
                            .addComponent(solutionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectionbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectionbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectionbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectionbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectionbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectionbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectionbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectionbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectionbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetbtn)
                    .addComponent(checkmovesbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitbtn)
                    .addComponent(solutionbtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void selectionbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbtn2ActionPerformed
        // TODO add your handling code here:
        turn = "2";
        selectionbtn2.setBackground(blue);
        
        selectionbtn1.setBackground(black);
        selectionbtn3.setBackground(black);
        selectionbtn4.setBackground(black);
        selectionbtn5.setBackground(black);
        selectionbtn6.setBackground(black);
        selectionbtn7.setBackground(black);
        selectionbtn8.setBackground(black);
        selectionbtn9.setBackground(black);
        
    }//GEN-LAST:event_selectionbtn2ActionPerformed

    private void selectionbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbtn3ActionPerformed
        // TODO add your handling code here:
        turn = "3";
        selectionbtn3.setBackground(blue);
        
        selectionbtn1.setBackground(black);
        selectionbtn2.setBackground(black);
        selectionbtn4.setBackground(black);
        selectionbtn5.setBackground(black);
        selectionbtn6.setBackground(black);
        selectionbtn7.setBackground(black);
        selectionbtn8.setBackground(black);
        selectionbtn9.setBackground(black);
    }//GEN-LAST:event_selectionbtn3ActionPerformed

    private void selectionbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbtn4ActionPerformed
        // TODO add your handling code here:
        turn = "4";
        selectionbtn4.setBackground(blue);
        
        selectionbtn1.setBackground(black);
        selectionbtn3.setBackground(black);
        selectionbtn2.setBackground(black);
        selectionbtn5.setBackground(black);
        selectionbtn6.setBackground(black);
        selectionbtn7.setBackground(black);
        selectionbtn8.setBackground(black);
        selectionbtn9.setBackground(black);
    }//GEN-LAST:event_selectionbtn4ActionPerformed

    private void selectionbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbtn5ActionPerformed
        // TODO add your handling code here:
          turn = "5";
        selectionbtn5.setBackground(blue);
        
        selectionbtn1.setBackground(black);
        selectionbtn3.setBackground(black);
        selectionbtn2.setBackground(black);
        selectionbtn4.setBackground(black);
        selectionbtn6.setBackground(black);
        selectionbtn7.setBackground(black);
        selectionbtn8.setBackground(black);
        selectionbtn9.setBackground(black);
        
    }//GEN-LAST:event_selectionbtn5ActionPerformed

    private void selectionbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbtn6ActionPerformed
        // TODO add your handling code here:
          turn = "6";
        selectionbtn6.setBackground(blue);
        
        selectionbtn1.setBackground(black);
        selectionbtn3.setBackground(black);
        selectionbtn2.setBackground(black);
        selectionbtn5.setBackground(black);
        selectionbtn4.setBackground(black);
        selectionbtn7.setBackground(black);
        selectionbtn8.setBackground(black);
        selectionbtn9.setBackground(black);
    }//GEN-LAST:event_selectionbtn6ActionPerformed

    private void selectionbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbtn7ActionPerformed
        // TODO add your handling code here:
          turn = "7";
        selectionbtn7.setBackground(blue);
        
        selectionbtn1.setBackground(black);
        selectionbtn3.setBackground(black);
        selectionbtn2.setBackground(black);
        selectionbtn5.setBackground(black);
        selectionbtn6.setBackground(black);
        selectionbtn4.setBackground(black);
        selectionbtn8.setBackground(black);
        selectionbtn9.setBackground(black);
    }//GEN-LAST:event_selectionbtn7ActionPerformed

    private void selectionbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbtn8ActionPerformed
        // TODO add your handling code here:
          turn = "8";
        selectionbtn8.setBackground(blue);
        
        selectionbtn1.setBackground(black);
        selectionbtn3.setBackground(black);
        selectionbtn2.setBackground(black);
        selectionbtn5.setBackground(black);
        selectionbtn6.setBackground(black);
        selectionbtn7.setBackground(black);
        selectionbtn4.setBackground(black);
        selectionbtn9.setBackground(black);
    }//GEN-LAST:event_selectionbtn8ActionPerformed

    private void selectionbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbtn9ActionPerformed
        // TODO add your handling code here:
          turn = "9";
        selectionbtn9.setBackground(blue);
        
        selectionbtn1.setBackground(black);
        selectionbtn3.setBackground(black);
        selectionbtn2.setBackground(black);
        selectionbtn5.setBackground(black);
        selectionbtn6.setBackground(black);
        selectionbtn7.setBackground(black);
        selectionbtn8.setBackground(black);
        selectionbtn4.setBackground(black);
    }//GEN-LAST:event_selectionbtn9ActionPerformed

    private void selectionbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbtn1ActionPerformed
        // TODO add your handling code here:
          turn = "1";
        selectionbtn1.setBackground(blue);
        
        selectionbtn4.setBackground(black);
        selectionbtn3.setBackground(black);
        selectionbtn2.setBackground(black);
        selectionbtn5.setBackground(black);
        selectionbtn6.setBackground(black);
        selectionbtn7.setBackground(black);
        selectionbtn8.setBackground(black);
        selectionbtn9.setBackground(black);
    }//GEN-LAST:event_selectionbtn1ActionPerformed

    private void txtbtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn10ActionPerformed
        // TODO add your handling code here
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn10ActionPerformed

    private void txtbtn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn19ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn19ActionPerformed

    private void txtbtn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn21ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn21ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn14ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn14ActionPerformed

    private void txtbtn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn23ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn23ActionPerformed

    private void txtbtn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn15ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn15ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void txtbtn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn16ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn16ActionPerformed

    private void txtbtn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn18ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn18ActionPerformed

    private void txtbtn26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn26ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn26ActionPerformed

    private void txtbtn35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn35ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn35ActionPerformed

    private void txtbtn43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn43ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn43ActionPerformed

    private void txtbtn44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn44ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn44ActionPerformed

    private void txtbtn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn32ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn32ActionPerformed

    private void txtbtn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn33ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn33ActionPerformed

    private void txtbtn49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn49ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn49ActionPerformed

    private void txtbtn50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn50ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn50ActionPerformed

    private void txtbtn38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn38ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn38ActionPerformed

    private void txtbtn39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn39ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn39ActionPerformed

    private void txtbtn47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn47ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn47ActionPerformed

    private void txtbtn56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn56ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn56ActionPerformed

    private void txtbtn64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn64ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn64ActionPerformed

    private void txtbtn66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn66ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn66ActionPerformed

    private void txtbtn73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn73ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn73ActionPerformed

    private void txtbtn74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn74ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn74ActionPerformed

    private void txtbtn75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn75ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn75ActionPerformed

    private void txtbtn59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn59ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn59ActionPerformed

    private void txtbtn67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn67ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn67ActionPerformed

    private void txtbtn68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn68ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn68ActionPerformed

    private void txtbtn78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn78ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn78ActionPerformed

    private void txtbtn61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn61ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn61ActionPerformed

    private void txtbtn63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn63ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn63ActionPerformed

    private void txtbtn72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn72ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn72ActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here:
        JFrame  frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit" , "SUDOKU PUZZLE GAME" ,JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitbtnActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
        // TODO add your handling code here:
        txtbtn1.setText(turn);
        txtbtn1.setBackground(white);
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        // TODO add your handling code here:
         txtbtn2.setText(turn);
        txtbtn2.setBackground(white);
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
        // TODO add your handling code here:
         txtbtn3.setText(turn);
        txtbtn3.setBackground(white);
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
        // TODO add your handling code here:
         txtbtn5.setText(turn);
        txtbtn5.setBackground(white);
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
        // TODO add your handling code here:
         txtbtn6.setText(turn);
        txtbtn6.setBackground(white);
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn13ActionPerformed
        // TODO add your handling code here:
         txtbtn13.setText(turn);
        txtbtn13.setBackground(white);
    }//GEN-LAST:event_txtbtn13ActionPerformed

    private void txtbtn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn22ActionPerformed
        // TODO add your handling code here:
         txtbtn22.setText(turn);
        txtbtn22.setBackground(white);
    }//GEN-LAST:event_txtbtn22ActionPerformed

    private void txtbtn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn24ActionPerformed
        // TODO add your handling code here:
         txtbtn24.setText(turn);
        txtbtn24.setBackground(white);
    }//GEN-LAST:event_txtbtn24ActionPerformed

    private void txtbtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn11ActionPerformed
        // TODO add your handling code here:
         txtbtn11.setText(turn);
        txtbtn11.setBackground(white);
    }//GEN-LAST:event_txtbtn11ActionPerformed

    private void txtbtn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn12ActionPerformed
        // TODO add your handling code here:
         txtbtn12.setText(turn);
        txtbtn12.setBackground(white);
    }//GEN-LAST:event_txtbtn12ActionPerformed

    private void txtbtn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn20ActionPerformed
        // TODO add your handling code here:
         txtbtn20.setText(turn);
        txtbtn20.setBackground(white);
    }//GEN-LAST:event_txtbtn20ActionPerformed

    private void txtbtn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn25ActionPerformed
        // TODO add your handling code here:
         txtbtn25.setText(turn);
        txtbtn25.setBackground(white);
    }//GEN-LAST:event_txtbtn25ActionPerformed

    private void txtbtn27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn27ActionPerformed
        // TODO add your handling code here:
         txtbtn27.setText(turn);
        txtbtn27.setBackground(white);
    }//GEN-LAST:event_txtbtn27ActionPerformed

    private void txtbtn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn17ActionPerformed
        // TODO add your handling code here:
         txtbtn17.setText(turn);
        txtbtn17.setBackground(white);
    }//GEN-LAST:event_txtbtn17ActionPerformed

    private void txtbtn28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn28ActionPerformed
        // TODO add your handling code here:
         txtbtn28.setText(turn);
        txtbtn28.setBackground(white);
    }//GEN-LAST:event_txtbtn28ActionPerformed

    private void txtbtn29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn29ActionPerformed
        // TODO add your handling code here:
         txtbtn29.setText(turn);
        txtbtn29.setBackground(white);
    }//GEN-LAST:event_txtbtn29ActionPerformed

    private void txtbtn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn30ActionPerformed
        // TODO add your handling code here:
         txtbtn30.setText(turn);
        txtbtn30.setBackground(white);
    }//GEN-LAST:event_txtbtn30ActionPerformed

    private void txtbtn37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn37ActionPerformed
        // TODO add your handling code here:
         txtbtn37.setText(turn);
        txtbtn37.setBackground(white);
    }//GEN-LAST:event_txtbtn37ActionPerformed

    private void txtbtn46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn46ActionPerformed
        // TODO add your handling code here:
         txtbtn46.setText(turn);
        txtbtn46.setBackground(white);
    }//GEN-LAST:event_txtbtn46ActionPerformed

    private void txtbtn48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn48ActionPerformed
        // TODO add your handling code here:
         txtbtn48.setText(turn);
        txtbtn48.setBackground(white);
    }//GEN-LAST:event_txtbtn48ActionPerformed

    private void txtbtn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn31ActionPerformed
        // TODO add your handling code here:
         txtbtn31.setText(turn);
        txtbtn31.setBackground(white);
    }//GEN-LAST:event_txtbtn31ActionPerformed

    private void txtbtn40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn40ActionPerformed
        // TODO add your handling code here:
         txtbtn40.setText(turn);
        txtbtn40.setBackground(white);
    }//GEN-LAST:event_txtbtn40ActionPerformed

    private void txtbtn41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn41ActionPerformed
        // TODO add your handling code here:
         txtbtn41.setText(turn);
        txtbtn41.setBackground(white);
    }//GEN-LAST:event_txtbtn41ActionPerformed

    private void txtbtn42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn42ActionPerformed
        // TODO add your handling code here:
         txtbtn42.setText(turn);
        txtbtn42.setBackground(white);
    }//GEN-LAST:event_txtbtn42ActionPerformed

    private void txtbtn51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn51ActionPerformed
        // TODO add your handling code here:
         txtbtn51.setText(turn);
        txtbtn51.setBackground(white);
    }//GEN-LAST:event_txtbtn51ActionPerformed

    private void txtbtn34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn34ActionPerformed
        // TODO add your handling code here:
         txtbtn34.setText(turn);
        txtbtn34.setBackground(white);
    }//GEN-LAST:event_txtbtn34ActionPerformed

    private void txtbtn36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn36ActionPerformed
        // TODO add your handling code here:
         txtbtn36.setText(turn);
        txtbtn36.setBackground(white);
    }//GEN-LAST:event_txtbtn36ActionPerformed

    private void txtbtn45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn45ActionPerformed
        // TODO add your handling code here:
         txtbtn45.setText(turn);
        txtbtn45.setBackground(white);
    }//GEN-LAST:event_txtbtn45ActionPerformed

    private void txtbtn52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn52ActionPerformed
        // TODO add your handling code here:
         txtbtn52.setText(turn);
        txtbtn52.setBackground(white);
    }//GEN-LAST:event_txtbtn52ActionPerformed

    private void txtbtn53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn53ActionPerformed
        // TODO add your handling code here:
         txtbtn53.setText(turn);
        txtbtn53.setBackground(white);
    }//GEN-LAST:event_txtbtn53ActionPerformed

    private void txtbtn54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn54ActionPerformed
        // TODO add your handling code here:
         txtbtn54.setText(turn);
        txtbtn54.setBackground(white);
    }//GEN-LAST:event_txtbtn54ActionPerformed

    private void txtbtn55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn55ActionPerformed
        // TODO add your handling code here:
         txtbtn55.setText(turn);
        txtbtn55.setBackground(white);
    }//GEN-LAST:event_txtbtn55ActionPerformed

    private void txtbtn57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn57ActionPerformed
        // TODO add your handling code here:
         txtbtn57.setText(turn);
        txtbtn57.setBackground(white);
    }//GEN-LAST:event_txtbtn57ActionPerformed

    private void txtbtn58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn58ActionPerformed
        // TODO add your handling code here:
         txtbtn58.setText(turn);
        txtbtn58.setBackground(white);
    }//GEN-LAST:event_txtbtn58ActionPerformed

    private void txtbtn60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn60ActionPerformed
        // TODO add your handling code here:
         txtbtn60.setText(turn);
        txtbtn60.setBackground(white);
    }//GEN-LAST:event_txtbtn60ActionPerformed

    private void txtbtn62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn62ActionPerformed
        // TODO add your handling code here:
         txtbtn62.setText(turn);
        txtbtn62.setBackground(white);
    }//GEN-LAST:event_txtbtn62ActionPerformed

    private void txtbtn70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn70ActionPerformed
        // TODO add your handling code here:
         txtbtn70.setText(turn);
        txtbtn70.setBackground(white);
    }//GEN-LAST:event_txtbtn70ActionPerformed

    private void txtbtn71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn71ActionPerformed
        // TODO add your handling code here:
         txtbtn71.setText(turn);
        txtbtn71.setBackground(white);
    }//GEN-LAST:event_txtbtn71ActionPerformed

    private void txtbtn79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn79ActionPerformed
        // TODO add your handling code here:
         txtbtn79.setText(turn);
        txtbtn79.setBackground(white);
    }//GEN-LAST:event_txtbtn79ActionPerformed

    private void txtbtn80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn80ActionPerformed
        // TODO add your handling code here:
         txtbtn80.setText(turn);
        txtbtn80.setBackground(white);
    }//GEN-LAST:event_txtbtn80ActionPerformed

    private void txtbtn81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn81ActionPerformed
        // TODO add your handling code here:
         txtbtn81.setText(turn);
        txtbtn81.setBackground(white);
    }//GEN-LAST:event_txtbtn81ActionPerformed

    private void txtbtn69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn69ActionPerformed
        // TODO add your handling code here:
         txtbtn69.setText(turn);
        txtbtn69.setBackground(white);
    }//GEN-LAST:event_txtbtn69ActionPerformed

    private void txtbtn76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn76ActionPerformed
        // TODO add your handling code here:
         txtbtn76.setText(turn);
        txtbtn76.setBackground(white);
    }//GEN-LAST:event_txtbtn76ActionPerformed

    private void txtbtn77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn77ActionPerformed
        // TODO add your handling code here:
         txtbtn77.setText(turn);
        txtbtn77.setBackground(white);
    }//GEN-LAST:event_txtbtn77ActionPerformed

    private void txtbtn65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn65ActionPerformed
        // TODO add your handling code here:
         txtbtn65.setText(turn);
        txtbtn65.setBackground(white);
    }//GEN-LAST:event_txtbtn65ActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
        JFrame  frame = new JFrame("Reset");
        
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to Reset" , "SUDOKU PUZZLE GAME" ,JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            resetBoard();
        }
    }//GEN-LAST:event_resetbtnActionPerformed

    private void solutionbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solutionbtnActionPerformed
        // TODO add your handling code here:
        seeSolution();
    }//GEN-LAST:event_solutionbtnActionPerformed

    private void checkmovesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkmovesbtnActionPerformed
        // TODO add your handling code here:
        checkMoves();
        isSolved();
    }//GEN-LAST:event_checkmovesbtnActionPerformed

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
            java.util.logging.Logger.getLogger(sudoku_puzzle_game_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sudoku_puzzle_game_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sudoku_puzzle_game_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sudoku_puzzle_game_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sudoku_puzzle_game_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkmovesbtn;
    private javax.swing.JButton exitbtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton selectionbtn1;
    private javax.swing.JButton selectionbtn2;
    private javax.swing.JButton selectionbtn3;
    private javax.swing.JButton selectionbtn4;
    private javax.swing.JButton selectionbtn5;
    private javax.swing.JButton selectionbtn6;
    private javax.swing.JButton selectionbtn7;
    private javax.swing.JButton selectionbtn8;
    private javax.swing.JButton selectionbtn9;
    private javax.swing.JButton solutionbtn;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn10;
    private javax.swing.JButton txtbtn11;
    private javax.swing.JButton txtbtn12;
    private javax.swing.JButton txtbtn13;
    private javax.swing.JButton txtbtn14;
    private javax.swing.JButton txtbtn15;
    private javax.swing.JButton txtbtn16;
    private javax.swing.JButton txtbtn17;
    private javax.swing.JButton txtbtn18;
    private javax.swing.JButton txtbtn19;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn20;
    private javax.swing.JButton txtbtn21;
    private javax.swing.JButton txtbtn22;
    private javax.swing.JButton txtbtn23;
    private javax.swing.JButton txtbtn24;
    private javax.swing.JButton txtbtn25;
    private javax.swing.JButton txtbtn26;
    private javax.swing.JButton txtbtn27;
    private javax.swing.JButton txtbtn28;
    private javax.swing.JButton txtbtn29;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn30;
    private javax.swing.JButton txtbtn31;
    private javax.swing.JButton txtbtn32;
    private javax.swing.JButton txtbtn33;
    private javax.swing.JButton txtbtn34;
    private javax.swing.JButton txtbtn35;
    private javax.swing.JButton txtbtn36;
    private javax.swing.JButton txtbtn37;
    private javax.swing.JButton txtbtn38;
    private javax.swing.JButton txtbtn39;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn40;
    private javax.swing.JButton txtbtn41;
    private javax.swing.JButton txtbtn42;
    private javax.swing.JButton txtbtn43;
    private javax.swing.JButton txtbtn44;
    private javax.swing.JButton txtbtn45;
    private javax.swing.JButton txtbtn46;
    private javax.swing.JButton txtbtn47;
    private javax.swing.JButton txtbtn48;
    private javax.swing.JButton txtbtn49;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn50;
    private javax.swing.JButton txtbtn51;
    private javax.swing.JButton txtbtn52;
    private javax.swing.JButton txtbtn53;
    private javax.swing.JButton txtbtn54;
    private javax.swing.JButton txtbtn55;
    private javax.swing.JButton txtbtn56;
    private javax.swing.JButton txtbtn57;
    private javax.swing.JButton txtbtn58;
    private javax.swing.JButton txtbtn59;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn60;
    private javax.swing.JButton txtbtn61;
    private javax.swing.JButton txtbtn62;
    private javax.swing.JButton txtbtn63;
    private javax.swing.JButton txtbtn64;
    private javax.swing.JButton txtbtn65;
    private javax.swing.JButton txtbtn66;
    private javax.swing.JButton txtbtn67;
    private javax.swing.JButton txtbtn68;
    private javax.swing.JButton txtbtn69;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn70;
    private javax.swing.JButton txtbtn71;
    private javax.swing.JButton txtbtn72;
    private javax.swing.JButton txtbtn73;
    private javax.swing.JButton txtbtn74;
    private javax.swing.JButton txtbtn75;
    private javax.swing.JButton txtbtn76;
    private javax.swing.JButton txtbtn77;
    private javax.swing.JButton txtbtn78;
    private javax.swing.JButton txtbtn79;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn80;
    private javax.swing.JButton txtbtn81;
    private javax.swing.JButton txtbtn9;
    // End of variables declaration//GEN-END:variables
}
