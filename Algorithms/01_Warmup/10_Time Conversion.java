import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result 
{
    public static String timeConversion(String s) 
    {
        String[] time = s.split(":");
        String h;
        if(time[2].substring(2,4).equals("PM"))
        {
            if(time[0].equals("12"))
            h="12";
            else
            h=Integer.toString(Integer.parseInt(time[0])+12);
        }
        else
        {
            if(time[0].equals("12"))
            h="00";
            else
            h=time[0];
        }
        return h+":"+time[1]+":"+time[2].substring(0,2);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
