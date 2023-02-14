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
    public static int minimumNumber(int n, String password) 
    {
        int l=0,u=0,nm=0,s=0;
        String lower = ".*[a-z]+.*";
        String upper = ".*[A-Z]+.*";
        String number = ".*[0-9]+.*";
        String special = ".*[-!@#$%^&*()+]+.*"; 

        if(!(password.matches(lower))) l=1; 
        if(!(password.matches(upper))) u=1;  
        if(!(password.matches(number))) nm=1; 
        if(!(password.matches(special))) s=1;   
        return ((l+u+nm+s)>(6-n))?(l+u+nm+s):(6-n);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
