import java.lang.*;
import java.util.Scanner;
public class sumavg
{
public static void main (String args[])
{
System.out.println("enter the value");
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int sum=0;
int a;
for (int i=1;i<=n;i++)
{
    System.out.print("enter the numbers "+i+":");
    a=input.nextInt();
    sum+= a;
    
}
System.out.println("sum of given value"+sum);
System.out.println("avg of given value"+sum/n);
}}