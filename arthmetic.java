import java.util.*;
public class arthmetic
{
    public static void main (String args[])
    {
      
        int a=5;
        int d=2;
        int N=10;
        int nth=a;
        for(int i=1;i<N;i++)
        {
            nth+=d;
        }
        System.out.println("N value: "+N+" Result : "+nth);
    }
}