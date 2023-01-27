import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String st=s.next();
                int a=s.nextInt();
                System.out.printf("%-15s%03d\n",st,a);
            }
            System.out.println("================================");
    }
}
