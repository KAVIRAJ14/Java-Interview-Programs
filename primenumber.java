import java.lang.*;
import java.util.Scanner;
public class primenumber
{
public static void main (String args[])
{
Scanner in=new Scanner(System.in);
int a=in.nextInt();
int f=0;
for(int n=1;n<=a;n++)  
{
for(int i=1;i<=n;i++)
{
    if(n%i==0)
    {
        f++;
    }}

if(f==2)
{
    System.out.println(n+ " is a prime number");
}
f=0;
}}}
