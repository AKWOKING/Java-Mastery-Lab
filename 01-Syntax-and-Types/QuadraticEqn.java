import java.util.Scanner;

public class QuadraticEqn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double discriminant =
                - 4 * a * c;
        double root1 = (-b + Math.sqrt(discriminant)) /
                ;
        double root2 = (
                - Math.sqrt(discriminant)) / (2 * a);

        System.out.println("Roots: " + root1 + ", " + root2);
    }
}