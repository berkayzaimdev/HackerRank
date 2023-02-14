import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result 
{
    public static String appendAndDelete(String s, String t, int k) 
    {
        int c = 0;
        
        for (int i=0; i<Math.min(s.length(),t.length());i++)
        {
            if (s.charAt(i)==t.charAt(i)) c++;
            else break;
        }
        
        if((s.length()+t.length()-2*c)>k) return "No";
        else if((s.length()+t.length()-2*c)%2==k%2) return "Yes";
        else if((s.length()+t.length()-k)<0) return "Yes";
        else return "No";    
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
