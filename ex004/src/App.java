/*

4. Para	 cada	 produto	 informado	 (nome,	 preço	 e	 quantidade),	 escreva	 o	 nome	 do	 produto	
comprado	 e	 o	 valor	 total	 a	 ser	 pago,	 considerando	 que	 são	 oferecidos	 descontos	 pelo	
número	de	unidades	compradas,	segundo	a	tabela	abaixo:	
a. Até	10	unidades: valor	total
b. de	11 a	20	unidades: 10%	de	desconto
c. de	21	a	50	unidades: 20%	de	desconto
d. acima	de	50	unidades: 25%	de	desconto ||

 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int codLoop; 
        /* IMPLEMENTAR VARIÁVEL TOTAL */
        double total = 0;
        Scanner scan = new Scanner(System.in);
        produtos[] produto = new produtos[100];
        while (true){ /* MENU */
            System.out.println("=~=~=~=~=~=~=~=~=~=~=~=~=~=~");
            System.out.println("Bem vindo ao Mercado Galo Cinza\n");
            System.out.println("Digite 1 para cadastrar um pedido e 0 para sair. ");
            System.out.println("=~=~=~=~=~=~=~=~=~=~=~=~=~=~");
            codLoop = scan.nextInt();
            scan.nextLine(); /* Limpar o Buffer */

            if (codLoop == 0) {
                break;
            } else if (codLoop == 1){
                System.out.println("=~=~=~=~=~=~=~=~=~=~=~=~=~=~");
                System.out.println("Cadastro de produtos: ");
                System.out.println("=~=~=~=~=~=~=~=~=~=~=~=~=~=~");
                for(int i = 0; i < 100; i++) { /* CADASTRA PRODUTOS NA CLASSE */
                    produto[i] = new produtos();
                    produto[i].id = i;
                    System.out.print("Digite o nome do produto: ");
                    produto[i].nome = scan.next();
                    scan.nextLine(); /* Limpar o Buffer */
                    System.out.print("Digite o preço do produto: ");
                    produto[i].preco = scan.nextDouble();
                    System.out.print("Digite a quantidade do produto: ");
                    produto[i].quantidade = scan.nextInt();
                    System.out.println("\n=~=~=~=~=~=~=~=~=~=~=~=~=~=~");

                    if(produto[i].quantidade >= 11 && produto[i].quantidade <= 20) { /* vERIFICA O DESCONTO */
                        produto[i].preco = produto[i].preco - produto[i].preco*0.1;
                        System.out.println("10 ou mais unidades compradas, desconto de 10% aplicado");
                    } else if (produto[i].quantidade >= 21 && produto[i].quantidade <= 50){
                        produto[i].preco = produto[i].preco - produto[i].preco*0.2;
                        System.out.println("21 ou mais unidades compradas, desconto de 20% aplicado");
                    } else if (produto[i].quantidade >= 50){
                        produto[i].preco = produto[i].preco - produto[i].preco*0.25;
                        System.out.println("50 ou mais unidades compradas, desconto de 25% aplicado");
                    }
                    total = total + produto[i].preco*produto[i].quantidade;
                    /* MOSTRA O VALOR PARCIAL DA COMPRA */ 
                    System.out.println("Produto "+produto[i].nome+" adquirido com sucesso\n Parcial da compra: R$ "+produto[i].preco*produto[i].quantidade);
                    System.out.println("\nDeseja continuar? 1 - Sim; 0 - Não;");
                    codLoop = scan.nextInt();
                    System.out.println("\n");
                    if (codLoop == 0){
                        break;
                    }
                }

                System.out.println("=~=~=~=~=~=~=~=~=~=~=~=~=~=~"); /* TIRA A NOTA FISCAL */
                System.out.println("NOTA FISCAL");
                System.out.println("=~=~=~=~=~=~=~=~=~=~=~=~=~=~");
                System.out.println(" ");
                for(int i = 0; i < 100; i++){
                    if(produto[i] != null){
                        System.out.println("ID: "+produto[i].id+" "+produto[i].nome+" "+"R$ "+produto[i].preco+" Qntd: "+produto[i].quantidade+"\n");
                    } else {
                        break;
                    }  
                }
                System.out.println("=~=~=~=~=~=~=~=~=~=~=~=~=~=~");
                System.out.println(" ");
            }
        }     
    }
}

class produtos{
    int id;
    String nome;
    double preco;
    int quantidade;
}