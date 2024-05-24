import java.util.*;
import java.util.Scanner;

 public class reversedSentence
 {
   
    public void step1()
    {
String given="I Love Football";
String reversed=" ";
String[] temp=given.split(" ");
System.out.println(temp.length);
System.out.println(temp[0]);
System.out.println(temp[1]);
System.out.println(temp[2]);

for(int i=temp.length-1;i>=0;i--)
{
  reversed=reversed+temp[i]+" ";
}
System.out.println(reversed);
    }
    public static void main(String[] args) {
      reversedSentence o=new reversedSentence();
        o.step1();
        
    }
} 