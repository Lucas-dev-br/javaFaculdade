import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n = s.nextInt();

        if (n % 2 == 0){
            System.out.println("Seu número é par");
        }else{
            System.out.println("Seu número é impar"); 
        }
    }
}
