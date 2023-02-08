import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) 
    {
        String temp;
        String[] ss = new String[s.length()-k+1];
        int i=0;
        while(k+i<=s.length())
        ss[i]=s.substring(i,k+(i++));
    
    
        for(int j=0;j<ss.length;j++)
            for(int m=j;m<ss.length;m++) 
                if(m!=j)
                    if(calculator(ss[j],ss[m],0))
                    {
                        temp=ss[m];
                        ss[m]=ss[j];
                        ss[j]=temp;
                    }
        return ss[0] + "\n" + ss[ss.length-1];
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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
