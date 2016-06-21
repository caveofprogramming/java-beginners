public class App {
 
    public static void main(String[] args) {
         
        // Null pointer exception ....
        String text = null;
         
        System.out.println(text.length());
         
        // Arithmetic exception ... (divide by zero)
        int value = 7/0;
 
        // You can actually handle RuntimeExceptions if you want to;
        // for example, here we handle an ArrayIndexOutOfBoundsException
        String[] texts = { "one", "two", "three" };
 
        try {
            System.out.println(texts[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }
}