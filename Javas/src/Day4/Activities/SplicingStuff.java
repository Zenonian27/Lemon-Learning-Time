
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thexe
 */


public class SplicingStuff {
static String thisString = "Hello.";

public static void main(String[] args) {
    SplicingStuff txt = new SplicingStuff();
    txt.printResult();
    

    //Main Method here
}

public static void printResult(){
    thisString = thisString.trim();
    //process to convert it to reverse
    char[] reverseMe = thisString.toCharArray();
    //converts char array to string with string builder
    String plsReverse = new StringBuilder(new String(reverseMe)).reverse().toString();

    int count= 0;
    int count1=1;
    int size = reverseMe.length;
    int howMany = 0;
    int[] times = new int[size];
    String[] countMe = new String[size];
    countMe = thisString.split("(?<=.)");


        for(int i = 0; i < reverseMe.length; ++i){
                if(i + 1 < reverseMe.length && reverseMe[i] == reverseMe[i + 1]){                    
                    times[i] += 1;
                    count++;
                } else {
                    ++howMany;
                }
                       
        }


    System.out.print( "\n[Index] Where a String is repeated:" + Arrays.toString(times));   
    System.out.println( "\n        Original String: " + thisString);
    System.out.println( "        Converted String: " + plsReverse.trim());    


}



}
