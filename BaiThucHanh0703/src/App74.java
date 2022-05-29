import java.util.Scanner;

public class App74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int a, sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("nhap phan tu thu " + i + ": ");
            a = sc.nextInt();
            arr[i] = a;
            if (a % 2 == 0) {
                sum += a;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("tong phan tu chan: " + sum);
        sc.close();

    }
}