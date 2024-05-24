import java.util.*;
import java.util.Scanner;

 public class reverseNumber
 {
 public void step(){

 int reversedNumber=0;
 System.out.print("Enter te number :");
 Scanner in=new Scanner(System.in);
 int number=in.nextInt();
 while(number!=0)
 {
reversedNumber=reversedNumber*10;
reversedNumber=reversedNumber+number%10;
number=number/10;

 }
System.out.println(reversedNumber);
 }
    public static void main(String[] args) {
      reverseNumber o=new reverseNumber();
        o.step();
       
    }
} 