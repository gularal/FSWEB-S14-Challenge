package org.example.models;

public class DeluxeBurger extends Hamburger {
    private String cips;
    private String drink;

    public DeluxeBurger() {
        super("Deluxe Burger", "Double", 19.10, "Double Sandwich");
        this.cips = "Curvy";
        this.drink = "Coke";
    }

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("Name: " + super.name);
        System.out.println("Meat: " + super.meat);
        System.out.println("BreadRollType: " + super.breadRollType);
        System.out.println("Cips: " + this.cips);
        System.out.println("Drink: " + this.drink);
        System.out.println("Price: " + super.price);
        System.out.println();
        return super.price;
    }
}