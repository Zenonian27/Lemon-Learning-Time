package Day4;

public class Main {
    public static void main(String[] args) {

        //declares x first to be used below
        int x = 2;

        //then calls on Testing.Java on the same package
        //and calls on the switching method to do some work
        Testingsssss.switching(x);
    }


public static void runMe(){//will be called by the method switching to print
    String MyName = new Object(){}.getClass().getEnclosingClass().getSimpleName();
    //new object creates a object which we pass the value to MyName
    //getClass basically ask to get a class object to pass to this object
    //getEnclosingClass asks what am I inside of?
    //getSimplerName asks to get the Simpler name of the class it is inside of
    //in this case the name Main instead of Day4.Main.Java
    System.out.println("I was called From " + MyName);

}

}
