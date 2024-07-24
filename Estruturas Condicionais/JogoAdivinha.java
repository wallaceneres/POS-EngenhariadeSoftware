import java.util.Scanner;
import java.util.Random;

public class JogoAdivinha {
    public static void main(String[] args)
    {
        Random gerador = new Random();
        int x = gerador.nextInt(100);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Advinhe o número que estou pensando");
        int numero = entrada.nextInt();

        entrada.close();

        if(numero == x)
        {
            System.out.println("Parabéns, você acertou, eu pensei no " + x);
        }else{
            System.out.println("Você errou, eu pensei no no " + x);
        }
    }
}
