package midPP;

import java.util.Arrays;
import java.util.Scanner;

public class Q2Main {

    public static void main(String[] args) {
        int size = 10;
        Q2 queue = new Q2(size);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 characters in descending order:");
        for (int i = 0; i < 5; i++) {
            String s = sc.nextLine();
            queue.insert(s.charAt(0));
        }

        // Step 2: Get the 5 characters and sort them in ascending order
        char[] copied = queue.getAllElements();
        Arrays.sort(copied); // ascending order

        // Step 3: Insert sorted characters back into the queue
        for (char ch : copied) {
            queue.insert(ch);
        }

        // Step 4: Remove all and print
        System.out.println("Queue after duplication in ascending order:");
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }

        sc.close();
    }
}
