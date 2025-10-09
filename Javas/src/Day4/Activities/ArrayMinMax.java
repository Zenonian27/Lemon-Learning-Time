import java.util.Scanner;


public class ArrayMinMax {
public static void main(String[] args) {
    //MAIN METHOD

    ArrayMinMax Int = new ArrayMinMax();
    Int.Finder();
}







public void Finder(){
    int test = 5;
    int arraySize;
    Scanner get = new Scanner(System.in);

    System.out.print("Enter the number of elements in the array: "); arraySize = get.nextInt();
    System.out.println("");

    int[] intArray = new int[arraySize];

    //FOR GETTING THE ELEMENTS FROM USERS
    for(int nums = 0; nums < arraySize; nums++){
        System.out.print("Enter element " + (nums+1)+ ": " );
        intArray[nums] = get.nextInt();
    }


    //VARIABLES TO BE USED
    int maxInt = intArray[0];
    
    //MAX
    for(int i = 0; i < arraySize; i++){
        if (intArray[i] > maxInt) {
            maxInt = intArray[i];
        }
    }    
    System.out.println("");
    System.out.println("Maximum value in the array: " + maxInt);


    int minInt = intArray[0];
    //MIN
    for(int i = 0; i < arraySize; i++){
        if (intArray[i] < minInt) {
            minInt = intArray[i];
        }
    }
        
    System.out.println("Minimum  value in the array: " + minInt);
    }
    

//END OF CLASS
}
