import java.io.*;
import java.util.*;
import java.text.NumberFormat;

public class Solution 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double payment = s.nextDouble();
        List<NumberFormat> formats = new ArrayList<>();
        formats.add(NumberFormat.getCurrencyInstance(Locale.US));
        formats.add(NumberFormat.getCurrencyInstance(new Locale("en","in")));
        formats.add(NumberFormat.getCurrencyInstance(Locale.CHINA));
        formats.add(NumberFormat.getCurrencyInstance(Locale.FRANCE));
        String[] country = {"US","India","China","France"};
        for(int i=0;i<4;i++)
        System.out.println(country[i]+": "+formats.get(i).format(payment));
    }
}
