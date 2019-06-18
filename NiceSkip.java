//NiceSkip.java
//////////////Written by lofone at 2019/6/3/////////////////

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NiceSkip extends JFrame implements ActionListener{
    private static final long serialVersionUID = 1L;
    
    NicePanel NP;
    JPanel Panel_Skip = new JPanel(new GridLayout(4, 1));
    JPanel Panel_Row4 = new JPanel();
    JPanel Panel_Row3 = new JPanel();
    JPanel Panel_Row2 = new JPanel();
    JPanel Panel_Row1 = new JPanel();
    
    JLabel Label_Tips = new JLabel("When would you wanna jump ? ");
    JLabel Label_Y = new JLabel("Which Year : ");
    JLabel Label_M = new JLabel("Which Month: ");
    
    JTextField Textfield_Y = new JTextField(5);
    JTextField Textfield_M = new JTextField(5);
    
    JButton Button_Skip = new JButton("Skip");
    
    
    
    NiceSkip(NicePanel NP){
        
        
        setBounds(800,450,300, 200);
        setTitle("Skip");   
        setVisible(true); 
        
        this.NP = NP;
        
        Panel_Row4.add(Label_Tips);
        Panel_Row3.add(Label_Y);
        Panel_Row3.add(Textfield_Y);
        Panel_Row2.add(Label_M);
        Panel_Row2.add(Textfield_M);
        Panel_Row1.add(Button_Skip);
        
        Panel_Row4.setBackground(Color.WHITE);
        Panel_Row3.setBackground(Color.WHITE);
        Panel_Row2.setBackground(Color.WHITE);
        Panel_Row1.setBackground(Color.WHITE);
        
        Panel_Skip.add(Panel_Row4);
        Panel_Skip.add(Panel_Row3);
        Panel_Skip.add(Panel_Row2);
        Panel_Skip.add(Panel_Row1);
        
        add(Panel_Skip);
        
        Button_Skip.addActionListener(this);
    }
    
    void Skip(NicePanel NP){
        NP.NB.setYear(Integer.valueOf(Textfield_Y.getText()));
        NP.NB.setMonth(Integer.valueOf(Textfield_M.getText()));
        NP.refresh();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == Button_Skip){
            Skip(NP);
            this.dispose();
        }
    }
}