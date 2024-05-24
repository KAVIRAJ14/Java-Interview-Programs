class step1{
static int process1(int a,int r,int n)
{
return a*(int)Math.pow(r,n-1);
}
}
class step2
{
    int process2(int a,int r,int n)
    {
        int nth=a;
        for(int i=1;i<n;i++)
        {
            nth*=r;
        }
        return nth;
    }
}
public class geometric {
    public static void main(String args[])
    {
step1 s1=new step1();
System.out.println(s1.process1(2,2, 4));

System.out.println("------------------");

step2 s2=new step2();
System.out.println(s2.process2(2,2, 4));
    }
}
