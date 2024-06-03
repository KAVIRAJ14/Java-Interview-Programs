import java.util.*;
public class counts {    
    
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the numbers :");
        int n=input.nextInt();
        String num = Integer.toString(n);
        System.out.println("Total number of digits : "+num.length());
        
    }
}