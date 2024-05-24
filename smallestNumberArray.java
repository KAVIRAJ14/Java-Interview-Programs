import java.util.*;
import java.util.Scanner;

 public class smallestNumberArray
 {
    int givenArray[]={2,4,1,0,7,8,5};
    public void step1()
    {
  int smallest=Integer.MAX_VALUE;
for(int i=0;i<givenArray.length;i++)
{
    if(givenArray[i]<smallest)
    {
        smallest=givenArray[i];
    }
}
System.out.println(" First Step-Smallest Number :"+smallest);
    }
    public void step2()
    {
        Arrays.sort(givenArray);
        System.out.println("Second Step-Smallest Number :"+givenArray[0]);
    }
    public static void main(String[] args) {
      smallestNumberArray o=new smallestNumberArray();
        o.step1();
         o.step2();
    }
} 