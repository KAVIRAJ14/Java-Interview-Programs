
public class replace{
 public static void main(String[] args)
            {
                String str = "	 Geeks	 for Geeks	 ";
                System.out.println(str.length());
                // Call the replaceAll() method
                str = str.replaceAll("\\s", "");
                System.out.println(str.length());
                System.out.println(str);
            }
        }
        
      


