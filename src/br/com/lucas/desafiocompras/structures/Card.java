package br.com.lucas.desafiocompras.structures;

import java.util.ArrayList;
import java.util.List;

public class Card {

    private double cardLimit;
    private double balance;
    private List<Product> purchaseList;

    public Card(double limit) {
        this.cardLimit = limit;
        this.balance = limit;
        this.purchaseList = new ArrayList<>();
    }

    public double getCardLimit() {
        return cardLimit;
    }

    public double getBalance() {
        return balance;
    }

    public List<Product> getPurchaseList() {
        return purchaseList;
    }

    public void decreaseLimit(double value) {
        this.cardLimit -= value;
    }

    public boolean launchPurchase(Product p) {
        if (getBalance() > p.getPrice()) {
            this.balance -= p.getPrice();
            this.purchaseList.add(p);
            return true;
        } else {
            return false;
        }
    }
}
