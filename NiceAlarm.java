//NiceAlarm.java
//////////////Written by lofone at 2019/6/3/////////////////

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NiceAlarm extends JFrame implements ActionListener{
    private static final long serialVersionUID = 1L;

    NiceLabels NL;
    JPanel Panel_Alarm = new JPanel(new GridLayout(4, 1));
    
    
    JPanel Panel_Row4 = new JPanel();
    JPanel Panel_Row3 = new JPanel();
    JPanel Panel_Row2 = new JPanel();
    JPanel Panel_Row1 = new JPanel();
    
    JLabel Label_Tips = new JLabel("Just set a time : ");
    JLabel Label_H = new JLabel("Hour   : ");
    JLabel Label_M = new JLabel("Minute : ");
    
    JTextField Textfield_H = new JTextField(5);
    JTextField Textfield_M = new JTextField(5);
    
    JButton Button_Set = new JButton("Set");

    
    NiceAlarm(NiceLabels NL){
        this.NL = NL;
        
        setBounds(800,450,300, 200);
        setTitle("Alarm");   
        setVisible(true); 
        
        Panel_Row4.add(Label_Tips);
        Panel_Row3.add(Label_H);
        Panel_Row3.add(Textfield_H);
        Panel_Row2.add(Label_M);
        Panel_Row2.add(Textfield_M);
        Panel_Row1.add(Button_Set);
        
        Panel_Row4.setBackground(Color.WHITE);
        Panel_Row3.setBackground(Color.WHITE);
        Panel_Row2.setBackground(Color.WHITE);
        Panel_Row1.setBackground(Color.WHITE);
        
        Panel_Alarm.add(Panel_Row4);
        Panel_Alarm.add(Panel_Row3);
        Panel_Alarm.add(Panel_Row2);
        Panel_Alarm.add(Panel_Row1);
        
        add(Panel_Alarm);
        
        Textfield_H.addActionListener(this);
        Textfield_M.addActionListener(this);
        Button_Set.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == Textfield_H){
            NL.Label_Alarm.setText("Alarm: "+ 
            Textfield_H.getText() +":"+ Textfield_M.getText());
            
        }
        if(e.getSource() == Textfield_M){
            NL.Label_Alarm.setText("Alarm: "+ 
            Textfield_H.getText() +":"+ Textfield_M.getText());
        }
        if(e.getSource() == Button_Set){
            
            this.dispose();
            new NiceTimer(Integer.valueOf(Textfield_H.getText()),
            Integer.valueOf(Textfield_M.getText()), NL).run();
            
        }
    }
}