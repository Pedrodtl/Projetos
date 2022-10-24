package dever;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira seu nome:\nInsira sua idade: ");
        p1.exibir(scanner.nextLine(), scanner.nextInt());
    }
}
