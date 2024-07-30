package POO.Sobrecarga;

class Desenho 
{
    public void mostrar()
    {
        for(int i=0; i<10; i++)
        {
            System.out.println("*");
        }
    }

    public void mostrar(char simb)
    {
        for(int i=0; i<10; i++)
        {
            System.out.println(simb);
        }
    }

    public void mostrar(char simb, int n)
    {
        for(int i=0; i<n; i++)
        {
            System.out.println(simb);
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Desenho d = new Desenho();

        d.mostrar();

        d.mostrar('$');

        d.mostrar('%',50);
    }
}
