import java.util.*;
import java.util.Scanner;
import java.util.stream.IntStream;

 public class findMyPosition
 {
 public void step1()
 {
Scanner in=new Scanner(System.in);
System.out.println("Enter The Character :");
char givenChar=in.next().charAt(0);
givenChar=Character.toLowerCase(givenChar);
int ascii=(int)givenChar;
int position=ascii-96;
System.out.println(position);

 }


    
    public static void main(String[] args) {
      findMyPosition o=new findMyPosition();
        o.step1();
        //o.step2();
    }
}    
   
   
