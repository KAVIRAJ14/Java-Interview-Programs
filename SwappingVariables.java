import java.util.*;
import java.util.Scanner;

 public class SwappingVariables
 {
  public void step1(){
    int mysalary=10000;
    int seniorSalary=30000;
    System.out.println("Before swapping "+" mine:"+mysalary+"- senior salary :"+seniorSalary);

    int thirdPerson=mysalary;
    mysalary=seniorSalary;
    seniorSalary=thirdPerson;
    System.out.println("After swapping "+" mine:"+mysalary+"- senior salary :"+seniorSalary);
  }
  public void step2(){
    int first=20;
    int second=50;
        System.out.println("Before swapping "+" first:"+first+" second :"+second);

    first=first-second;
    second=first+second;
    first=second-first;
                System.out.println("After swapping "+" first:"+first+" second :"+second);

 
  }

    public static void main(String[] args) {
        SwappingVariables o=new SwappingVariables();
        o.step1();
                System.out.println("-----------------------");

  o.step2();
    }
} 