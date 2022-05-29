import java.util.Scanner;
class App7 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

		int max=0,n;
		do
		{
			System.out.println("nhập số nguyên: ");
			n=sc.nextInt();
			if(n>max)
			{
				max=n;
			}
		}while(n!=0);
    System.out.printf("\nSố lớn nhất trong mảng là: %d", max);
  }
}
