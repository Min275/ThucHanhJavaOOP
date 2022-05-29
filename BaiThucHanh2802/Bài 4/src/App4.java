import java.util.Scanner;
public class App4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguye n= ");
        int n = scanner.nextInt();

        int i = 0, check;
        while ( i < n){

            check = isprime(i);
        
            if( check == 1 ) System.out.print (i +" ");
            
            ++i;
        }
    }
    private static int isprime(int n){
        int flag = 1;

        if (n <2) return flag = 0; 
        int i = 2;
        while(i <n){
            if( n%i==0 ) {
                flag = 0;
                break; 
            }
            i++;
        }

        return flag;
    }
}