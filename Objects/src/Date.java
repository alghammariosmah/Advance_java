import java.util.Calendar;

/**
 * Created by Al-Ghammari on 10/31/2016.
 */
public class Date{
    private int year,month, day;
    public Date(){
        year = getYear();
        month = getMonth();
        day = getDay();
    }
    public Date(int d,int m,int y){
        setDay(d);
        setMonth(m);
        setYear(y);
    }

    public int getDay(){
        return day;
    }

    public void setDay(int d){
        if (d < 0 || d > 31) throw new IllegalArgumentException();
        day = d;
    }

    public int getMonth(){
        return month;
    }

    public void setMonth(int m){
        if (m <= 0 || m > 12) throw new  IllegalArgumentException();
        month = m;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int y){
        if (y < 0 ) throw new  IllegalArgumentException();
        year = y;
    }

    public void set(int y,int m,int d) {
        if (y <= 0 || m <= 0 || d <= 0){
            System.out.println("Don't enter negative integers");
            return;
        }
        year = y;
        if (m <=12 && d < 30){
            month = m;
            day = d;
        }else {
            if (m > 12 || d > 30){
                month = m % 12;
                year += m / 12;
                if (d < 30){
                    day = d;
                }
                if (d > 30){
                    day = d % 30;
                    month += d / 30;
                }

            }
        }
    }

    public void add(int d){
        if (d < 0){
            System.out.println("Please Enter a positive number");
            return;
        }
        day +=d;
        if (day > 30){
            if (month < 12){
                month += day / 30;
                day = day % 30;
            }else{
                month += day / 30;
                day = day % 30;
                year += month / 12;
                month = month % 12;
            }
        }
    }

    public void addMonth(int m){
        month += m;
        if ( month > 12){
            year += month /12;
            month = month % 12;
        }
    }

    public void addYear(int y){
        if (y < 0){
            System.out.println("Please Enter a positive number");
            return;
        }
        year += y;
    }


    public String toString(){ // this shall return it to string output.
        return day+"/"+month+"/"+year;
    }

}