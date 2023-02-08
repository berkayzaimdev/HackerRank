import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        System.out.println(calculator(A,B,0)?"Yes":"No");
        System.out.println(Character.toUpperCase(A.charAt(0))+A.substring(1,A.length())+" "+Character.toUpperCase(B.charAt(0))+B.substring(1,B.length()));   
    }
    
    public static boolean calculator(String A,String B,int i)
    {
        if(i>=A.length()||i>=A.length())
        return false;
        
        if(A.charAt(i)>B.charAt(i))
        return true;
        else if(A.charAt(i)==B.charAt(i))
        return calculator(A,B,++i);
        else
        return false;
    }
}
