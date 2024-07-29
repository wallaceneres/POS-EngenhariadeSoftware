package PraticaHeranca;

public class Main {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();

        c.setNome("Bidu");

        Gato g = new Gato();

        c.setNome("Lola");

        c.mostrar();
        g.mostrar();
    }
}
