import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("Quantas rodas tem o veiculo?");
        int r = s.nextInt();
        System.out.println("Qual o peso bruto do veiculo em kg?");
        float p = s.nextFloat();
        System.out.println("Quantidade de pessoas que tem no veiculo?");
        int q = s.nextInt();

        if((r == 3) || (r == 2)){
            System.out.println("A categoria do seu veiculo é A");
        }if ((r == 4) && (q <= 8) && (p <= 3500)){
            System.out.println("A categoria do seu veiculo é B");
        } if ((r == 4) && (q <= 8) && (p > 3500) && (p <= 6000)){
            System.out.println("A categoria do seu veiculo é C");
        } if ((r == 4) && (q > 8)){
            System.out.println("A categoria do seu veiculo é D");
        } if ((r == 4) && (p > 6000)){
            System.out.println("A categoria do seu veiculo é E");
        } 
    }
}
