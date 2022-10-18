import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n1 = s.nextInt();
        System.out.println("Digite outro numero: ");
        int n2 = s.nextInt();

        if (n1 > n2){
            int n3 = n1+n2;
            System.out.println("Já que o primeiro número é maior que o segundo o resultado deles será uma soma igual a " + n3);
        }else{
            int n3 = n1*n2;
            System.out.println("Já que o segundo número é maior que o primeiro o resultado deles será uma multiplicação igual a " + n3);
        }
    }
}
