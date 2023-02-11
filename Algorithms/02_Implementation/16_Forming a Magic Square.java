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
    public static int formingMagicSquare(List<List<Integer>> s)
    {
        List<int[]> list = new ArrayList<>();
        int[] y;
        boolean found;
        for (int i = 1; i <= 9; i++) 
        {
            for (int j = 1; j <= 9; j++) 
            {
                for (int k = 1; k <= 9; k++)
                {
                    int sum = i + j + k;
                    for (int l = 1; l <= 9; l++) 
                    {
                        for (int m = 1; m <= 9; m++) 
                        {
                            for (int n = 1; n <= 9; n++) 
                            {
                                if (sum != l + m + n) 
                                continue;
                                for (int o = 1; o <= 9; o++) 
                                {
                                    if(sum != i + l + o || sum != o + m + k) 
                                    continue;
                                    for (int p = 1; p <= 9; p++) 
                                    {
                                        if (sum != j + m + p) 
                                        continue;
                                        for (int q = 1; q <= 9; q++) 
                                        {
                                            if(
                                                sum != o + p + q ||
                                                sum != i + m + q ||
                                                sum != k + n + q
                                            )
                                            continue;
                                            int[] magicsquare = {i, j, k, l, m, n, o, p, q};
                                            found=false;
                                            y = magicsquare.clone();
                                            Arrays.sort(y);
                                            if(!Arrays.equals(y,new int[]{1,2,3,4,5,6,7,8,9}))
                                            continue;
                                            for(int[] a : list)
                                            {
                                                if(Arrays.equals(a,magicsquare))
                                                {
                                                    found=true;
                                                    break;
                                                }
                                            }
                                            if(!found)
                                            list.add(magicsquare);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
      
        int arr[] = new int[list.size()];
        for(int i=0;i<arr.length;i++)
        {        
            arr[i] = Math.abs(list.get(i)[0]-s.get(0).get(0)) + Math.abs(list.get(i)[1]-s.get(0).get(1)) + Math.abs(list.get(i)[2]-s.get(0).get(2));
            arr[i] += Math.abs(list.get(i)[3]-s.get(1).get(0)) + Math.abs(list.get(i)[4]-s.get(1).get(1)) + Math.abs(list.get(i)[5]-s.get(1).get(2));
            arr[i] += Math.abs(list.get(i)[6]-s.get(2).get(0)) + Math.abs(list.get(i)[7]-s.get(2).get(1)) + Math.abs(list.get(i)[8]-s.get(2).get(2));
        }   
        Arrays.sort(arr);
        return arr[0];
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> s = new ArrayList<>();

        IntStream.range(0, 3).forEach(i -> {
            try {
                s.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
