/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Thexe
 */
public class University {

    
public static void main(String[] args) {
    //CREATING OBJ
    Person person = new Person("Emman", 24);
    person.showPerson();


    Student student = new Student("Shiori", 29, "GameDev");
    student.showStudent();

    GraduateStudent graduate = new GraduateStudent("Abueva", 25, "BSIT", "The Subtle Application of Electricity for Industrial Farming w/ IOT Devices");
    graduate.showGraduateStudent();

}





//BASE Class
static class Person{
    String name;
    int age;

    Person(String n, int a){
        this.name = n;
        this.age = a;
    }

    void showPerson(){
            System.out.println("\n\nName: " + name);
            System.out.println("Age: " + age);
    }
}
    
//FOR STUDENT
static class Student extends Person{
String major;

    Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    void showStudent(){
        showPerson();
        System.out.println("Major: " + major);
    }
}
//GRADUATE
static class GraduateStudent extends Student{
String thesisTitle;

    GraduateStudent(String name, int age, String major, String thesisTitle){
        super(name, age, major);
        this.thesisTitle = thesisTitle;
    }


    void showGraduateStudent(){
        showPerson();
        System.out.println("Thesis Title: " + thesisTitle);

    }

}




}



