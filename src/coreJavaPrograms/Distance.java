//prints the Euclidean distance from the point (x, y) to the origin (0, 0).
package coreJavaPrograms;
import java.util.Scanner;

public class Distance {
    //main method
    public static void main(String[] args){
        //variable declaration and input
        float x1= Float.parseFloat(args[0]);
        float y1= Float.parseFloat(args[1]);
        //logic and output
        System.out.println("Euclidean Distance for ("+x1+","+y1+") is: "+Math.sqrt(Math.pow(x1,2)+Math.pow(y1,2)));
    }
}
