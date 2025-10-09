/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Day4.Day8;

/**
 *
 * @author Thexe
 */
public class MainDay8 {
    //static is love, static is life
    static int num1, num2, sum, difference, product;
    static double qoutient;  
    static boolean isJavaFun,bothEven, eitherGreaterThan10, javaIsFun;
    static String str1; 

    public static void main(String[] args) {
    //TO RUN ALL OF THE COMMANDS
    partOneString();
    ArithmeticOperations();
    partTwoString();
    //END OF MAIN METHOD
    }

    static void partTwoString(){

    System.out.println("Both num1 and num2 are even?: " + bothEven);
    System.out.println("Either num1 or num2 is greater than 10?: " + eitherGreaterThan10);
    System.out.println("Java is fun?: " + javaIsFun);
    //Str Concatenation
    System.out.println("strResult: " + str1 + " is Amazing!");
    }
    
    static void ArithmeticOperations(){
    //Logical Operator & String Concatanation
    //for checking if java is fun
    isJavaFun = true;
    javaIsFun = false;
    //for greater than 10
    int ten = 10;
         
     //FOR BOTH EVEN
    bothEven = (num1 % 2 == 0 && num2 % 2 == 0)? bothEven = true : false;

    //For Greater than 10 
    eitherGreaterThan10 = (num1 >= ten || num2 >= ten)?  eitherGreaterThan10 = true  : false ; 
    
     //For java is fun 
    javaIsFun = (isJavaFun == true)? isJavaFun : false;
     
    //Arithmetic Operations
    sum = num1 + num2; 
    difference = num1 - num2;
    product = num1 * num2;
    qoutient = (double)num1/num2;
    System.out.println("Sum: " + sum);
    System.out.println("Difference: " + difference);
    System.out.println("Product: " + product);
    System.out.println("Quotient: " + qoutient);

    }

    static void partOneString(){

    //Declaration of Variables
    num1 = 2;
    num2 = 4; 
    isJavaFun = true;
    str1 = "Java Rice";

    System.out.println("num1: "+num1);
    System.out.println("num2: "+num2);
    System.out.println("isJavaFun: "+ isJavaFun);
    System.out.println("str1: "+str1);
    System.out.println("======================================");
    System.out.println(" ");

    }


//END OF CLASS
    }


class IwantWhatHeHas extends MainDay8 {
    static MainDay8 m = new MainDay8();
    static IwantWhatHeHas dog = new IwantWhatHeHas();



    public static void main(String[] args) {
        String calling = "woof";
        callme();
        dog.MakeSound(calling);
    }    


        
static void callme(){
    System.out.println("I was called from my class I want what he has "+m.num1);
}

 void MakeSound(String Sound){
System.out.println(Sound + " " + Sound);

}
}