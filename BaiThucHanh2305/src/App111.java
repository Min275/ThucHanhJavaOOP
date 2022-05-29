import java.util.LinkedList;
import java.util.Scanner;

public class App111 {
    public static void main(String[] args) throws Exception {
        int n;
        System.out.print("Nhap n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        LinkedList<Integer> LinkedInteger = new LinkedList<>();
        int tmp;
        for(int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i+1) + ": ");
            tmp = sc.nextInt();
            LinkedInteger.add(tmp);
        }

        int sum = 0, count = 0;
        for(int number : LinkedInteger) {
            if(number % 2 == 0) {
                sum += number;
                count++;
            }
        }

        System.out.println("Trung binh cong cac so chan cua linked la: " + sum * 1.0 / count);
    }
}