package model;

public class ADM {

    private int idADM;
    private String name;
    private String cpf;
    private String email;
    private String password;
    private String phone;

    public ADM() {
    }

    public ADM(int idADM, String name, String cpf, String email, String password, String phone) {
        this.idADM = idADM;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    public int getIdADM() {
        return idADM;
    }

    public void setIdADM(int idADM) {
        this.idADM = idADM;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "ADM [idADM=" + idADM + ", name=" + name + ", cpf=" + cpf + ", email=" + email + ", password=" + password
                + ", phone=" + phone + "]";
    }
}