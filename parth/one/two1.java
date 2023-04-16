import java.text.DecimalFormat;

class two1{    
    public static void main(String arg[]) {
        double a=3.4, b=50.2, e=44.5, c=2.1, d=0.55, f=5.9;
        
        double x=(e*d - b*f)/(a*d - b*c), y=(a*f - e*c)/(a*d - b*c);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("The equations are: (i)3.4x+50.2y=44.5 & (ii)2.1x+.55y=5.9");
        System.out.println("Root1 = "+df.format(x)+" Root2 = "+df.format(y));

    }
}
/*  taken reference about making #.## decimal as output from link
    https://stackoverflow.com/questions/2538787/how-to-print-a-float-with-2-decimal-places-in-java
 */