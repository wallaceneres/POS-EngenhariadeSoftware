package POO;

public class App {
    public static void Main()
    {
        Cao cachorro = new Cao();
        cachorro.nome = "Bobby";
        cachorro.Anda();

        Cao dog = new Cao("Fox", 3);
        dog.DadosCao();

        Cao newdog = new Cao();
        newdog.setIdade(10);

        if(newdog.VerificarIdade())
        {
            System.out.println("Idoso");
        }else{
            System.out.println("Jovem");
        }

    }
}
