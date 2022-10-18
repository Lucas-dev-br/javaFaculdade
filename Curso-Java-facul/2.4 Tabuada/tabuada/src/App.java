import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        int n = s.nextInt();

        for(int i = 1; i < 11; i++){
           int nf = n * i;
           System.out.println("A tabuada de "+ i + "X"+ n + " é igual a: " + nf);
        }

    }
}
