import java.util.*;
import java.util.Scanner;
import java.util.stream.IntStream;

 public class  FindTheMissingAlphabets
 {
 public void step1()
 {
 Scanner in=new Scanner(System.in);
 System.out.println("Enter the Name : ");
 String input=in.nextLine();
 input=input.toLowerCase();
 input=input.replaceAll(" ","");
 String [] charArray=input.split("");
String [] Alpabets="abcdefghijklmnopqrstuvwxyz".split("");
HashSet<String> set1=new HashSet<String>(Arrays.asList(charArray));
HashSet<String> set2=new HashSet<String>(Arrays.asList(Alpabets));
set2.removeAll(set1);
System.out.println(set2);
 }
    public static void main(String[] args) {
      FindTheMissingAlphabets o=new FindTheMissingAlphabets();
       o.step1();
        //o.step2();
    }
}    
   
   
