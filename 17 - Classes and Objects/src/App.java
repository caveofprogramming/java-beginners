class Person {
     
    // Instance variables (data or "state")
    String name;
    int age;
    int date_of_birth;
     
    // Classes can contain
     
    // 1. Data
    // 2. Subroutines (methods)
}
 
 
public class App {
 
    public static void main(String[] args) {
         
         
        // Create a Person object using the Person class
        Person person1 = new Person();  
        person1.name = "Joe Bloggs";
        person1.age = 37;
        person1.date_of_birth = 10311984;
         
        // Create a second Person object
        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 20;
        person2.date_of_birth = 10312002;
         
        System.out.println(person1.name);
        System.out.println(person1.date_of_birth);
         
    }
 
}
