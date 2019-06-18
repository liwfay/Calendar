//NiceMenuPanel.java
//////////////Written by lofone at 2019/6/3/////////////////

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NicePanel extends JPanel implements ActionListener {
    private static final long serialVersionUID = 1L;
    NiceBase NB = new NiceBase();
    NiceLabels NL = new NiceLabels();
    
    JPanel Panel_Center = new JPanel();
    JPanel Panel_South = new JPanel();    
    JPanel Panel_North = new JPanel();
    
    JButton Button_Day[] = new JButton[42];                    //7x6
    JLabel Label_Week[] = new JLabel[7];                       //7days a week                 
    JButton Button_Current = new JButton("NOW");              //skip to now    
    JButton Button_nextMonth = new JButton(">");                //skip to next month
    JButton Button_lastMonth = new JButton("<");                //skip to last month
    JButton Button_nextYear = new JButton(">>");                //skip to next year
    JButton Button_lastYear = new JButton("<<");             //skip to last year
    
    JLabel Label_Year = new JLabel("2019");                     //defaykt year and month
    JLabel Label_Month = new JLabel("Jun.");
    JLabel Label_Calendar = new JLabel("Nice Calendar");        //title   

    String Week[] = {"SUN", "MON", "TUE", "WED", "THR", "FRI", "SAT"}; 
    
    
    NicePanel(){
        setLayout(new BorderLayout());                          //border layout
        
        Label_Calendar.setFont(new Font("Arove", 1, 30));  
        Label_Calendar.setForeground(Color.RED);      
                                                     
        Panel_Center.setLayout(new GridLayout(7, 7));                  //Layout : 7X7 gird
           
        for(int i = 0; i < 7; i++){                                    //add week[] to panel          
            Label_Week[i] = new JLabel(Week[i], JLabel.CENTER);                              
            Label_Week[i].setFont(new Font("Arvo", 1, 20));
            Label_Week[i].setForeground(Color.GREEN);
            Label_Week[i].setBackground(NL.C);
            Panel_Center.add(Label_Week[i]);
        }                                              
        for(int i = 0; i < 42; i++){                                     //add day[] to panel         
            Button_Day[i] = new JButton("None");
            Button_Day[i].setBorder(BorderFactory.createLineBorder(Color.WHITE));
            Panel_Center.add(Button_Day[i]);                                       
        }   
             
        Label_Year.setFont(new Font("Arove", 1, 22));
        Label_Year.setForeground(Color.CYAN);
        Label_Month.setFont(new Font("Arove", 1, 22));
        Label_Month.setForeground(Color.CYAN);
        
        Panel_North.add(Label_Calendar);                   
    
        /*add */
        Panel_South.add(Button_lastYear);
        Panel_South.add(Label_Year);
        Panel_South.add(Button_nextYear);  
        Panel_South.add(Button_Current);               
        Panel_South.add(Button_lastMonth);
        Panel_South.add(Label_Month);
        Panel_South.add(Button_nextMonth);
        
        /*set layout */
        add(Panel_North, BorderLayout.NORTH);   
        add(Panel_Center, BorderLayout.CENTER);             
        add(Panel_South, BorderLayout.SOUTH);

        /*add action listener */
        for(int i = 0; i < 42; i++){
            Button_Day[i].addActionListener(this);
        }
        
        Button_lastYear.addActionListener(this); 
        Button_nextYear.addActionListener(this); 
        Button_Current.addActionListener(this);
        Button_lastMonth.addActionListener(this);
        Button_nextMonth.addActionListener(this);  
        
        Button_Current.setFont(new Font("Arove", 1, 18));
        Button_lastYear.setFont(new Font("Arove", 1, 18));
        Button_nextYear.setFont(new Font("Arove", 1, 18));
        Button_lastMonth.setFont(new Font("Arove", 1, 18));
        Button_nextMonth.setFont(new Font("Arove", 1, 18));
    }
    
    void refresh(){
        String day[] = NB.getCalendar();
        String month;
        for(int i = 0; i<42; i++){                                              
        	Button_Day[i].setForeground(Color.CYAN);
        	Button_Day[i].setFont(new Font("Arove", 1, 22));
            Button_Day[i].setText(day[i]);  
            
        }
        switch(NB.getMonth()){
            case 1:month = " Jan. ";break;
            case 2:month = " Feb. ";break;
            case 3:month = " Mar. ";break;
            case 4:month = " Apr. ";break;
            case 5:month = " May  ";break;
            case 6:month = " Jun. ";break;
            case 7:month = " Jul. ";break;
            case 8:month = " Aug. ";break;
            case 9:month = " Sept.";break;
            case 10:month = " Oct. ";break;
            case 11:month = " Nov. ";break;
            case 12:month = " Dec. ";break;
            default:month = " NULL ";
        }
        Label_Year.setText(" "+ NB.getYear() +" ");
        Label_Month.setText(month);
    }
    @Override
	public void actionPerformed(ActionEvent e) {
        
		if(e.getSource() == Button_Day[0]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[0].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
            
        }
        else if(e.getSource() == Button_Day[1]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[1].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[2]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[2].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[3]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[3].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[4]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[4].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[5]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[5].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[6]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[6].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[7]){
            int number = Integer.valueOf(NB.getMonth() +  Button_Day[7].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[8]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[6].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[9]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[6].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[10]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[10].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[11]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[11].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[12]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[12].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[13]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[13].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[14]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[14].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[15]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[15].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[16]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[16].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[17]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[17].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[18]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[18].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[19]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[19].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[21]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[20].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
            
        }
        else if(e.getSource() == Button_Day[22]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[22].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
            
        }
        else if(e.getSource() == Button_Day[23]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[23].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
            
        }
        else if(e.getSource() == Button_Day[24]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[24].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
            
        }
        else if(e.getSource() == Button_Day[25]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[25].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
            
        }
        else if(e.getSource() == Button_Day[26]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[26].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
            
        }
        else if(e.getSource() == Button_Day[27]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[27].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
            
        }
        else if(e.getSource() == Button_Day[28]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[28].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
            
        }
        else if(e.getSource() == Button_Day[29]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[29].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
            
        }
        else if(e.getSource() == Button_Day[30]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[30].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
            
        }
        else if(e.getSource() == Button_Day[31]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[31].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[32]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[32].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[33]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[33].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[34]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[34].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[35]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[35].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[36]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[36].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[37]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[37].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[38]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[38].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[39]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[39].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[40]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[40].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }
        else if(e.getSource() == Button_Day[41]){
            int number = Integer.valueOf(NB.getMonth() + Button_Day[41].getText());
            NL.getRemind(number);
            NL.Label_Tips.setText(NL.getTips());
        }  
        
        
        if(e.getSource() == Button_lastYear){
            NB.setYear(NB.getYear()-1);
            refresh();
        }
        
        else if(e.getSource() == Button_nextYear){
            NB.setYear(NB.getYear()+1);
            refresh();
        }
        
        else if(e.getSource() == Button_Current){
            Calendar C = Calendar.getInstance();                              
            int year = C.get(Calendar.YEAR);                                     
            int month = C.get(Calendar.MONTH)+1;
            NB.setYear(year);
            NB.setMonth(month);
            refresh();
        }
        else if(e.getSource() == Button_lastMonth){
            
            NB.setMonth(NB.getMonth() - 1);
            refresh();
            
        }
        else if(e.getSource() == Button_nextMonth){
            NB.setMonth(NB.getMonth() + 1);
            refresh();
        }
        
    }
    
}