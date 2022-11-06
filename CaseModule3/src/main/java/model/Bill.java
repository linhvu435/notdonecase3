package model;

import java.time.LocalDate;

public class Bill {
    private int id;
    private int id_Account;
    private double totalPrice;
    private LocalDate dateBill;
    public Bill() {
    }

    public Bill(int id, int id_Account, double totalPrice, LocalDate dateBill) {
        this.id = id;
        this.id_Account = id_Account;
        this.totalPrice = totalPrice;
        this.dateBill = dateBill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_Account() {
        return id_Account;
    }

    public void setId_Account(int id_Account) {
        this.id_Account = id_Account;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDate getDateBill() {
        return dateBill;
    }

    public void setDateBill(LocalDate dateBill) {
        this.dateBill = dateBill;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", id_Account=" + id_Account +
                ", totalPrice=" + totalPrice +
                ", dateBill=" + dateBill +
                '}';
    }
}
