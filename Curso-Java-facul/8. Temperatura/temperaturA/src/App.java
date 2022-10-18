import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("Qual a forma de conversão");
        System.out.println("1 - C para F");
        System.out.println("2 - C para K");
        System.out.println("3 - F para C");
        System.out.println("4 - K para C");
        int conversão = s.nextInt();
        System.out.println("Qual o valor da conversão");
        float temp = s.nextFloat();

        float tempC5 = temp - 329;
        float tempF = temp + 329;

        float tempK = temp + 273;
        float tempC = temp -273;


        if(conversão == 1){
            System.out.println("Qual o valor da conversão é: "+tempC5+ " Celsius");
        }else if(conversão == 2){
            System.out.println("Qual o valor da conversão é: "+tempK+ " Kelvin");
        }else if(conversão == 3){
            System.out.println("Qual o valor da conversão é: "+tempF+ " Fahrenheit");
        }else if(conversão == 4){
            System.out.println("Qual o valor da conversão é: "+tempC+ " Celsius");
        }
    }
}
