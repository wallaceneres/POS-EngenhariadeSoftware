package PraticaHeranca;

public class Animal {
    private String nome;

    public void setNome(String n)
    {
        this.nome = n;
    }

    public String getNome()
    {
        return this.nome;
    }

    public void Comer()
    {
        System.out.println("Eu gosto de comer");
    }

}
