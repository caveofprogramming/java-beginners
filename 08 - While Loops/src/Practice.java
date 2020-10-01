//Practice program in which we take int from the user and find the sum of all digits in integer 

import java.util.*;

class Practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int lastDigit;
        while(temp > 0){
            lastDigit = temp % 10;//when we mod the number by 10 it gives us the lastdigit of the number
            sum += lastDigit;//here we sum the lastDigit
            temp = temp / 10;//here we remove the last digit
        }
        System.out.print("Sum of all digits: "+sum);
    }
  
}
