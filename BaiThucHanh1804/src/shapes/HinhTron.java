package shapes;
import java.util.Scanner;
public class HinhTron extends HinhHọc {
    public float bankinh;

   // Constructor
    public HinhTron() {
        ten = "Hình Tròn";
    }
    public void nhapBankinh() {
        System.out.println("Bán kính = ");
        Scanner scanner new Scanner (System.in);
        bankinh = scanner.nextFloat();
    }
    public void tinhChuVi() {
        chuvi = 2 * PI * bankinh;
    }
    public void tinhDienTich() {
        dienTich = PI * bankinh * bankinh;
    }
}
