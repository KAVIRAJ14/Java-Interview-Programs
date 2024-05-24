class encapsul{
 private int x=100;
 private String name="john";
 
 public int getx()
 {
    return x;
 }
 public void setx(int X)
 {
    x=X;
 }
 public String getname()
 {
    return name;
 }
 public void setname(String s)
 {
    name=s;
 }
}
public class encapsulation {
    public static void main(String args[])
    {
    encapsul e=new encapsul();
    int a=e.getx();
    String b=e.getname();
    System.out.println(a+" "+b);
    }
}
//Binding logically related data and functions together in one class or in one place is known as encapsulation.
//Advantage-understandability,readability