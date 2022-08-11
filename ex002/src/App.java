import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os 3 primeiros pontos: ");
        double xa = scan.nextDouble();
        double ya = scan.nextDouble();
        double za = scan.nextDouble();
        System.out.println("Digite os 3 pontos de destino: ");
        double xb = scan.nextDouble();
        double yb = scan.nextDouble();
        double zb = scan.nextDouble();
        double resp = Math.sqrt( ((xb-xa)*(xb-xa)) + ((yb-ya)*(yb-ya)) + ((zb-za)*(zb-za)));
        System.out.println("A distância é: "+ resp);
    }
}
