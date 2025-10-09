import java.util.Scanner;

/**
 *
 * @author JohnZenon
 */
public class Activities {

public static void main(String[] args) {
    //RUN CODES HERE
    //MAIN METHOD
    Activities app = new Activities();
    app.taxWithSomeErrorHandling();
}


public void calculate(){
        Scanner in = new Scanner(System.in);
        double salary,annualIncome,deduction,net;

        System.out.print("Enter salary : Php "); salary = in.nextDouble(); annualIncome = salary * 12; //scanner and initialization for annualIncome variable.
        in.close(); //according to java docs this is needed to properly close the scanner after done using
        System.out.printf("Your Annual Income: Php %,.2f%n", annualIncome);  
        

        if(annualIncome <= 250000){//no tax because of exemption
            deduction = 0; 
        }
        else if (annualIncome > 250000 && annualIncome <= 400000) {//should check for annual if in range for this then use the appropriate tax rate
            deduction = (annualIncome) * 0.15;
        }
        else if ( annualIncome > 400000 && annualIncome <= 800000) {
            deduction = 22500 + (annualIncome) * 0.20;
        }
        else if (annualIncome > 800000 && annualIncome <= 2000000) {
            deduction = 102500 + (annualIncome) * 0.25;
        }
        else if (annualIncome > 2000000 && annualIncome <= 8000000) {
            deduction = 402500 + (annualIncome) * 0.30;
        }
        else{
            deduction = 2202500 + (annualIncome) * 0.35;
        }

        //initializaton for net worth along with its computation
        net = annualIncome - deduction; 

        System.out.printf("Deduction: Php %,.2f%n", deduction);
        System.out.printf("Net Worth: Php %,.2f%n" , net);
        System.out.println(" ");
    }


public void taxWithSomeErrorHandling(){//trying try catch and experimenting with it
    boolean keepgoing; //initialization of boolean to be used for while loop
    keepgoing = true;//for the while loop to start up and initial value of boolean

    while(keepgoing != false){
        /* */
        try {
            Activities tax = new Activities();//creation of the object and naming it tax
            tax.calculate();//trying to calculate tax if all is good.
            keepgoing = false;//backup if the loop is still going where it should've ended 
        }       
        
        catch (Exception InputMismatchException) {
            keepgoing = true;//should keep the loop going until a correct input is typed
            System.out.println("Wrong Input, Please Try Again");//some message explaining what happened
            System.out.println(" ");//extra space for the next start of the loop
        }
    }
}

    //END OF CLASS
}


    

