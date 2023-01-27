import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int sum,c=0;
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
  
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            c++;
            sum=arr[i];
            for(int j=i+1;j<n;j++)
            {
                sum+=arr[j];
                if(sum<0)
                c++;
            }
        }
        System.out.println(c);
    }
}
