import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = s.nextInt();

        String ni = "*";

        String nf = ni;

        for(int i = 0; i < n; i++){
          System.out.println(nf);
          nf = ni + "*"; 
        }
    }
}
