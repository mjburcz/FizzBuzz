package execute.fizzbuzz;

import java.util.Scanner;

/**
 * Created by mallo on 6/22/2016.
 */
public class FizzBuzz {
    public static void main(String args[]) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[2]);
        StringBuilder sb = new StringBuilder("");
        for (int i = 1; i <= n; i++) {
            int length = sb.length();
            if (i % a == 0) {
                sb.append("Fizz");
            }
            if (i % b == 0) {
                sb.append("Buzz");
            }
            if (length == sb.length()) {
                sb.append(i);
                sb.append('\n');
            }
        }
        System.out.println(sb);
    }
}
