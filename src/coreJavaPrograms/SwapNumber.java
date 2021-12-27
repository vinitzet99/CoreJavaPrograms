//Java Program to Swap Two Numbers
//import packages
package coreJavaPrograms;
import java.util.Scanner;

public class SwapNumber {
    //main method
    public static void main(String[] args){
        //variable declaration
        Scanner sc=new Scanner(System.in);
        int number1,number2,temp;
        //input
        System.out.println("Enter Number 1: ");
        number1=sc.nextInt();
        System.out.println("Enter Number 2: ");
        number2=sc.nextInt();
        //logic
        temp=number1;
        number1=number2;
        number2=temp;
        //output
        System.out.println("Number 1 is: "+number1+"\nNumber 2 is: "+number2);
    }
}
