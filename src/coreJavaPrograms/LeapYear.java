// Print the year is a Leap Year or not.
//import packages
package coreJavaPrograms;
import java.util.Scanner;

public class LeapYear {
    //main method
    public static void main(String[] args){
        //variable declaration
        Scanner sc=new Scanner(System.in);
        int year;
        //input
        System.out.println("Enter Year: ");
        year=sc.nextInt();
        String yearString=Integer.toString(year);
        //check if 4 digit
        if (yearString.length()==4){
            //logic and output
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0)
                        System.out.println(year+" is a leap year ");
                    else System.out.println(year+" is not a leap year ");
                }
                else System.out.println(year+" is a leap year ");
            }
            else System.out.println(year+" is not a leap year ");

        }
        else{
            System.out.println(year+" is not a four digit year");
        }
    }
}
