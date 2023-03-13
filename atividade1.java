import java.util.Scanner;

public class atividade1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.println("Informe o valor do número:");
        numero = input.nextInt();

        if (numero < 0)
        {  System.out.print("O número é negativo \n");
        } else if (numero > 0) {
            System.out.print("o número é positivo \n");
        } else if (numero == 0) {
            System.out.print("o número é zero \n");
        }
        
    }

}