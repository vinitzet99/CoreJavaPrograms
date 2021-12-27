//Java Program to Check Whether a Number is Even or Odd
//import packages
package coreJavaPrograms;
import java.util.Scanner;

public class EvenOdd {
    //main method
    public static void main(String[] args){
        //variable declaration
        Scanner sc=new Scanner(System.in);
        int n1;
        //input
        System.out.println("Enter no to check even odd: ");
        n1=sc.nextInt();
        //logic and output
        if(n1%2==0){
            System.out.println(n1+" is Even.");
        }
        else{
            System.out.println(n1+" is Odd.");
        }
    }
}
