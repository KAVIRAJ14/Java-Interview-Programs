class exe{
    void add(int num)
    {
        if(num<1)
        {
            System.out.println("some");
        }
        else
        {
            System.out.println(num+(num*num));
        }
    }
}
public class example1 {
    public static void main(String[] args) {
       exe e=new exe();
       e.add(-5);
    }
}

