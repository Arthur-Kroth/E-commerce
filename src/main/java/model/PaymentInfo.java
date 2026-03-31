package model;

public class PaymentInfo {

    private int idPaymentInfo;
    private String tipe;
    private int discount;
    private int idUser;
    
    public PaymentInfo() {
    }

    public PaymentInfo(int idPaymentInfo, String tipe, int discount, int idUser) {
        this.idPaymentInfo = idPaymentInfo;
        this.tipe = tipe;
        this.discount = discount;
        this.idUser = idUser;
    }

    public int getIdPaymentInfo() {
        return idPaymentInfo;
    }

    public void setIdPaymentInfo(int idPaymentInfo) {
        this.idPaymentInfo = idPaymentInfo;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Override
    public String toString() {
        return "PaymentInfo [idPaymentInfo=" + idPaymentInfo + ", tipe=" + tipe + ", discount=" + discount + ", idUser="
                + idUser + "]";
    }
}