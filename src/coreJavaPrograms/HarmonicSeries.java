//Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
//import packages
package coreJavaPrograms;
import java.util.Scanner;

public class HarmonicSeries {
    //main method
    public static void main(String[] args) {
        //variable declaration
        Scanner sc = new Scanner(System.in);
        int value;
        float harmonic=0;
        //input
        System.out.println("Enter value: ");
        value = sc.nextInt();
        //logic
        if(value!=0){
            for(float i=1;i<=value;i++){
                   harmonic=harmonic+1/i;
            }
            //output
            System.out.println("Harmonic value is: "+harmonic);
        }
        else{
            //invalid case
            System.out.println("0 is not valid.");
        }
    }
}
