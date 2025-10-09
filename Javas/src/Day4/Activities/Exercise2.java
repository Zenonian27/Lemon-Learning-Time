






/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thexe
 */
public class Exercise2 {
    static int startNumber = 1;
    static int iteration = 4;
    static int commonDifference= 5;

    static int sumofAll, product; // to initialized to be used later for the total
    static int series;

    public static void main(String[] args) {
        //MAIN METHOD
        Exercise2 cal = new Exercise2();
        cal.computeLoopAddition();
        cal.computeLoopMultiplication();
    }
    
static void computeLoopAddition(){
        System.out.println(" ");
        System.out.println("Initial Number: " + startNumber);
        System.out.println("No. Of Initialization: " + iteration);
        System.out.println("Common Difference: " + commonDifference);
        System.out.println(" ");



        //to display the sum once
            System.out.print("Sum: ");

            //shall loop until the iteration is reached, 
                for(int i = 0; i < iteration; i++){
                    series =  startNumber +  (i * commonDifference);
                    sumofAll = sumofAll + series;                        


                    System.out.print(series); //displays the value of startNum before the changes below, then with "+"
                    if (i < iteration-1) {//for adding  plus sign while printing and offset by -1
                        System.out.print("+");
                    }
    }
        System.out.println(" Total: " + sumofAll); //will display the total at the end of it 



}
    
static void computeLoopMultiplication(){
    System.out.print("Product: ");

    //for use in calculation
    product = 1;
    //place holder as you can't multiply by 0 

    //main for loop
    for(int i = 0; i< iteration; i++){
        //adds value to series while by multiplying the initial value by common then add the result with starting then to series
        series = startNumber + (i * commonDifference);

        //use product * series so i'll store then 
        //this is why product is 1 at first
        product = product * series;

        System.out.print(series);
        if (i < iteration-1 ){//add * sign but needs to offset by -1
            System.out.print("*");
        }
    }
    System.out.println(" Total: " + product);
}


//end of class


}
