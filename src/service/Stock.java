package service;

import java.util.Scanner;
import model.Product;

public class Stock {
    public Product[] products = new Product[50];
    public int total = 0;

    public void registerProduct(Scanner teclado) {
        if (total < 50) {
            Product p = new Product();

            System.out.print("Código: ");
            p.code = teclado.nextInt();
            teclado.nextLine();

            System.out.print("Nome: ");
            p.name = teclado.nextLine();

            System.out.println("Categoria:");
            System.out.println("1 - Analgésicos");
            System.out.println("2 - Antibióticos");
            System.out.println("3 - Anti-inflamatórios");
            System.out.println("4 - Vitaminas");
            System.out.println("5 - Higiene");
            System.out.println("6 - Infantil");
            System.out.print("Escolha a categoria: ");
            int categoryOption = teclado.nextInt();

            if (categoryOption == 1) {
                p.category = "Analgésicos";
            } else if (categoryOption == 2) {
                p.category = "Antibióticos";
            } else if (categoryOption == 3) {
                p.category = "Anti-inflamatórios";
            } else if (categoryOption == 4) {
                p.category = "Vitaminas";
            } else if (categoryOption == 5) {
                p.category = "Higiene";
            } else if (categoryOption == 6) {
                p.category = "Infantil";
            } else {
                p.category = "Outros";
            }

            System.out.print("Preço: ");
            p.price = teclado.nextDouble();

            System.out.print("Quantidade: ");
            p.quantity = teclado.nextInt();

            System.out.print("Exige receita? (1 - Sim / 2 - Não): ");
            int answer = teclado.nextInt();
            if (answer == 1) {
                p.requiresPrescription = true;
            } else {
                p.requiresPrescription = false;
            }

            products[total] = p;
            total++;
            System.out.println("Produto cadastrado!");
        } else {
            System.out.println("Estoque cheio, não dá para cadastrar mais.");
        }
    }

    public void listProducts() {
        if (total == 0) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            int i = 0;
            while (i < total) {
                products[i].display();
                i++;
            }
        }
    }
}