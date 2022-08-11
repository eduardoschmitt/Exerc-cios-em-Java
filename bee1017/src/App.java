import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double tempo = scan.nextDouble();
        double vel = scan.nextDouble();
        double x = (double)(vel*tempo)/12.0;
        System.out.format("%.3f\n", x);
    }
}
