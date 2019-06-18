//NiceTimer.java
//////////////Written by lofone at 2019/6/3/////////////////

public class NiceTimer{                                       //Timer
    
    NiceLabels NL;                                              //combine NL
    int goalHour;
    int goalMinute;

    
    NiceTimer(int goalHour, int goalMinute, NiceLabels NL) { //reference NiceLabels
        this.goalHour = (goalHour-8)%24;                         //switch time difference
        this.goalMinute = goalMinute;
        this.NL = NL;
    }

    public void run() {
        int currentSecond;
        int currentMinute;
        int currentHour;
        
        do{
            long currentTime = System.currentTimeMillis();         //get current time

            currentTime = currentTime / 1000;
            currentSecond = (int) (currentTime % 60);            //get second
            currentTime = currentTime / 60;
            currentMinute = (int) (currentTime % 60);               //get minute
            currentTime = currentTime / 60;      
            currentHour = (int) (currentTime % 24);             //get hour
            
            if (goalMinute-currentMinute > 0)
            System.out.println("Alarm: "+ (goalHour-currentHour) +" : "+
            (goalMinute-currentMinute-1) +" : "+ (59-currentSecond));
            
            try {
                Thread.sleep(1000);                             //system pause a second
            }
            catch (InterruptedException e){
                e.toString();
            }  
        }while (goalHour*100+goalMinute > currentHour*100+currentMinute);
        
        NL.Label_Alarm.setText("Alarm: Time Out !"); //time out
    }
}