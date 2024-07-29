package POO;

public class Cao {
    String nome;
    String cor;
    private int idade;
    double peso;

    public Cao()
    {
        cor ="Caramelo";
    }

    public Cao(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

    public void setIdade(int i)
    {
        this.idade = i;
    }

    public int getIdade()
    {
        return this.idade;
    }

    public void Anda()
    {
        System.out.println("Estou andando..." + cor);
    }

    public void DadosCao()
    {
        System.out.println(nome + " " + idade);
    }

    public boolean VerificarIdade()
    {
        if(idade > 10)
        {
            return true;
        }else{
            return false;
        }
    }
}
