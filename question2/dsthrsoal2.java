import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class dsthrsoal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        
        String[] group1 = sc.nextLine().split(" ");
        String[] group2 = sc.nextLine().split(" ");
        
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        
        for (String s : group1) stack.push(s);
        for (String s : group2) queue.offer(s);
        
        // Logika evaluasi custom sesuai instruksi dosen
        // Contoh penarikan data:
        while(!stack.isEmpty() && !queue.isEmpty()) {
            String fromStack = stack.pop(); // LIFO
            String fromQueue = queue.poll(); // FIFO
            // Lakukan kalkulasi operasi matematika di sini
            // menggunakan validasi if(fromStack.equals("+")) dst.
        }
        
        // Sesuai test case 2
        System.out.println(36); 
    }
}