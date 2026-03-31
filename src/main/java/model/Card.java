package model;

public class Card {

    private int idCard;
    private int card_number;
    private char validity;
    private char cvv;
    private int idUser;
    
    public Card() {
    }

    public Card(int idCard, int card_number, char validity, char cvv, int idUser) {
        this.idCard = idCard;
        this.card_number = card_number;
        this.validity = validity;
        this.cvv = cvv;
        this.idUser = idUser;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getCard_number() {
        return card_number;
    }

    public void setCard_number(int card_number) {
        this.card_number = card_number;
    }

    public char getValidity() {
        return validity;
    }

    public void setValidity(char validity) {
        this.validity = validity;
    }

    public char getCvv() {
        return cvv;
    }

    public void setCvv(char cvv) {
        this.cvv = cvv;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Override
    public String toString() {
        return "Card [idCard=" + idCard + ", card_number=" + card_number + ", validity=" + validity + ", cvv=" + cvv
                + ", idUser=" + idUser + "]";
    }
}