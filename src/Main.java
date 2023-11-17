import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        solve(num);
    }

    public static void solve(long num) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            minHeap.add(scanner.nextLong());
        }
        printPq(minHeap);
    }

    public static void printPq(PriorityQueue<Long> pq) {
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}
