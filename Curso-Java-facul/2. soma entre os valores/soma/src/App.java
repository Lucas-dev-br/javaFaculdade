import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n1 = s.nextInt();
        System.out.print("Digite outro numero: ");
        int n2 = s.nextInt();

        int nf = n1 + n2;
        System.out.print("A soma entre os dois numeros é " + nf);
    }
}
