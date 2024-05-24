public class reverseString
{
    public static void main(String args[])
    {
        String name="kavi";
        String reverse="";

        char a[]=name.toCharArray();
        for(int i=name;i<a.length-1;i--)
        {
          reverse=reverse+name.charAt(i);
        
        }
        System.out.println(reverse);
    }
}