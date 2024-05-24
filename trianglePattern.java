import java.util.*;
import java.util.Scanner;

 public class trianglePattern
 {
    public void step1()
    {
       Scanner in=new Scanner(System.in);
         System.out.println("Enter the number of lines : ");
         int lines=in.nextInt();
         for(int row=0;row<lines;row++)
         {
            for(int coloumn=0;coloumn<=row;coloumn++)
            {
                System.out.print(" * ");
            }
            System.out.println(" ");
         }

    }public void step2(){
       int startingNumber=1;
         Scanner in=new Scanner(System.in);
         System.out.println("Enter the number of lines : ");
         int lines=in.nextInt();
         for(int row=0;row<lines;row++)
         {
            for(int coloumn=0;coloumn<=row;coloumn++)
            {
                System.out.print(startingNumber+" ");
                startingNumber++;
            }
            System.out.println(" ");
         }
    }
// System.out.println("");

    public static void main(String[] args) {
      trianglePattern o=new trianglePattern();
       o.step1();
       System.out.println("----------------------- ");
       o.step2();
    }
} 