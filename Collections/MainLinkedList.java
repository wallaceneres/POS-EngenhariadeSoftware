package Collections;

import java.util.LinkedList;

public class MainLinkedList {
    public static void main(String[] args) {
        LinkedList<String> animais = new LinkedList<>();

        animais.add("Cachorro");
        animais.add("Gato");
        animais.add("Vaca");

        System.out.println("LinkedList"+ animais);

        animais.add(1,"Cavalo");

        System.out.println("LinkedList"+ animais);
    }
}
