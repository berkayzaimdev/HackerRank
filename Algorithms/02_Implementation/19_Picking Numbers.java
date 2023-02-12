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
    public static int pickingNumbers(List<Integer> a)
    {
        Map<Integer,List<Integer>[]> results = new HashMap<>();  
        for(int i=0;i<a.size();i++)
        {
            List<Integer>[] lists = new ArrayList[2];
            lists[0] = new ArrayList<>();
            lists[1] = new ArrayList<>();
            for(int j=0;j<a.size();j++)
            {
                if(a.get(i)==a.get(j)||a.get(i)-a.get(j)==1)
                    lists[0].add(a.get(j));
                if(a.get(i)==a.get(j)||a.get(j)-a.get(i)==1)
                    lists[1].add(a.get(j)); 
            }
            results.put(a.get(i),lists);
        }
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, List<Integer>[]> entry : results.entrySet()) 
        {
            Integer key = entry.getKey();
            List<Integer>[] lis = entry.getValue();
            for (List<Integer> li : lis) 
                max = li.size()>max?li.size():max;

        }

        return max;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
