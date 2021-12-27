//Percentage of Head vs Tails
//import packages
package coreJavaPrograms;
import java.util.Scanner;
import java.util.Random;

public class percentageHeadsTails {
    //main method
    public static void main(String[] args){
        //variable declaration
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int countTails=0;
        int countHeads=0;
        int timesFlip;
        float timesFlipF,headPercentage,tailPercentage;
        //input
        System.out.println("Enter no of time coins to be flipped:");
        timesFlip=sc.nextInt();
        timesFlipF=timesFlip;
        //logic
        if(timesFlip>0){
            for(int countFlip=1;countFlip<=timesFlip;countFlip++) {
                float flip=random.nextFloat();
                if(flip<0.5){
                    countTails++;
                }
                else countHeads++;
            }
            //find percentage
            headPercentage=(countHeads/timesFlipF)*100;
            tailPercentage=(countTails/timesFlipF)*100;
            //output
            System.out.println("Heads Percentage is: "+headPercentage+"\nTails Percentage is: "+tailPercentage);
        }
        //invalid case
        else System.out.println("Flip times is not valid or 0.");
    }
}
