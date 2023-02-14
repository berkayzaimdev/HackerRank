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
    public static String caesarCipher(String s, int k) 
    {
        String alphabet ="abcdefghijklmnopqrstuvwxyz";
        String result = "";
        alphabet = alphabet.substring(k%26,alphabet.length())+alphabet.substring(0,k%26);
        for(char c : s.toCharArray())
        { 
            if (Character.isLetter(c)) 
            {
                char ch = alphabet.charAt((int) c % 32 - 1);
                result += Character.isUpperCase(c) ? Character.toUpperCase(ch) : ch;
            }
            else result+=Character.toString(c);
        }
        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
