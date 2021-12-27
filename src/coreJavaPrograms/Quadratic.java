//find the roots of the equation a*x*x + b*x + c.
package coreJavaPrograms;
import java.util.Scanner;

public class Quadratic {
    //main method
    public static void main(String[] args){
        //declaration
        Scanner sc=new Scanner(System.in);
        float a,b,c,delta;
        //input
        System.out.println("Enter a,b and c for a*x*x + b*x + c");
        System.out.println("Enter a: ");
        a=sc.nextFloat();
        System.out.println("Enter b: ");
        b=sc.nextFloat();
        System.out.println("Enter c: ");
        c=sc.nextFloat();
        //logic and output
        delta=b*b - 4*a*c;
        System.out.println("Roots of the equation are:\nR1: "+((-b+Math.sqrt(delta))/(2*a))+"\nR2: "+((-b-Math.sqrt(delta))/(2*a)));
    }
}
