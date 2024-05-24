
public class pattern
{
    public static void main(String arg[])
    {
        class BlankSpace {
            public static void main(String[] args)
            {
                String str = "	 Geeks	 for Geeks	 ";
                String s1=str.length();
                System.out.println(s1);
                // Call the replaceAll() method
                str = str.replaceAll("\\s", "");
                String s=str.length();
                System.out.println(s);
                System.out.println(str);
            }
        }
        
      

    }
}