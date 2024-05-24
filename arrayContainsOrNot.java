import java.util.*;
import java.util.Scanner;
import java.util.stream.IntStream;

 public class arrayContainsOrNot
 {
   int[] array={1,2,3,4,5,6};
   int numberTofind=90;
   boolean find=false;
    public void step1()
    {
for(int number:array)
{
    if(number==numberTofind)
    {
    find=true;
    break;
    }
   
}
if(find)
{
    System.out.print("Number Present");
}
else{
    System.out.println("Not Present");
}
    }
    public void step2()
    {
        boolean find=IntStream.of(array).anyMatch(element->element==numberTofind);
        if(find)
            System.out.print("Number Present");
        else    
            System.out.print("Not Present");

    }
    public static void main(String[] args) {
      arrayContainsOrNot o=new arrayContainsOrNot();
       // o.step1();
        o.step2();
    }
} 