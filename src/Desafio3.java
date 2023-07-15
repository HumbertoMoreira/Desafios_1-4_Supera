
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = countPairs(arr, k);
        System.out.println(count);

        sc.close();
    }

    public static int countPairs(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        int count = 0;

        for (int num : arr) {
            if (set.contains(num - k)) {
                count++;
            }
            if (set.contains(num + k)) {
                count++;
            }
            set.add(num);
        }

        return count;
    }
}
