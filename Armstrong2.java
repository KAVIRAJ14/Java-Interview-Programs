import java.util.*;
import java.lang.Math.*;
public class Armstrong2 {
    public static void main(String[] args) {
        int number; 
        System.out.println("Enter a number: ");
        Scanner obj=new Scanner(System.in);
        number=obj.nextInt();
        int originalNumber, remainder, result = 0;
        originalNumber = number;
        int digits=0;
        while(originalNumber>0)
        {
              originalNumber=originalNumber/10;
              digits++;
        }
        while (originalNumber != 0) {
            remainder = originalNumber % 10; //1 7
            result += Math.pow(remainder, digits); // Cubing each digit     Math.pow(value, nosqrt)  1 +343+ 9 =353
            originalNumber /= 10;   //37 3
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
