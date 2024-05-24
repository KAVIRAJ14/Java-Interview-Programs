import java.util.*;
import java.util.Scanner;
import java.util.stream.IntStream;

 public class  countVowvels
 {
 public void step1()
 {
 Scanner in=new Scanner(System.in);
 System.out.println("Enter the Name : ");
 String input=in.nextLine();
 input=input.toLowerCase();
 int vowvelsCount=0;
 for(int i=0;i<input.length();i++)
 {
if(input.charAt(i)=='a' ||input.charAt(i)=='e' ||input.charAt(i)=='i' ||input.charAt(i)=='o' ||input.charAt(i)=='u' )
{
  vowvelsCount++;
}
 }
System.out.println(vowvelsCount);

 }
    public static void main(String[] args) {
      countVowvels o=new countVowvels();
       o.step1();
        //o.step2();
    }
}    
   
   
