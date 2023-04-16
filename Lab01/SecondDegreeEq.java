import java.lang.Math;
import java.util.Scanner;
public class SecondDegreeEq {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("This program solve the second degree equation: ax^2+bx+c = 0\n");
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        if(a == 0){
            if((b == 0)){
                if(c !=0){
                    System.out.print("The equation has no solution.\n");
                }
                else System.out.print("The equation has infinite solution.\n");
            }
            else System.out.print("The equation has only one root: x = " +  c/b);
        }
        else{
            double delta = b*b - 4*a*c;
            if(delta < 0) System.out.print("The equation has no solution.\n");
            else if (delta ==0){
                System.out.print("The equation has two same roots: x1 = x2 = " + -b/(2*a));
            }
            else {
                System.out.print("The equation has two different roots:\n");
                System.out.print("x1 = " + (-b+ Math.sqrt(delta))/(2*a) +  " x2 = " + (-b-Math.sqrt(delta))/(2*a));
            } 
        }
    }

}
