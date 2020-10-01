/*Points to remember => 
1). 1 bit can store 0 or 1.
2). 8 bit = 1 byte*/
public class Application {
 
    public static void main(String[] args) {
        int myNumber = 88;// int always return the floor value(value before decimal point).
        short myShort = 847;//short can store 2 bytes value.
        long myLong = 9797;//long can store 8 byte value
     
        double myDouble = 7.3243;//double can store 8 byte decimal values.
        float myFloat = 324.3f;//float can store 4 byte decimal values.
         
        char myChar = 'y';//char can store 2 bytes value
        boolean myBoolean = false;//boolean store 1 bytes
         
        byte myByte = 127;//byte store 1 byte
         
         
        System.out.println(myNumber);
        System.out.println(myShort);
        System.out.println(myLong);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myChar);
        System.out.println(myBoolean);
        System.out.println(myByte);
    }
 
}
/*Expected output:
88
847
9797
7.3243
324.3
y
false
127
*/
