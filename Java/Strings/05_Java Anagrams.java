import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) 
    {
        int ax,bx;
        if(a.length()!=b.length())
        return false;
        for(int i=0;i<a.length();i++)
        {
            ax=0;
            bx=0;
            for(int j=0;j<b.length();j++)
            {
                if(Character.toUpperCase(a.charAt(i))==Character.toUpperCase(a.charAt(j)))
                ax++;
            }
            for(int j=0;j<b.length();j++)
            {
                if(Character.toUpperCase(a.charAt(i))==Character.toUpperCase(b.charAt(j)))
                bx++; 
            }
            if(ax!=bx)
            return false;           
        }
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
