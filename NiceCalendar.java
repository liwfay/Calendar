//NiceCalendar.java
//////////////Written by lofone at 2019/6/3/////////////////

/*
__Name__ : NiceCalendar 5.0
__Authr__ : lofone
__Major__ : computer science
__Term__ : 2018-2019-2
 */

import java.awt.*;

public class NiceCalendar{                                
    public static void main(String[] args){
        NiceFrame NF = new NiceFrame();       //Window
  
        NF.setBounds(200,200,1200,600);        //1200X600

        Image image = Toolkit.getDefaultToolkit().createImage("logo.jpg");      //logo                  
        NF.setIconImage(image);                //icon
        NF.setTitle("Nice Calendar");          //title
        NF.setVisible(true);                   //let the window visible
     }; //end of main          
} //end of class NiceCalendar