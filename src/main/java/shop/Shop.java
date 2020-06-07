package shop;

import behaviors.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addStock(ISell item){
        this.stock.add(item);
    }

    public void removeStock(ISell item){
        this.stock.remove(item);
    }

    public double calculatePotentialProfit() {
        double potentialProfit = 0;
        for(ISell item : this.stock){
            potentialProfit += item.calculateMarkup();
        }
        return potentialProfit;
    }

}
