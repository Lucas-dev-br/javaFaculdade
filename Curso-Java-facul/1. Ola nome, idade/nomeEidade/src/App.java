import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual seu nome? ");
        String nome = s.nextLine();
        System.out.println(("Qual sua idade? "));
        int idade = s.nextInt();

        System.out.println("Seu nome é "+ nome + " e sua idade é " + idade);

    }
}
