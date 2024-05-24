import java.util.*;
import java.util.Scanner;
import java.util.stream.IntStream;

 public class  withoutUsingUpperLowerCase
 {
 public void toChangeLowerCase ()
 {
  String given="Hi! Welcome To All";
  char[] charArray=given.toCharArray();
  for(int i=0;i<given.length();i++)
  {
    if(charArray[i]>=65 && charArray[i]<=90)
    {
        charArray[i]=(char)(charArray[i]+32);
    }
  }
  for(int i=0;i<charArray.length;i++){
  System.out.print(charArray[i]);
  }
 }
  public void toChangeUpperCase ()
 {
  String given="Hi! Welcome To All";
  char[] charArray=given.toCharArray();
  for(int i=0;i<given.length();i++)
  {
    if(charArray[i]>=97 && charArray[i]<=122)
    {
        charArray[i]=(char)(charArray[i]-32);
    }
  }
  for(int i=0;i<charArray.length;i++){
  System.out.print(charArray[i]);
  }
 }
    public static void main(String[] args) {
        withoutUsingUpperLowerCase o=new withoutUsingUpperLowerCase();
       o.toChangeLowerCase();
         System.out.println("-----------------------------");
       o.toChangeUpperCase();
    }
}    
   
   
