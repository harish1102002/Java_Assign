import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

class GamePanel implements ActionListener{
    JFrame frame;
    JPanel titlePanel;
    JPanel buttonPanel;
    JLabel textLabel;
    JButton[] buttons=new JButton[9];
    Random random=new Random();
    boolean player1Turn=true;
    GamePanel(){
        frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setLayout(new BorderLayout());

        textLabel=new JLabel("Tic-Tac-Toe");
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setFont(new Font("MV Boli",Font.BOLD,75));
        textLabel.setForeground(Color.orange);

        titlePanel=new JPanel();
        titlePanel.setLayout(new BorderLayout());
        titlePanel.setBounds(0,0,800,100);
        titlePanel.setBackground(Color.black);
        titlePanel.setOpaque(true);
        titlePanel.add(textLabel);

        buttonPanel=new JPanel();
        buttonPanel.setLayout(new GridLayout(3,3));

        for(int i=0;i<9;i++){
            buttons[i]=new JButton();
            buttonPanel.add(buttons[i]);
            buttons[i].setFocusable(false);
            buttons[i].setFont(new Font("MV Boli",Font.BOLD,100));
            buttons[i].setBackground(Color.lightGray);
            buttons[i].addActionListener(this);
        }

        frame.add(buttonPanel);
        frame.add(titlePanel,BorderLayout.NORTH);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        firstTurn();       
    }
    public void actionPerformed(ActionEvent e){
       for(int i=0;i<9;i++){
        if(e.getSource()==buttons[i]){
            if(buttons[i].getText()==""){
                if(player1Turn){
                    buttons[i].setText("X");
                    buttons[i].setForeground(Color.red);
                    player1Turn=false;
                    textLabel.setText("O Turn");
                    check();
                }
                else{
                    buttons[i].setText("O");
                    buttons[i].setForeground(Color.blue);
                    player1Turn=true;
                    textLabel.setText("X Turn");
                    check();
                }
            }
        }
       }
    }
    public void firstTurn(){
        try{
            Thread.sleep(2000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        if(player1Turn==true){
            textLabel.setText("X turn");
        }
    }
    public void check(){
        if(buttons[0].getText()=="X"&&buttons[1].getText()=="X"&&buttons[2].getText()=="X")
            xWins(0, 1, 2);
        if(buttons[3].getText()=="X"&&buttons[4].getText()=="X"&&buttons[5].getText()=="X")
            xWins(3, 4, 5);
        if(buttons[6].getText()=="X"&&buttons[7].getText()=="X"&&buttons[8].getText()=="X")
            xWins(6, 7, 8);
        if(buttons[0].getText()=="X"&&buttons[3].getText()=="X"&&buttons[6].getText()=="X")
            xWins(0, 3, 6);
        if(buttons[1].getText()=="X"&&buttons[4].getText()=="X"&&buttons[7].getText()=="X")
            xWins(1, 4, 7);
        if(buttons[2].getText()=="X"&&buttons[5].getText()=="X"&&buttons[8].getText()=="X")
            xWins(2, 5, 8);
        if(buttons[0].getText()=="X"&&buttons[4].getText()=="X"&&buttons[8].getText()=="X")
            xWins(0, 4, 8);
        if(buttons[2].getText()=="X"&&buttons[4].getText()=="X"&&buttons[6].getText()=="X")
            xWins(2, 4, 6);

        if(buttons[0].getText()=="O"&&buttons[1].getText()=="O"&&buttons[2].getText()=="O")
            yWins(0, 1, 2);
        if(buttons[3].getText()=="O"&&buttons[4].getText()=="O"&&buttons[5].getText()=="O")
            yWins(3, 4, 5);
        if(buttons[6].getText()=="O"&&buttons[7].getText()=="O"&&buttons[8].getText()=="O")
            yWins(6, 7, 8);
        if(buttons[0].getText()=="O"&&buttons[3].getText()=="O"&&buttons[6].getText()=="O")
            yWins(0, 3, 6);
        if(buttons[1].getText()=="O"&&buttons[4].getText()=="O"&&buttons[7].getText()=="O")
            yWins(1, 4, 7);
        if(buttons[2].getText()=="O"&&buttons[5].getText()=="O"&&buttons[8].getText()=="O")
            yWins(2, 5, 8);
        if(buttons[0].getText()=="O"&&buttons[4].getText()=="O"&&buttons[8].getText()=="O")
            yWins(0, 4, 8);
        if(buttons[2].getText()=="O"&&buttons[4].getText()=="O"&&buttons[6].getText()=="O")
            yWins(2, 4, 6);              
       }
           
    public void xWins(int a,int b,int c){
            buttons[a].setBackground(Color.green);
            buttons[b].setBackground(Color.green);
            buttons[c].setBackground(Color.green);
            for(int i=0;i<9;i++){
                buttons[i].setEnabled(false);
            }
            textLabel.setText("X Wins");
    }
    public void yWins(int a,int b,int c){
        buttons[a].setBackground(Color.green);
        buttons[b].setBackground(Color.green);
        buttons[c].setBackground(Color.green);
        for(int i=0;i<9;i++){
            buttons[i].setEnabled(false);
        }
        textLabel.setText("O Wins");
    }
}

public class TicTacToe {
    public static void main(String args[]){
        GamePanel game=new GamePanel();
    }
}