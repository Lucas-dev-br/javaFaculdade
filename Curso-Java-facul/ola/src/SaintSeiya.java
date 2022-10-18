import java.util.Calendar;
import java.util.Scanner;

public class SaintSeiya {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Diga seu nome: ");
        String nome = s.nextLine();
       
        System.out.println("digite seu dia de nascimento: " );
          int dia = s.nextInt();
        
        while(dia > 31){
            System.out.println("O dia de nascimento está invalida, porfavor digite outro Dia:");
            dia = s.nextInt();
        }

        System.out.println("Digite o mês do seu nascimento: ");
        int mes = s.nextInt();

        while(mes > 12){
            System.out.println("Mês de nascimento está invalida, porfavor digite outro mês:");
            mes = s.nextInt();
        }

        System.out.println("Digite o ano do seu nascimento: ");
        int ano = s.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = s.nextDouble();
        System.out.println("Digite seu peso: ");
        double peso = s.nextDouble();
       
        
        System.out.println("Diga seu sexo Masculino (M) ou Feminino (F):");
        String sexo = s.next();

        
        while(!sexo.equals("F") && !sexo.equals("M") && !sexo.equals("m") && !sexo.equals("f")){
            System.out.println("O valor inserido não confere, você só pode inserir M ou F, tente novamente: ");
            sexo = s.nextLine();
        } 
           
        
        double imc = (peso / (altura*altura));
        if(sexo == "m"){

        }
               
        if((dia >= 19 && dia <= 30) && (mes == 3) || (dia >= 1 && dia <= 19) && (mes == 4)){
            if(sexo.equals("M")|| sexo.equals("m")){
            System.out.println(nome + " cavaleiro de Áries");
            } else {
                System.out.println( nome + " Amazona de Áries");
            } 
        } else if ((dia >= 20 && dia <= 30) && (mes == 4) || (dia >= 1 && dia <= 20) && (mes == 5)){
            if(sexo.equals("M")|| sexo.equals("m")){
                System.out.println(nome + " cavaleiro de Touro");
                } else {
                    System.out.println( nome + " Amazona de Touro");
                } 
        } else if ((dia >= 21 && dia <= 30) && (mes == 5) || (dia >= 1 && dia <= 21) && (mes == 6)){
            if(sexo.equals("M")|| sexo.equals("m")){
                System.out.println(nome + " cavaleiro de Gêmeos");
                } else {
                    System.out.println( nome + " Amazona de Gêmeos");
                } 
        } else if ((dia >= 22 && dia <= 30) && (mes == 6) || (dia >= 1 && dia <= 22) && (mes == 7)){
            if(sexo.equals("M")|| sexo.equals("m")){
                System.out.println(nome + " cavaleiro de Câncer");
                } else {
                    System.out.println( nome + " Amazona de Câncer");
                } 
        }   else if ((dia >= 23 && dia <= 30) && (mes == 7) || (dia >= 1 && dia <= 22) && (mes == 8)){
            if(sexo.equals("M")|| sexo.equals("m")){
                System.out.println(nome + " cavaleiro de Leão");
                } else {
                    System.out.println( nome + " Amazona de Leão");
                } 
        }   else if ((dia >= 23 && dia <= 30) && (mes == 8) || (dia >= 1 && dia <= 22) && (mes == 9)){
            if(sexo.equals("M")|| sexo.equals("m")){
                System.out.println(nome + " cavaleiro de Virgem");
                } else {
                    System.out.println( nome + " Amazona de Virgem");
                } 
        }   else if ((dia >= 23 && dia <= 30) && (mes == 9) || (dia >= 1 && dia <= 22) && (mes == 10)){
            if(sexo.equals("M")|| sexo.equals("m")){
                System.out.println(nome + " cavaleiro de Libra");
                } else {
                    System.out.println( nome + " Amazona de Libra");
                } 
        }   else if ((dia >= 23 && dia <= 30) && (mes == 10) || (dia >= 1 && dia <= 21) && (mes == 11)){
            if(sexo.equals("M")|| sexo.equals("m")){
                System.out.println(nome + " cavaleiro de Escorpião");
                } else {
                    System.out.println( nome + " Amazona de Escorpião");
                } 
        }    else if ((dia >= 22 && dia <= 30) && (mes == 11) || (dia >= 1 && dia <= 19) && (mes == 12)){
            if(sexo.equals("M")|| sexo.equals("m")){
                System.out.println(nome + " cavaleiro de Capricórnio");
                } else {
                    System.out.println( nome + " Amazona de Capricórnio");
                } 
        }    else if ((dia >= 22 && dia <= 30) && (mes == 11) || (dia >= 1 && dia <= 19) && (mes == 12)){
            if(sexo.equals("M")|| sexo.equals("m")){
                System.out.println(nome + " cavaleiro de Sagitario");
                } else {
                    System.out.println( nome + " Amazona de Sagitario");
                }
        }    else if ((dia >= 20 && dia <= 30) && (mes == 1) || (dia >= 1 && dia <= 18) && (mes == 2)){
            if(sexo.equals("M")|| sexo.equals("m")){
                System.out.println(nome + " cavaleiro de Aquario");
                } else {
                    System.out.println( nome + " Amazona de Aquario");
                }   
        }    else if ((dia >= 19 && dia <= 30) && (mes == 2) || (dia >= 1 && dia <= 20) && (mes == 3)){
            if(sexo.equals("M")|| sexo.equals("m")){
                System.out.println(nome + " cavaleiro de Peixes");
                } else {
                    System.out.println( nome + " Amazona de Peixes");
                }
        }

        if(imc <= 18.5){
            System.out.println("Seu imc está abaixo do normal para se tornar um cavaleiro");
        } else if((imc >= 18.5) && (imc <= 25)){
            System.out.println("Seu imc está normal, parabens você pode se tornar um cavaleiro!");
        } else if(imc > 25){
            System.out.println("Seu imc está acima do normal, perca peso para poder se tornar um cavaleiro!");
        }
        
    }
    
}
