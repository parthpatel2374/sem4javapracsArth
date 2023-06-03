import java.lang.Math;
import java.lang.String;
import java.util.ArrayList;
import java.util.Iterator;


class loan{

    private double amount;

    loan(double amount){
        this.amount = amount;
    }
    public void  getAmount(){
        System.out.println("Amount of "+this.getClass().getName()+" is : "+this.amount);
    }
}

class date{

    private double year, month, days;

    date(double year, double month, double days){
        this.year = year;
        this.month = month;
        this.days = days;
    }
    public void  getDate(){
        System.out.println("The date is[yyyy-mm-dd] : "+this.year+"-"+this.month+"-"+this.days);
    }
}

class string{
    private String string;

    string(String string){
        this.string = string;
    }
    public void getString(){
        System.out.println("The string is : "+string);
    }
}

class circle extends Object{
    
    private double radius;
    
    circle(int radius){
        this.radius = radius;
    }
    public void  getRadius(){
        System.out.println("Radius of "+this.getClass().getName()+" is : "+this.radius);
    }
    public void area(){
        System.out.println("The radius of the circle is: "+(3.14*Math.pow(radius, 2)));
    }
    
}




class seven1 {

    public static void main(String[] args){

        loan ln1 = new loan(100);
        loan ln2 = new loan(200);
        loan ln3 = new loan(300);

        date dat1 = new date(2004, 7, 23);
        date dat2 = new date(2004, 8, 20);
        date dat3 = new date(2004, 9, 20);

        string str1 = new string("John");
        string str2 = new string("Malik");
        string str3 = new string("Farrah");

        circle cir1 = new circle(10);
        circle cir2 = new circle(20);
        circle cir3 = new circle(30);

        ArrayList<Object> list = new ArrayList<>();

        list.add(ln1);
        list.add(ln2);
        list.add(ln3);
        list.add(dat1);
        list.add(dat2);
        list.add(dat3);
        list.add(str1);
        list.add(str2);
        list.add(str3);
        list.add(cir1);
        list.add(cir2);
        list.add(cir3);

        for(Iterator<Object> i = list.iterator(); i.hasNext();){
            System.out.println(i.next()+" ");
        }       
    }
}