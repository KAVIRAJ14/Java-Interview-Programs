import java.util.*;
import java.util.Scanner;
import java.util.stream.IntStream;

 public class vowvelsReplace
 {
 public void step1()
 {
  String given="I love Play Football";
  char[] CharArray=given.toCharArray();
  for(int i=0;i<given.length();i++)
  {
    if(given.charAt(i)=='A' || 
    given.charAt(i)=='E' || 
    given.charAt(i)=='I' ||
    given.charAt(i)=='O' ||
    given.charAt(i)=='U' ||
    given.charAt(i)=='a' ||
    given.charAt(i)=='e' ||
    given.charAt(i)=='i' ||
    given.charAt(i)=='o' ||
    given.charAt(i)=='u')
        
        CharArray[i]='*';
  }
        System.out.print(CharArray);
 }
 public void step2()
 {
      String given="I love Play Football";
String replaceText=given.replaceAll("[AEIOUaeiou]", "*");
System.out.println(replaceText);
 }
    public static void main(String[] args) {
      vowvelsReplace o=new vowvelsReplace();
       // o.step1();
        o.step2();
    }
}    
   
   
