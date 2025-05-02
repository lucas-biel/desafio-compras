import br.com.lucas.desafiocompras.structures.Card;
import br.com.lucas.desafiocompras.structures.Product;

import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option = 2;

        System.out.print("Digite o limite do cartão: R$");
        double cardLimit = sc.nextDouble();
        Card card = new Card(cardLimit);

        while (option != 0) {
            System.out.print("\nDigite a descrição do produto: ");
            String itemDescription = sc.next();

            System.out.print("Digite o valor do produto: R$");
            double productPrice = sc.nextDouble();

            Product product = new Product(itemDescription, productPrice);
            boolean purchaseMade = card.launchPurchase(product);

            if (purchaseMade) {
                System.out.println("\nCompra realizada!");
                System.out.print("Digite 0 para sair ou 1 para continuar: ");
                option = sc.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                option = 0;
            }
        }
        sc.close();

        Collections.sort(card.getPurchaseList());

        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("COMPRAS REALIZADAS:");
        card.getPurchaseList().forEach(System.out::println);
        System.out.printf("Saldo do cartão: R$%.2f\n", card.getBalance());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");

    }
}
