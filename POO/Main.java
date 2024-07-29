package POO;

public class Main {
    public static void main(String[] args)
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

        Pessoa p = new Pessoa();
        p.nome = "Wallace";
        //p.comissao = 8.4;

        Vendedor v = new Vendedor();
        v.nome = "Aline";
        v.comissao = 9.0;

        Pedido pe = new Pedido();

        Conta cp = new Poupanca();
        
        cp.depositar(732);

        cp.sacar(8);

        cp.getSaldo();

    }
}
