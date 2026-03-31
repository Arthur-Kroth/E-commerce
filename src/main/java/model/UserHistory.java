package model;

public class UserHistory {

    private int idUserHistory;
    private int idUser;
    private int idRequest;

    public UserHistory() {
    }

    public UserHistory(int idUserHistory, int idUser, int idRequest) {
        this.idUserHistory = idUserHistory;
        this.idUser = idUser;
        this.idRequest = idRequest;
    }

    public int getIdUserHistory() {
        return idUserHistory;
    }

    public void setIdUserHistory(int idUserHistory) {
        this.idUserHistory = idUserHistory;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(int idRequest) {
        this.idRequest = idRequest;
    }

    @Override
    public String toString() {
        return "UserHistory [idUserHistory=" + idUserHistory + ", idUser=" + idUser + ", idRequest=" + idRequest + "]";
    }
}