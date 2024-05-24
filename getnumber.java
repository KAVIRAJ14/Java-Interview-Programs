  import java.util.*;
     import java.util.Scanner;

public class getnumber    
{
    public static void main(String[] args) {
       
        HashMap<String,Integer> number=new HashMap<>();

        number.put("one",1);
        number.put("two",2);
        number.put("three",3);
        number.put("four",4);
        number.put("five",5);
        number.put("six",6);
        number.put("seven",7);
        number.put("eight",8);
        number.put("nine",9);
        number.put("zero",10);
    
        System.out.println("Enter The Number");
        Scanner in=new Scanner(System.in);
        String value=in.next();
        value=value.toLowerCase();
        
        if(number.containsKey(value)){       
               
            int numberValue=number.get(value);
            System.out.println("This is your number : "+numberValue);           
        } 
        else{
            System.out.println("Invalid Number");

        }
             
     }
}