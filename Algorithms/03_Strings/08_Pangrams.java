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
    public static String pangrams(String s)
    {
        List<Character> abc = new ArrayList<>();
        for(char c = 'a'; c <= 'z'; c++) abc.add(c);
        for(char c : s.toCharArray())
        {
            if(abc.contains(Character.toLowerCase(c)))
            abc.remove(abc.indexOf(Character.toLowerCase(c)));
            if(abc.size()==0)
            return "pangram";
        }
        return "not pangram";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
