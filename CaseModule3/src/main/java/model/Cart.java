package model;

import java.time.LocalDate;

public class Cart {
    private int id;
    private int id_account;
    private LocalDate dateCart;
    private double priceTotal;

    public Cart() {
    }

    public Cart(int id, int id_account, LocalDate dateCart, double priceTotal) {
        this.id = id;
        this.id_account = id_account;
        this.dateCart = dateCart;
        this.priceTotal = priceTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_account() {
        return id_account;
    }

    public void setId_account(int id_account) {
        this.id_account = id_account;
    }

    public LocalDate getDateCart() {
        return dateCart;
    }

    public void setDateCart(LocalDate dateCart) {
        this.dateCart = dateCart;
    }

    public double getPriceTotal() {
        return priceTotal;
    }

    public void setPriceTotal(double priceTotal) {
        this.priceTotal = priceTotal;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", id_account=" + id_account +
                ", dateCart=" + dateCart +
                ", priceTotal=" + priceTotal +
                '}';
    }
}
