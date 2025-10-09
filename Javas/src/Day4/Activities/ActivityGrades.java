import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 *
 * @author Thexe
 */


public class ActivityGrades {
    static int grades;
    static String gradeValue;   //Variable decleration to be used by methods below.
    static boolean keepgoing;
    
    public static void main(String[] args) {
        //MAIN METHOD
        ActivityGrades app = new ActivityGrades();
        app.runAll();
    }

    
    


public void userInput(){
    Scanner get = new Scanner(System.in);
    System.out.print("Please Input Your Grades: "); grades = get.nextInt();
}

public void calculateGrades(){

    if(grades >= 90 && grades <= 100){
        gradeValue = "A";    
        System.out.println("Congratulations, your grades is " + gradeValue);
    } 
    else if(grades >= 80 && grades <= 89){
        gradeValue = "B";
        System.out.println("Congratulations, your grades is " + gradeValue);

        }
    else if(grades >= 70 && grades <= 79){
        gradeValue = "C";
        System.out.println("Congratulations, your grades is " + gradeValue);
        }
    else if(grades >= 60 && grades <= 69){
        gradeValue = "D";
        System.out.println("Congratulations, your grades is " + gradeValue);
        }
    else if (grades < 60){
        gradeValue = "F";
        System.out.println("Sorry but you have to repeat this class :( Your Grade: " + gradeValue);                  
        }
}

public void withErrorHandling(){//runs userInput(), and then the calculate grades, 
    ActivityGrades wew = new ActivityGrades();
    keepgoing = true;
    
    while(keepgoing != false){

        try {
            wew.userInput();//gets user inputs
            wew.calculateGrades();//calculates the grade based from the user input
            keepgoing = false; //to kill loop 
        }

        catch (InputMismatchException e) {//handles all of the error and displays a message. will loop back to start until user give an valid input. 
            System.out.println("Wrong Input, Please Try again.");
            System.out.println(" ");

        } 
    }
}

public void runAll(){
    ActivityGrades apps = new ActivityGrades();
    apps.withErrorHandling();
}                



//End of class
}

