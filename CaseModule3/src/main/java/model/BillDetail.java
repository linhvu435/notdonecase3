package model;

public class BillDetail {
    private int id_Product;
    private int id_Bill;
    private int amount;
    private double totalPrice;

    public BillDetail() {
    }

    public BillDetail( int id_Product, int id_Bill, int amount, double totalPrice) {
        this.id_Product = id_Product;
        this.id_Bill = id_Bill;
        this.amount = amount;
        this.totalPrice = totalPrice;
    }



    public int getId_Product() {
        return id_Product;
    }

    public void setId_Product(int id_Product) {
        this.id_Product = id_Product;
    }

    public int getId_Bill() {
        return id_Bill;
    }

    public void setId_Bill(int id_Bill) {
        this.id_Bill = id_Bill;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "BillDetail{" +
                ", id_Product=" + id_Product +
                ", id_Bill=" + id_Bill +
                ", amount=" + amount +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
