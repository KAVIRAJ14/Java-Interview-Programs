class parent{
    int x=10;
    class child1{
        int y=90;
    }
    class child2 extends child1{
        int z=100;
    } 
}

public class inheritance extends parent {
    public static void main(String args[])
    {
        inheritance p=new inheritance();
        inheritance.child2 c=p.new child2();
        System.out.println(p.x+c.y+c.z);
        //acquiring properties from parent to child.we can reuse other class code using inheritance.
        //Inheritance reduces code duplication/code redundancy.
    }
}
