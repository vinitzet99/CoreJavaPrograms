//Java Program to Compute Quotient and Remainder
//import packages
package coreJavaPrograms;
import java.util.Scanner;

public class QuotientRemainder {
    //main method
    public static void main(String[] args){
        //variable declaration
        Scanner sc=new Scanner(System.in);
        int number,divisor;
        //input
        System.out.println("Enter Dividend: ");
        number=sc.nextInt();
        System.out.println("Enter Divisor: ");
        divisor=sc.nextInt();
        //logic and output
        System.out.println("Quotient is: "+number/divisor+"\nRemainder is: "+number%divisor);
    }
}
