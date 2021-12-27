//Java Program to Check Whether an Alphabet is Vowel or Consonant
//import packages
package coreJavaPrograms;
import java.util.Scanner;

public class IsVowel {
    //main method
    public static void main(String[] args){
        //variable declaration
        Scanner sc=new Scanner(System.in);
        char character;
        //input
        System.out.println("Enter a character: ");
        character=sc.next().charAt(0);
        //logic and output
        if(Character.toUpperCase(character)=='A' || Character.toUpperCase(character)=='E' || Character.toUpperCase(character)=='I' || Character.toUpperCase(character)=='O' || Character.toUpperCase(character)=='U'){
            System.out.println(character+" is a Vowel.");
        }
        else {
            System.out.println(character+" is Consonant.");
        }
    }
}
