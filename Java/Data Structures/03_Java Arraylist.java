import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int c=s.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(c);
        for(int i=0;i<c;i++)
        {
            int c2=s.nextInt();
            ArrayList<Integer> temp = new ArrayList<>(c2);
            for(int j=0;j<c2;j++)
                temp.add(s.nextInt());
            arr.add(temp);
        }
        int c3=s.nextInt();
        for(int i=0;i<c3;i++)
        {
            int x=s.nextInt();
            int y=s.nextInt();
            try
            {
                System.out.println(arr.get(x-1).get(y-1));
            }
            catch(IndexOutOfBoundsException e)
            {
                System.out.println("ERROR!");
            }
        }
    }
}
