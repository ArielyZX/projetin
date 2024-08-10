package projetin;

import java.util.Scanner;

public class Idea {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("oi! qual é o seu nome?");
        String nome = read.nextLine();

        if (nome.equalsIgnoreCase("bryan")) {
            System.out.println("vai se fuder seu lixeira// desculpa bryan");
        } else if (nome.equalsIgnoreCase("bel")) {
            System.out.println("oi coco");
        } else if (nome.equalsIgnoreCase("larissa")) {
            System.out.println("oi larissa :)");
        } else if (nome.equalsIgnoreCase("savio")) {
            System.out.println("nao mancho, é serio. por que que tu nao se joga de uma ponte?");
        } else if (nome.equalsIgnoreCase("daniel") || nome.equalsIgnoreCase("max")) {
            System.out.println("Eu sinto sua falta todos os dias. Espero que você esteja bem.");
        }

        read.close();
    }
}