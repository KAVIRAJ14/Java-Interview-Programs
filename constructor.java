class base{
    base()
    {
     System.out.println("hello");
    }
}
public class constructor extends base {
    private int x;
    constructor(int a)
    {
        this.x=a;
        System.out.println(a);
    }
    public static void main(String[] args) {
        constructor c=new constructor(10);
    }
}
