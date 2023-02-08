import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s=s.trim();
        if (s.length()==0 || s.length()>400000)
        {
            System.out.println(0);
        }
        else
        {
            String[] tokens =s.split("[ .,?!_'\\@]+");
            System.out.println(tokens.length);
            for(String ss : tokens)
            System.out.println(ss);
        }
        scan.close();
    }
}
