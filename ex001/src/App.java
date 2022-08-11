import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor de A");
        double a = scan.nextDouble();
        System.out.println("Digite o valor de B");
        double b = scan.nextDouble();
        System.out.println("Digite o valor de C");
        double c = scan.nextDouble();
        double delta = (b*b)-(4*a*c);
        double x1 = (-b + Math.sqrt(delta))/2*a;
        double x2 = (-b - Math.sqrt(delta))/2*a;
        System.out.print("Delta: "+delta+"\n");
        if(delta < 0){
            System.out.println("A equação de 2º grau não possui raízes reais!");
            System.exit(0);
        }
        System.out.print("X1: "+x1+"\n");
        System.out.print("X2: "+x2+"\n");
    }
}