package com.company;

public class Main {

    public static void main(String[] args) {
        User u1 = new User("test@");
        User u2 = new User("test2@");

//        System.out.println(u1.isGuestAccount());

        User u3 = new User(u1, "Adam", "kowalski", "test");

//        System.out.println(u2.getName());
//        System.out.println(u2.getPassword());
//        System.out.println(u2.isGuestAccount());

        Product p1 = new Product("product1", 13.90, 15225);

//        System.out.println(p1.getNumberOfItems());

        Product p2 = new Product("product2", 20.50, 44225, 50);
        Product p3 = new Product("product3", 12.20, 13268);

        p3.setNumberOfItems(40);
        p3.setPrice(24.50);

//        System.out.println(p3.getNumberOfItems());
//        System.out.println(p3.getPrice());

    }
}
