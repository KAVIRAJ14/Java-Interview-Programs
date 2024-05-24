public class prime {
    public static void main(String args[])
    {
        int n=13;
        int check=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
            check++;
            }
        }
        if(check==2)
        {
            System.out.println("prime number");
        }else{
            System.out.println("not prime");
        }
    }
}
