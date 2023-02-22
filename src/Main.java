import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static  final void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.println("Enter radius ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n",c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("PI value: %.2f%n",Calculator.PI);


    }

}