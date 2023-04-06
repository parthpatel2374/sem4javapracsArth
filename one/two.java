import java.text.DecimalFormat;

class two{    
    public static void main(String arg[]) {
        double a=3.4, b=50.2, e=44.5, c=2.1, d=0.55, f=5.9;
        
        double x=(e*d - b*f)/(a*d - b*c), y=(a*f - e*c)/(a*d - b*c);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(x)+" "+df.format(y));
        System.out.println(df.format(x+y));

    }
}
/*  taken reference about making #.## decimal as output from link
    https://stackoverflow.com/questions/2538787/how-to-print-a-float-with-2-decimal-places-in-java
 */