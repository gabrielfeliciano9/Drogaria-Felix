package model;

public class Product {
    public int code;
    public String name;
    public String category;
    public double price;
    public int quantity;
    public boolean requiresPrescription;

    public void display() {
        System.out.println("-------------------------");
        System.out.println("Código: " + code);
        System.out.println("Nome: " + name);
        System.out.println("Categoria: " + category);
        System.out.println("Preço: R$ " + price);
        System.out.println("Quantidade em estoque: " + quantity);
        if (requiresPrescription) {
            System.out.println("Exige receita: Sim");
        } else {
            System.out.println("Exige receita: Não");
        }
    }
}