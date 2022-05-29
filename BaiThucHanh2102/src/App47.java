import java.util.Scanner;
public class App47 {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int number, tong = 0;
        do {
            System.out.println("Nhập vào số nguyên bất kì: ");
            number = sc.nextInt();
            tong += number;
        } while(tong < 100);
            System.out.println("Tổng các số nguyên = "+tong);
        }
    }