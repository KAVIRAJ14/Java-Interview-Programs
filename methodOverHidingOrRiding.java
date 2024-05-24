class method1
{
   static void display(){
     System.out.println("Base class");
    }

}
class method2 extends method1{
    int display(int x)
    {
        return x;
        

    }
}
public class methodOverHidingOrRiding {
    public static void main(String[] args) {
        method2 m2=new method2();
       
        System.out.println( m2.display(4)+" hi");
        method1.display();
        method2.display();

    }
}
