//temperature t (in Fahrenheit) and the wind speed v (in miles per hour), find the effective temperature (the wind chill)
package coreJavaPrograms;

public class WindChill {
    //main method
    public static void main(String[] args){
        //variable declaration and input
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        //logic and output
        System.out.println("Effective Temperature (the Wind Chill): "+(35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16)));
    }
}
