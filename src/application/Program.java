package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Item;
import entities.Product;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Item> cart = new ArrayList<>();
        double total = 0.0;

        //Register Product
        Product p1 = new Product("Arroz", 10.0);
        Product p2 = new Product("Feijão", 8.0);
        Product p3 = new Product("Macarrão", 5.0);
        Product p4 = new Product("Óleo", 12.0);

        //Menu
        System.out.println("Welcome to the Sales System!");
        System.out.println("What do you want?");
        System.out.println("1 - Arroz: R$10,00");
        System.out.println("2 - Feijão: R$8,00");
        System.out.println("3 - Macarrão: R$5,00");
        System.out.println("4 - Óleo: R$12,00");
        System.out.println("0 - Sair");

        //Sale
        int option = -1;
        while (option != 0) {
            System.out.println("Enter the desired option");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    cart.add(new Item(p1));
                    total += p1.getPrice();
                    System.out.println("Product added to cart!");
                    break;
                case 2:
                    cart.add(new Item(p2));
                    total += p2.getPrice();
                    System.out.println("Product added to cart!");
                    break;
                case 3:
                    cart.add(new Item(p3));
                    total += p3.getPrice();
                    System.out.println("Product added to cart!");
                    break;
                case 4:
                    cart.add(new Item(p4));
                    total += p4.getPrice();
                    System.out.println("Product added to cart!");
                    break;
                case 0:
                    System.out.println("Thanks for shopping with us! Total purchase: " + total);
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
                    break;
            }
        }
        sc.close();
    }


}