interface inter{
     void display();
     String display2(String name);
}
abstract class a implements inter{
    public void display()
    {
        System.out.println("Hi,This Interface Method");
    }
    public String display2(String name)
    {
        return name;
    }
    abstract void display3();
}
class b extends a{
    void display3()
    {
        System.out.print("This interface with absttraction method");
    }
}
public class interfaceMethod {
    public static void main(String args[])
    {
        a a1=new b();
        String s="kavi";
        System.out.println(a1.display2(s));
        a1.display();
        a1.display3();
    }
}
