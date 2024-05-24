import java.util.*;
import java.util.Scanner;
import java.util.stream.IntStream;

 public class findCharRepeat
 {
 public void step1()
 {
  
  Scanner in=new Scanner(System.in);
  System.out.println("Enter The Name :");
  String input=in.nextLine();
  input=input.toLowerCase();
  Scanner inp=new Scanner(System.in);
  System.out.println("Enter The Character To Find :");
  char toFind=inp.next().charAt(0); 
  // char toFind='a';
int occurance=0;
for(int i=0;i<input.length();i++)
{
  if(input.charAt(i)==toFind)
  {
    occurance++;
  }
}
System.out.println("The Character is "+occurance+" number of time repeated");

 }
 public void step2(){
  Scanner in=new Scanner(System.in);
  System.out.println("Enter The Name :");
  String input=in.nextLine();
  input=input.toLowerCase();
  Scanner inp=new Scanner(System.in);
  System.out.println("Enter The Character To Find :");
  char toFind=inp.next().charAt(0); 
  // char toFind='a';
int beforeReplace=input.length();
System.out.println(input.length());
String charToString=Character.toString(toFind).toLowerCase();
input=input.replace(charToString,"");
int afterReplace=input.length();
System.out.println(input.length());
int occurance=beforeReplace-afterReplace;
  System.out.println(occurance);

 }
    public static void main(String[] args) {
      findCharRepeat o=new findCharRepeat();
        //o.step1();
        o.step2();
    }
}    
   
   
