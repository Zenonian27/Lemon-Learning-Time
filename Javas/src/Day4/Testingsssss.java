package Day4;

public class Testingsssss {

    public static void switching(int num){ 
        //will be called by main method and
        //print the result of switch along with calling the outside
        //method runMe() from Main.java
        
        switch(num){
            case 1:
                System.out.println("One");
                break;
            
            case 2:
                System.out.println("Two");
                break;

        }
        Main.runMe();
        
    }
}
