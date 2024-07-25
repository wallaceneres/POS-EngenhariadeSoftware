import java.util.ArrayList;

public class ArrayListUse {
    public static void main(String[] args) {
        ArrayList<String> estados= new ArrayList<>();

        estados.add("Espirito Santo");
        estados.add("Ceará");
        estados.add("Minas Gerais");
        estados.add("Pernambuco");

        estados.remove("Ceará");

        estados.contains("Amazonas");

        System.out.println(estados);
    }
}
