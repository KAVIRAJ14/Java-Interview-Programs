class outer
{
    int out=10;
    class inner{
        int in=20;
        void display()
        {
          
            
          outer i=new outer();

          System.out.println(" ADD :"+i.out);
         
        }
    }
}
public class nestedclass {
    public static void main(String[] args) {
        
        outer.inner nest=new outer.inner();
        nest.display();
    }
}
