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

class Result {

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) 
    {
        Set<Integer> setofranks = new LinkedHashSet<>(ranked);
        List<Integer> uniqueranks = new ArrayList<>(setofranks);
        int[] results = new int[player.size()];
      
        /*
        Without binary search (Gives longer time complexity)
        
        for(int i=0;i<results.length;i++)
        {
            for(int j=0;j<uniqueranks.size();j++)
            {
                if(player.get(i)<uniqueranks.get(uniqueranks.size()-1))
                {
                    results[i] = uniqueranks.size()+1;
                    break;
                }
                if(player.get(i)>=uniqueranks.get(j))
                {
                    results[i] = j+1;
                    break;
                }
            }
        }
        */
      
        for(int i=0;i<results.length;i++)
        {
            int min = 0, max = uniqueranks.size()-1, mid;
            while (min <= max) 
            {
                mid =min+(max-min)/2;
                if (uniqueranks.get(mid) == player.get(i)) 
                {
                    results[i] = mid + 1;
                    break;
                } 
                else if (uniqueranks.get(mid) > player.get(i)) 
                {
                    min = mid + 1;
                } 
                else 
                {
                    max = mid - 1;
                }
            }
            if (min > max) 
            {
                results[i] = min + 1;
            }
        }
        
        return new ArrayList<>(Arrays.stream(results).boxed().collect(Collectors.toList()));
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> results = Result.climbingLeaderboard(ranked, player);

        bufferedWriter.write(
            results.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
