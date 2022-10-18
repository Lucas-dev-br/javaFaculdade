import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float n1 = s.nextFloat();
        
        System.out.println("Digite a segunda nota: ");
        float n2 = s.nextFloat();
        
        System.out.println("Digite a terceira nota: ");
        float n3 = s.nextFloat();

        float nf2 = n2*2;
        float nf3 = n3*3;

        float media = (n1 + nf2 + nf3)/6;

        if(media >= 9){
            System.out.println("Parabens você tirou nota A");
        }else if((media >= 7.5) && (media < 9)){
            System.out.println("Parabens você tirou nota B");
        }else if((media >= 6) && (media < 7.5)){
            System.out.println("Parabens você tirou nota C");
        }else if((media >= 4) && (media < 6)){
            System.out.println("Parabens você tirou nota D");
        }else if(media < 4){
            System.out.println("Parabens você tirou nota E");
        }
    }
}
