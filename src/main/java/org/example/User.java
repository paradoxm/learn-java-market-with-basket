package org.example;

public class User {
    private final String login;
    private final String password;
    private final Basket basket;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }

    public Basket getBasket() {
        return basket;
    }

    public String getLogin() {
        return login;
    }
}