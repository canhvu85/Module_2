import java.util.Scanner;

public class FirstDegreeEquation {
    public static void main(String[] args){
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("input a");
        double a = scanner.nextDouble();

        System.out.println("input b");
        double b = scanner.nextDouble();


        if(a != 0){
            double solution = -b / a ;
            System.out.println("Solution is x = %f!" + solution);
        }else if(a == 0){
            if(b==0){
                System.out.println("The solution is all x ");
            }else
                System.out.println("No solution");
        }

    }
}
