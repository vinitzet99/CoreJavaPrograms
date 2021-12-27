//Desc -> This program takes a command-line argument N and prints a table of the powers of 2 that are less than or equal to 2^N.
//import packages
package coreJavaPrograms;
import java.util.Scanner;

public class PowerOfTwo {
    //main method
    public static void main(String[] args){
        //variable declaration and input
        int power = Integer.parseInt(args[0]);

        //logic and output
        if(power>=0 && power<31){
            for(int countPower=0;countPower<=power;countPower++){
                System.out.println("2 power "+countPower+" is: "+(int)Math.pow(2,countPower));
            }
        }
        //invalid case
        else{
            System.out.println("Not Valid.");
        }
    }
}
