import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class ReadObjects {
 
    public static void main(String[] args) {
        System.out.println("Reading objects...");
         
        try (FileInputStream fi = new FileInputStream("test.ser"); ObjectInputStream os = new ObjectInputStream(fi)) {
 
            // Read entire array
            Person[] people = (Person[])os.readObject();
             
            // Read entire arraylist
            @SuppressWarnings("unchecked")
            ArrayList<Person> peopleList = (ArrayList<Person>)os.readObject();
             
            for(Person person: people) {
                System.out.println(person);
            }
             
            for(Person person: peopleList) {
                System.out.println(person);
            }
             
            // Read objects one by one.
            int num = os.readInt();
             
            for(int i=0; i<num; i++) {
                Person person = (Person)os.readObject();
                System.out.println(person);
            }
             
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
    }
 
}