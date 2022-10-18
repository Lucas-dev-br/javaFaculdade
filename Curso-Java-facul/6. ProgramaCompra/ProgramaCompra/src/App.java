import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);


        float product = 300;
        System.out.println("O preço do produto é 300 reais, qual a forma de pagamento? ");
        System.out.println("1. A vista, Débito");
        System.out.println("2. Crédito a vista, preço normal");
        System.out.println("3. Crédito parcelado");
        int selec = s.nextInt();

        float product1 = product * 10/100;
        float j = product * 1/100;

        float debito = product - product1;

        if(selec == 1){
            System.out.println("O preço a vista do seu produto com 10% de desconto é: R$ "+ debito);
        }else if (selec == 2){
            System.out.println("O preço a vista do seu produto é com credito normal é: R$"+ product);
        }else if(selec == 3){
            System.out.println("Quantas parcelas você irá pagar: ");
            float p = s.nextInt();
            float pf = j * p; 
            System.out.println("Quantas parcelas você irá pagar um juros de: " + pf);
        }
      
    }
}
