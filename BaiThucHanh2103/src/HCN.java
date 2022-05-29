import java.util.Scanner;

public class HCN {

    // Bài 1
    public static void main(String[] args) throws Exception {
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.nhapChieuRong();
        hcn.nhapChieuDai();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inChuVi();
        hcn.inDienTich();
    }
}
 
class HinhChuNhat {
    float a;
    float b;
    float cv;
    float dt;

    void nhapChieuDai() {
        System.out.println("Hãy nhập vào chiều dài HCN: ");
        Scanner scanner = new Scanner (System.in);
        a = scanner.nextFloat();
    }
    void nhapChieuRong() {
        System.out.println("Hãy nhập vào chiều rộng HCN: ");
        Scanner scanner = new Scanner (System.in);
        b = scanner.nextFloat();
    }
    void tinhChuVi() {
        cv = (a + b) * 2;
    }
    void tinhDienTich() {
        dt = a * b;
    }
     void inChuVi() {
        System.out.println("Chu vi HCN: " + cv);
    }                                   
     void inDienTich() {
        System.out.println("Diện tích HCN: " + dt);
    }
}

    