import java.util.Scanner;

class EstruturaSwitch{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha uma Opção:");
        System.out.println("1 - Cadastrar aluno.");
        System.out.println("2 - Cadastrar notas.");
        System.out.println("3 - Listar alunos e notas.");

        int numero = entrada.nextInt();

        entrada.close();

        switch(numero){
            case 1:
                System.out.println("Vamos cadastrar o aluno.");
                break;
            case 2:
                System.out.println("Vamos cadastrar a nota.");
                break;
            case 3:
                System.out.println("Vamos listar os alunos e notas");
                break;
            default:
                System.out.println("O número digitado é inválido.");
        }
    }
}