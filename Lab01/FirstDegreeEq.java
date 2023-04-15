import java.util.Scanner;
public class FirstDegreeEq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Error: a cannot be zero.");
        } else {
            System.out.print("Enter b: ");
            double b = scanner.nextDouble();
            double root = -b / a;
            System.out.println("The solution to the equation " +a+"x" + " + " + b + " = 0 is " + root);
        }
    }
}


