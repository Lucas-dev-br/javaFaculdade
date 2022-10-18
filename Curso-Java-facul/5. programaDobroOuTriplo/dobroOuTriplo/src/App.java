import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Diga um número: ");
        int n = s.nextInt();

        if(n > 0){
            int n2 = n*2;
            System.out.println("O numero é positivo logo logo o seu dobro é "+n2);
        }else{
            int n2 = n*3;
            System.out.println("O numero é positivo logo logo o seu Triplo é "+n2);
        }
    }
}
