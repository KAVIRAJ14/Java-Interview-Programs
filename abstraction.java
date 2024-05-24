abstract class abs{
abstract void display();
public void display2()
{
    System.out.println("hi");
}
}
class abs2 extends abs
{
void display()
{
    System.out.println("Abstract method");
}
}
public class abstraction {
    public static void main(String[] args) {
        abs a=new abs2();
        a.display2();
        a.display();
        // abstract 
        //a method without body,is called abstract
        //to declare abstract method with "abstract" keyword
        //should end with semi-colon
    }
}
