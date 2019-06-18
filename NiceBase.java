//NiceBase.java
//////////////Written by lofone at 2019/6/3/////////////////


import java.util.Calendar;

public class NiceBase{
    //private String day[];
    private int year;
    private int month;
    
    NiceBase(){
        year = 2019;
        month = 6;
    }
    
    NiceBase(int year, int month){
        setYear(year);
        setMonth(month);
    }
     
    public void setYear(int year){           //set year  
        if(year < 2119 && year > 1919)                     
        this.year = year;                                             
    }           
                                                        
    public int getYear(){                     //return year               
        return year;                                                
    }                   
    
    public void setMonth(int month){           //set month         
        if(month < 0)            
        this.month = month + 12;
        else if(month > 12)     
        this.month = month -12;  
        else
        this.month = month;                                    
    }                                                               
    public int getMonth(){                    //return month                      
        return month;
    }                                                               

    public String[] getCalendar(){              //draw calendar                    
        String a[] = new String[42];
        Calendar C = Calendar.getInstance();
        C.set(year, month - 1, 1);                //the month is 0 based
        int D = C.get(Calendar.DAY_OF_WEEK)-1;
        
        int day = 0;
        if(month == 1||month == 3||month == 5||month == 7||month == 8||month == 10||month == 12)
            day = 31; //1 3 5 7 8 10 12 they have 31 days a month
            
        else if(month == 4||month == 6||month == 9||month == 11)
            day = 30; //4 6 9 11 they have 30 days a month
            
        else if(month == 2){
            if(((year % 4 == 0)&&(year % 100!= 0))||(year % 400 == 0))
                day = 29; //sometimes 29  otherwise 28
            else
                day = 28;  
        }
       
        for(int i = D, n = 1; i < D + day; i++){
            a[i] = String.valueOf(n);
            n++;
        }
        
        return a;
    }
}