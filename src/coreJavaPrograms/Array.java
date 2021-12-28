//Print function to print 2 Dimensional Array with OutputStreamWriter  the output to the screen.
package coreJavaPrograms;
import java.io.PrintWriter;
import java.util.Scanner;

public class Array {
    //main method
    public static void main(String[] args) {
        //variable declaration and initialization
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows of array.");
        int rows=sc.nextInt();
        System.out.println("Enter the no of columns of array.");
        int column=sc.nextInt();
        int[][] arr = new int[rows][column];
        System.out.println("Enter the array elements.");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<column;j++)
                arr[i][j]=sc.nextInt();
        }
        //printing output
        PrintWriter writer = new PrintWriter(System.out);
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<column;j++)
                writer.write(arr[i][j]+" ");
            writer.write("\n");

        }
        writer.flush();
    }
}