//Print the prime factors of number N.
package coreJavaPrograms;
import java.util.Scanner;

public class PrimeFactors {
    //main method
    public static void main(String[] ar) {
        //variable declaration
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        //logic and output
        for(int i=2;i*i<n;i++)
        {
            while(n%i==0)
            {
                System.out.println(i);
                n=n/i;
            }
        }
        if(n>2)
            System.out.println(n);
    }
}