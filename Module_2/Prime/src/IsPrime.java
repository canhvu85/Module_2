import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = scanner.nextInt();

        if (n < 2){
            System.out.println(n + " is not a prime");
        }else {
            boolean flag = true;
            for(int i = 2; i<n; i++){
                if (n % i == 0){
                    flag = false;
                }
            }
            if (flag){
                System.out.println(n + " is a prime");
            }else
                System.out.println(n + " is not a prime");
        }
    }
}
