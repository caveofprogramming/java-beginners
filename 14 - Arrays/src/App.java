public class App {
    public static void main(String[] args) {
        int[] values;
        values = new int[3];
   // array  values contains 10,20,30
       
        values[0] = 10;
        values[1] = 20;
        values[2] = 30;
        // print the values of the array values 
        System.out.println("values present in array values are as follow:");
        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);
         
         System.out.println("values present in array values using for loop are as follow:");
        for(int i=0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        
        int[] numbers = {5, 6, 7};
          System.out.println("values present in array numbers are as follow:");
        for(int i=0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
     
}
