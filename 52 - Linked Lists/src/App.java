import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
 
 
public class App {
 
 
    public static void main(String[] args) {
        /*
         * ArrayLists manage arrays internally.
         * [0][1][2][3][4][5] ....
         */
        List<Integer> arrayList = new ArrayList<Integer>();
         
        /*
         * LinkedLists consists of elements where each element
         * has a reference to the previous and next element
         * [0]->[1]->[2] ....
         *    <-   <-
         */
        List<Integer> linkedList = new LinkedList<Integer>();
         
        doTimings("ArrayList", arrayList);
        doTimings("LinkedList" , linkedList);
    }
     
    private static void doTimings(String type, List<Integer> list) {
         
        for(int i=0; i<1E5; i++) {
            list.add(i);
        }
         
        long start = System.currentTimeMillis();
         
        /*
        // Add items at end of list
        for(int i=0; i<1E5; i++) {
            list.add(i);
        }
        */
         
        // Add items elsewhere in list
        for(int i=0; i<1E5; i++) {
            list.add(0, i);
        }
         
        long end = System.currentTimeMillis();
         
        System.out.println("Time taken: " + (end - start) + " ms for " + type);
    }
     
 
 
}