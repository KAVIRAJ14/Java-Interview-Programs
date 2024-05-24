import java.util.*;
import java.util.Scanner;
import java.util.stream.IntStream;

 public class  removeLeadingAndTrailingSpace
 {
 public void step1()
 {
 String input=" Hello kavi ";
 System.out.println(input.trim());
  System.out.println(input.stripLeading());
  System.out.println(input.stripTrailing());
  System.out.println(input.replaceAll("^[ /t]+[ /t]$",""));
  System.out.println(input.replaceAll("^[ /t]",""));
  System.out.println(input.replaceAll("[ /t]$",""));

 }
    public static void main(String[] args) {
      removeLeadingAndTrailingSpace o=new removeLeadingAndTrailingSpace();
       o.step1();
        //o.step2();
    }
}    
   
   
