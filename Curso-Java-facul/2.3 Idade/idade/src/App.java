import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int idadeMaior = 0;
        int idadeMenor = 0;

        for (int i = 0; i < 12; i++){
            System.out.println("Qual a sua idade: ");
            int idade = s.nextInt();
            idadeMenor = idade;
            if(idade > idadeMaior){
                idadeMaior = idade;
            }if(idade < idadeMenor){
                idadeMenor = idade;
            }
    }

    System.out.println("O mais velho tem: " + idadeMaior);
    System.out.println("O mais novo tem: " + idadeMenor);

}
}