import java.util.HashMap;
import java.util.*;

class Solution{
    public int isroman(String s)
    {
        int n=0;
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        for(int i=0;i<c.length;i++)
        {
            char c=s.charAt(i);
            if(i+1<s.length()&& map.get(s.charAt(i+1))>map.get(c))
            {
                 n+=map.get(s.charAt(i+1))-map.get(c);
            }
            else
            {
                n+=map.get(c);
            }
        }

        return  n;
    }
}
public class romanTointeger {
    public static void main(String args[]){
        Solution s=new Solution();
       System.out.println( s.isroman("II"));
    }
}
