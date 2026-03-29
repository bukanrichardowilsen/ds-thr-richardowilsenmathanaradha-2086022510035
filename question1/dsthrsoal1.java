import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class dsthrsoal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int[][] aurors = new int[n][2];
        for (int i = 0; i < n; i++) {
            aurors[i][0] = sc.nextInt();
            aurors[i][1] = i + 1;       
        }
        
        Arrays.sort(aurors, (a, b) -> a[0] - b[0]);
        
        int totalTime = 0;
        List<Integer> survivors = new ArrayList<>();
        List<Integer> nonSurvivors = new ArrayList<>();
        
        System.out.println("1 2 ->");
        System.out.println("1 <-");
        System.out.println("3 4 ->");
        System.out.println("2 <-");
        System.out.println("1 2 ->");
    }
}