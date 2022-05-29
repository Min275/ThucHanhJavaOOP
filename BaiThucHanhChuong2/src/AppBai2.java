import java.util.Scanner;
 
public class AppBai2 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập số kiểm tra: ");
        int a = scanner.nextInt();

        if(a % 2 == 0) {
                System.out.println("Đây là số chẵn!");
            }
            else
            {
                System.out.println("Đây là số lẻ!");
            }
        }
        }