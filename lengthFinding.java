import java.util.*;
import java.util.Scanner;

 public class lengthFinding
 {
    public void step1()
    {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the name : ");
      String given=in.nextLine();
System.out.println("first step :"+given.length());
//
char [] charArray=given.toCharArray();
int length=0;
for(char c:charArray)
{
   length++;
}
System.out.println("Second step :"+length);
    }
// System.out.println("");

    public static void main(String[] args) {
      lengthFinding o=new lengthFinding();
        o.step1();
         
    }
} 