public class vowelspresent2 {
    public static void main(String[] args) {
        int count=0;
        String name="kavi";
        name=name.toLowerCase();
        for(int i=0;i<name.length();i++)
        {
            char c=name.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                System.out.println("Vowvels :"+name.charAt(i));
                count++;
            }
            
        }
        System.out.println(count);
    }
}
