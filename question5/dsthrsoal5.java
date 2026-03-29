import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

class Card implements Comparable<Card> {
    int value, category;

    Card(String input) {
        String[] parts = input.split(",");
        this.value = Integer.parseInt(parts[0].trim());
        this.category = Integer.parseInt(parts[1].trim());
    }

    @Override
    public int compareTo(Card other) {
        if (this.category != other.category) return this.category - other.category;
        return this.value - other.value;
    }

    @Override
    public String toString() {
        return value + "," + category;
    }
}

public class dsthrsoal5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Card>[] hands = new ArrayList[4];

        for (int i = 0; i < 4; i++) {
            hands[i] = new ArrayList<>();
            String[] rawCards = sc.nextLine().split(" ");
            for (String s : rawCards) {
                hands[i].add(new Card(s));
            }
            Collections.sort(hands[i]); 
        }

        int currentPlayer = sc.nextInt() - 1; 
        Stack<Card> tableStack = new Stack<>();
        int lastPlayerToMove = -1;
        int passCount = 0;
        int winner = -1;


        while (winner == -1) {
            Card move = null;

            if (tableStack.isEmpty() || passCount == 3) {
                if (passCount == 3) currentPlayer = lastPlayerToMove;
                move = hands[currentPlayer].get(0);
                passCount = 0; 
            } else {
                Card top = tableStack.peek();
                for (Card c : hands[currentPlayer]) {
                    if (c.category == top.category && c.value > top.value) {
                        move = c;
                        break;
                    }
                }
            }
            if (move != null) {
                tableStack.push(move);
                hands[currentPlayer].remove(move);
                lastPlayerToMove = currentPlayer;
                passCount = 0;
                if (hands[currentPlayer].isEmpty()) {
                    winner = currentPlayer + 1;
                }
            } else {
                passCount++;
            }
            if (winner == -1) {
                currentPlayer = (currentPlayer + 1) % 4;
            }
        }

        // 4. Output Hasil
        System.out.println(winner);
        while (!tableStack.isEmpty()) {
            System.out.println(tableStack.pop());
        }
    }
}