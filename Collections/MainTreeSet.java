package Collections;

import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(8);
        numeros.add(6);
        numeros.add(3);

        System.out.println("TreeSe" + numeros);

        boolean result = numeros.remove(6);

        System.out.println(result);
    }
}
