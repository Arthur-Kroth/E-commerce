package model;

public class User {

    private int idUser;
    private String name;
    private String cpf;
    private String email;
    private String password;
    private String fone;
    private char date_burth;
    private int idAddresse;
    
    public User(int idUser, String name, String cpf, String email, String password, String fone, char date_burth,
            int idAddresse) {
        this.idUser = idUser;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
        this.fone = fone;
        this.date_burth = date_burth;
        this.idAddresse = idAddresse;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public char getDate_burth() {
        return date_burth;
    }

    public void setDate_burth(char date_burth) {
        this.date_burth = date_burth;
    }

    public int getIdAddresse() {
        return idAddresse;
    }

    public void setIdAddresse(int idAddresse) {
        this.idAddresse = idAddresse;
    }

    @Override
    public String toString() {
        return "User [idUser=" + idUser + ", name=" + name + ", cpf=" + cpf + ", email=" + email + ", password="
                + password + ", fone=" + fone + ", date_burth=" + date_burth + ", idAddresse=" + idAddresse + "]";
    } 
}