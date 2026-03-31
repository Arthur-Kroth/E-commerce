package model;

public class Product {

    private int id;
    private String name;
    private double unit_price;
    private int quantity_stock;
    private int quantity_min;
    private int quantity_max;
    private int idCategory;
    
    public Product(int id, String name, double unit_price, int quantity_stock, int quantity_min, int quantity_max,
            int idCategory) {
        this.id = id;
        this.name = name;
        this.unit_price = unit_price;
        this.quantity_stock = quantity_stock;
        this.quantity_min = quantity_min;
        this.quantity_max = quantity_max;
        this.idCategory = idCategory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }

    public int getQuantity_stock() {
        return quantity_stock;
    }

    public void setQuantity_stock(int quantity_stock) {
        this.quantity_stock = quantity_stock;
    }

    public int getQuantity_min() {
        return quantity_min;
    }

    public void setQuantity_min(int quantity_min) {
        this.quantity_min = quantity_min;
    }

    public int getQuantity_max() {
        return quantity_max;
    }

    public void setQuantity_max(int quantity_max) {
        this.quantity_max = quantity_max;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", unit_price=" + unit_price + ", quantity_stock="
                + quantity_stock + ", quantity_min=" + quantity_min + ", quantity_max=" + quantity_max + ", idCategory="
                + idCategory + "]";
    }
}