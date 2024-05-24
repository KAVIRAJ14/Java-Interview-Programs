import java.util.*;
import java.util.Scanner;
import java.util.stream.IntStream;

 public class  ExtractNumberFronStringAndAdd
 {
 public void step1()
 {
 Scanner in=new Scanner(System.in);
 System.out.println("Enter the Name : ");
 String input=in.nextLine();
int total=0;
for(int i=0;i<input.length();i++)
{
  char character=input.charAt(i);
  if(Character.isDigit(character))
  {
    total=total+Character.getNumericValue(character);
  }
}
System.out.println(total);
 }
    public static void main(String[] args) {
      ExtractNumberFronStringAndAdd o=new ExtractNumberFronStringAndAdd();
       o.step1();
        //o.step2();
    }
}    
   
   
