import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class dsthrsoal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cards = sc.nextLine().split(" ");

        Stack<String> mainStack = new Stack<>();
        for (String card : cards) mainStack.push(card);
        
        List<Stack<String>> sortedStacks = new ArrayList<>();
        sortedStacks.add(new Stack<>()); // Stack pertama
        
        while (!mainStack.isEmpty()) {
            String currentCard = mainStack.pop();
            boolean placed = false;
            
            // Cek dari stack tertua
            for (Stack<String> stack : sortedStacks) {
                if (!stack.contains(currentCard)) {
                    stack.push(currentCard);
                    placed = true;
                    break;
                }
            }
            
            if (!placed) {
                Stack<String> newStack = new Stack<>();
                newStack.push(currentCard);
                sortedStacks.add(newStack);
            }
        }

        for (Stack<String> stack : sortedStacks) {
            for (String c : stack) System.out.print(c + " ");
            System.out.println();
        }
    }
}