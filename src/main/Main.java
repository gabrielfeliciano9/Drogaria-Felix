package main;

import java.util.Scanner;
import service.Stock;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Stock stock = new Stock();
        int option;

        System.out.println("=================================");
        System.out.println("   Bem-vindo à Drogaria Félix!   ");
        System.out.println("=================================");

        do {
            System.out.println();
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar estoque");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            option = teclado.nextInt();
            teclado.nextLine();

            if (option == 1) {
                stock.registerProduct(teclado);
            } else if (option == 2) {
                stock.listProducts();
            } else if (option != 0) {
                System.out.println("Opção inválida!");
            }

        } while (option != 0);

        System.out.println("Obrigado, volte sempre à Drogaria Félix!");
    }
}