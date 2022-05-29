import java.util.Scanner;
public class App55 {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <= 20; i++ ){
           if(i % 5 != 0){
             continue;
            }
            System.out.println(i);
       }
    }
}
