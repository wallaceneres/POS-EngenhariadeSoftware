package POO.Sobrescrita;

class Linguagem
{
    public void mostrarInformacao()
    {
        System.out.println("Lingua Portuguesa");
    }
}

class Java extends Linguagem
{
    public void mostrarInformacao()
    {
        System.out.println("Linguagem Java");
    }
}

public class Main {
    public static void main(String[] args) {
        Java j1 = new Java();

        j1.mostrarInformacao();

        Linguagem l1 = new Linguagem();

        l1.mostrarInformacao();
    }
}
