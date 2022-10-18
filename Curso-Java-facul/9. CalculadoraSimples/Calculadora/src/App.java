import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        float n1 = s.nextFloat();
        System.out.println("Digite o segundo numero: ");
        float n2 = s.nextFloat();
        System.out.println("Qual operação você irá usar? ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int select = s.nextInt();
        float nf;

        if(select == 1){
            nf = n1+n2;
            System.out.println(nf);
        }else if(select == 2){
            nf = n1-n2;
            System.out.println(nf);
        }else if(select == 3){
            nf = n1*n2;
            System.out.println(nf);
        }else if(select == 4){
            nf = n1/n2;
            System.out.println(nf);
        }
    }
}
