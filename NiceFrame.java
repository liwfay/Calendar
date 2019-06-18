//NiceCalendar.java
//////////////Written by lofone at 2019/6/3/////////////////

import java.awt.*;
import javax.swing.*;

public class NiceFrame extends JFrame{
    private static final long serialVersionUID = 1L; //default
    
    NiceClock NC = new NiceClock(new ImageIcon("WHITE.jpg")); //background
    NiceMenubar NM = new NiceMenubar(NC);                     //combine NiceMenubar

    JPanel Panel_Left = new JPanel(new GridLayout(2, 1));     //set layout

    public NiceFrame(){   //constructer

        setVisible(true);                                     //visible                          
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);           //dispose
 
        Panel_Left.add(NC);                                   //add NiceClock
        Panel_Left.add(NM.NP.NL);                              //add NiceLabels
        
       
        setLayout(new GridLayout(1, 2));                     //set layout
        setJMenuBar(NM);                                    //add Menubar
        add(Panel_Left);                                     //add Panel_Left        
        add(NM.NP);                                         //add NicePanel
        
        NM.NP.refresh();	                                //show default calendar
    } //end of constructer
} //end of class NiceFrame