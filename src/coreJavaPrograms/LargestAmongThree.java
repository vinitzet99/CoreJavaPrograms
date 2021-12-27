//Java Program to Find the Largest Among Three Numbers
//import packages
package coreJavaPrograms;
import java.util.Scanner;

public class LargestAmongThree{
    //main method
    public static void main(String[] args){
        //variable declaration
        Scanner sc=new Scanner(System.in);
        int number1,number2,number3;
        //input
        System.out.println("Enter number 1: ");
        number1=sc.nextInt();
        System.out.println("Enter number 2: ");
        number2=sc.nextInt();
        System.out.println("Enter number 3: ");
        number3=sc.nextInt();
        //logic and output
        if(number1 >= number2) {
            if(number1 >= number3)
                System.out.println(number1 + " is the Largest.");
            else
                System.out.println(number3 + " is the Largest.");
        } else {
            if(number2 >= number3)
                System.out.println(number2 + " is the Largest.");
            else
                System.out.println(number3 + " is the Largest.");
        }
    }
}
