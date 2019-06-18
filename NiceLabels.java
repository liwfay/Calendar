//NiceLabels.java
//////////////Written by lofone at 2019/6/3/////////////////

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
import java.util.Random;

public class NiceLabels extends JPanel{
	private static final long serialVersionUID = 1L;
    
    Color C = Color.WHITE;
    Random R = new Random();
    JLabel Label_Alarm = new JLabel("Alarm: 00 : 00");
    JLabel Label_Remind = new JLabel("Reminds: June.1st Children's Day");
    JLabel Label_Tips = new JLabel("Tips: Pray/Marry/Bath/Trip");
    

    NiceLabels(){
        Label_Alarm.setFont(new Font("Arove", 1, 30));
        Label_Alarm.setForeground(Color.BLUE);
        
        Label_Remind.setFont(new Font("Arove", 1, 30));
        Label_Remind.setForeground(Color.BLUE);
        
        Label_Tips.setFont(new Font("Arove", 1, 30));
        Label_Tips.setForeground(Color.BLUE);
      
        setLayout(new GridLayout(3, 1));   
       // setBackground(C); 
        
        add(Label_Remind);
        add(Label_Tips);
        add(Label_Alarm);
    }

    String getTips(){
        int i = R.nextInt(10);
        String S[] = new String[10];
        S[0] = "Tips: Neither good nor bad";
        S[1] = "Tips: No drink/Travel/Funeral";
        S[2] = "Tips: Visit/Trade/Haircut/Trip";
        S[3] = "Tips: No felling/Marry/Bath";
        S[4] = "Tips: No pray/Build/Plant";
        S[5] = "Tips: Do nothing/Unlucky day";
        S[6] = "Tips: Pray/Marry/Bath/Trip";
        S[7] = "Tips: No marry/No swim/Decorate";
        S[8] = "Tips: No build/No trade/Mo felling";
        S[9] = "Tips: Everything goes well";

        return S[i];
    }
    void getRemind(int num){
        switch(num){
            case 11: Label_Remind.setText("Reminds: Jan.1st NewYear's Day");break;
            case 214: Label_Remind.setText("Reminds: Feb.14th Valentine's Day");break;
            case 38: Label_Remind.setText("Reminds: Mar.8th Women's Day");break;
            case 41: Label_Remind.setText("Reminds: Apr.1st April Fool's Day");break;
            case 422: Label_Remind.setText("Reminds: Apr.22th Earth Day");break;
            case 51: Label_Remind.setText("Reminds: May 1st Labour Day");break;
			case 54: Label_Remind.setText("Reminds: May 4th Youth Day");break;
			case 57: Label_Remind.setText("Reminds: May 7th Hui's Birthday Day");break;
            case 61: Label_Remind.setText("Reminds: June.1st Children's Day");break;
            case 71: Label_Remind.setText("Reminds: July 1st CPC Founding Day");break;
			case 81: Label_Remind.setText("Reminds: Aug.1st Army Day");break;
			case 96: Label_Remind.setText("Reminds: Sept.6th My Birthday Day");break;
            case 910: Label_Remind.setText("Reminds: Sept.10th Teacher's Day");break;
            case 101: Label_Remind.setText("Reminds: Oct.1st National Day");break;
            case 1128: Label_Remind.setText("Reminds: Nov.28th Thanksgiving Day");break;
            case 1224: Label_Remind.setText("Reminds: Dec.24th Christmas Eve");break;
            case 1225: Label_Remind.setText("Reminds: Dec.25th Christmas Day");break;
            default: Label_Remind.setText("Reminds: NULL");
        }
    }
}