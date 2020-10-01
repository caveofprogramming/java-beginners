public class Application {
    public static void main(String[] args) {
         
        int value = 0;
     
        while(value < 10)//this loop executed while the result is true
        {
            System.out.println("Hello " + value);
             
            value = value + 1;
        }
    }
}

/*Expected Output:

Hello 0
Hello 1
Hello 2
Hello 3
Hello 4
Hello 5
Hello 6
Hello 7
Hello 8
Hello 9

*/
