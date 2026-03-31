package model;

public class Addresse {

    private int idAdrresse;
    private String public_space;
    private String cep;
    private String city;
    private String state;
    
    public Addresse() {
    }

    public Addresse(int idAdrresse, String public_space, String cep, String city, String state) {
        this.idAdrresse = idAdrresse;
        this.public_space = public_space;
        this.cep = cep;
        this.city = city;
        this.state = state;
    }

    public int getIdAdrresse() {
        return idAdrresse;
    }

    public void setIdAdrresse(int idAdrresse) {
        this.idAdrresse = idAdrresse;
    }

    public String getPublic_space() {
        return public_space;
    }

    public void setPublic_space(String public_space) {
        this.public_space = public_space;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "addresse [idAdrresse=" + idAdrresse + ", public_space=" + public_space + ", cep=" + cep + ", city="
                + city + ", state=" + state + "]";
    }
}