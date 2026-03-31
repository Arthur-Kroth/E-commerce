package model;

public class Request {

    private int idRequest;
    private double value;
    private int date;
    private int discount;
    private int idCart;
    private int idPaymentInfo;
    
    public Request() {
    }

    public Request(int idRequest, double value, int date, int discount, int idCart, int idPaymentInfo) {
        this.idRequest = idRequest;
        this.value = value;
        this.date = date;
        this.discount = discount;
        this.idCart = idCart;
        this.idPaymentInfo = idPaymentInfo;
    }

    public int getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(int idRequest) {
        this.idRequest = idRequest;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getIdCart() {
        return idCart;
    }

    public void setIdCart(int idCart) {
        this.idCart = idCart;
    }

    public int getIdPaymentInfo() {
        return idPaymentInfo;
    }

    public void setIdPaymentInfo(int idPaymentInfo) {
        this.idPaymentInfo = idPaymentInfo;
    }

    @Override
    public String toString() {
        return "Request [idRequest=" + idRequest + ", value=" + value + ", date=" + date + ", discount=" + discount
                + ", idCart=" + idCart + ", idPaymentInfo=" + idPaymentInfo + "]";
    }
}