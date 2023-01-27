import java.io.*;
import java.util.*;

public class Solution 
{
    static Scanner s=new Scanner(System.in);
    static int B=s.nextInt();
    static int H=s.nextInt();
    public static void main(String[] args) 
    {
        if(B<=0||H<=0)
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        else
        System.out.println(B*H);
    }
}
