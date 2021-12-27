//A program with cubic running time. Read in N integers and counts the number of triples that sum to exactly 0.
package coreJavaPrograms;
import java.util.Scanner;

public class SumOfThreeInteger {
    //main method
    public static void main(String[] args){
        /// declaration and input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int numberValues=sc.nextInt();
        int count=0;
        int[] array=new int[numberValues];
        System.out.println("Enter numbers: ");
        for(int i=0; i<numberValues;i++){
            array[i]=sc.nextInt();
        }
        //logic
        for(int i=0; i<numberValues-2;i++){
            for(int j=i+1; j<numberValues-1;j++){
                for(int k=j+1; k<numberValues;k++){
                    if(array[i]+array[j]+array[k]==0){
                        count++;
                        //output
                        System.out.println("Sum of "+array[i]+" "+array[j]+" "+array[k]+" is zero.");
                    }
                }
            }
        }
        System.out.println("Count is: "+count);
    }
}
