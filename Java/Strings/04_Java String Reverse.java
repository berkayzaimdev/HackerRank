import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.println(pal(A,0)?"Yes":"No");
    }
    
    public static boolean pal(String s,int i)
    {
        if(i>(s.length()/2)+1||s.length()==1)
        return true;
        if(s.charAt(i)==s.charAt(s.length()-i-1))
        return pal(s,++i);
        else
        return false;
    }
}
