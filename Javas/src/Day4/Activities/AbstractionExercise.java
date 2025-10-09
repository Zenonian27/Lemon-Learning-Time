import java.util.Scanner;

/**
 *
 * @author Thexe
 */
public class AbstractionExercise {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            Person a = new Athlete();
            Person l = new LazyPerson();

            System.out.println("\nAre you a Lazy or an Athletic Person?\n"+
            "[1] Lazy\n" +
            "[2] Athlete\n"
            );
            System.out.println("Enter your Choice: ");
            int choice = scan.nextInt();
            
            switch (choice) {
                case 1:
                    l.eat();
                    l.exercise();
                    break;

                case 2:
                    a.eat();
                    a.exercise();    
                    break;    

                default:
                    System.out.println("Please try again");
                    throw new AssertionError();
            }





        }

    }

    abstract class Person {
        String name, exercise;
        int age;
    
        abstract void eat();
        abstract void exercise();
    }
    
    class Athlete extends Person {
        Scanner scanner = new Scanner(System.in);
        @Override
         void eat() {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
    
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
            scanner.nextLine();
    
            System.out.println("You are an athlete, following the diet plan.");
            System.out.println();
        }
    
        @Override
        void exercise() {
    
            System.out.print("Enter exercise(Running, powerlifting): ");
            exercise = scanner.nextLine();
            System.out.println();
    
            System.out.println("---------------ATHLETE PERSON----------------------");
            System.out.println("Person Details: ");
            System.out.println("Athlete");
            System.out.printf("Name: %s\nAge: %d\n", name, age);
            System.out.printf("Exercise: %s\n", exercise);
            System.out.println("---------------------------------------------------");
            System.out.println();
        }
    }
    
    class LazyPerson extends Person {
        Scanner scanner = new Scanner(System.in);
        @Override
        void eat() {
    
            System.out.println("------------------LAZY PERSON----------------------");
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
    
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
    
            System.out.printf("Name: %s\nAge: %d\n", name, age);
            System.out.println("You are a lazy person, eating anything you want.");
            System.out.println();
        }
    
        @Override
        void exercise() {
            System.out.println("------------------LAZY PERSON----------------------");
            System.out.println("Person Details: ");
            System.out.println("Lazy Person");
            System.out.printf("Name: %s\nAge: %d\n", name, age);
            System.out.println("Exercise: Doesn't exercise 🙁");
            System.out.println("---------------------------------------------------");
            scanner.close();
        }
}
