
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double a, b, c, delta;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap he so a, b, c: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        delta = b * b - 4 * a * c;

        if(delta < 0){
            System.out.println("Phuong trinh da cho vo nghiem");
        }
        else if(delta == 0){
            double x = -b / (2 * a);
            System.out.println("Phuong trinh da cho co nghiem kep la: " + x);
        }
        else{
            double x1, x2;
            x1 = (-b - Math.sqrt(delta)) / (2 * a);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);

            System.out.println("Phuong trinh da cho co nghiem la: " + x1 + " va " + x2);
        }
    }
}

