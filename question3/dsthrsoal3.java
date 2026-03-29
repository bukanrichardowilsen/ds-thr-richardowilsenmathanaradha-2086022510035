import java.util.PriorityQueue;
import java.util.Stack;

class Borrower implements Comparable<Borrower> {
    String name;
    String targetKey;
    int priority;

    public Borrower(String name, String targetKey, int priority) {
        this.name = name;
        this.targetKey = targetKey;
        this.priority = priority;
    }

    @Override
    public int compareTo(Borrower other) {
        return Integer.compare(this.priority, other.priority);
    }
}

public class dsthrsoal3{
    public static void main(String[] args) {
        // Asumsi data di-parse dari input scanner
        PriorityQueue<Borrower> pq = new PriorityQueue<>();
        pq.add(new Borrower("Aristo", "510", 1));
        pq.add(new Borrower("Inno", "510", 2));
        // ... tambahkan yang lain
        
        Stack<String> outputStack = new Stack<>();
        while (!pq.isEmpty()) {
            Borrower b = pq.poll();
            outputStack.push(b.name + " | " + b.targetKey);
        }
        
        // Cetak sesuai output test case
        for (String res : outputStack) {
            System.out.println(res);
        }
    }
}