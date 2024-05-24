import java.util.InputMismatchException;

public class exceptionHandling {
    public static void main(String[] args) {
        
        try{
        
            int x="sam";
            System.out.println(x);
        }
        catch(InputMismatchException e)
        {
            int x=10;
            System.out.println(x);
        }
}}
