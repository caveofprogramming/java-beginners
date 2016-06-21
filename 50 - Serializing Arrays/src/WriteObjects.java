import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class WriteObjects {
 
    public static void main(String[] args) {
        System.out.println("Writing objects...");
         
        Person[] people = {new Person(1, "Sue"), new Person(99, "Mike"), new Person(7, "Bob")};
         
        ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));
 
        try (FileOutputStream fs = new FileOutputStream("test.ser"); ObjectOutputStream os = new ObjectOutputStream(fs)) {
 
            // Write entire array
            os.writeObject(people);
             
            // Write arraylist
            os.writeObject(peopleList);
             
            // Write objects one by one
            os.writeInt(peopleList.size());
             
            for(Person person: peopleList) {
                os.writeObject(person);
            }
             
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
    }
 
}