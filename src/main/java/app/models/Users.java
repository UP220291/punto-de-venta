package main.java.app.models;

public class Users {

    private int id;
    private String nameUser;
    private String passwordUser;
    private String type; // admin - cajero

    public Users() {}
    public Users(int id, String nameUser, String passwordUser, String type) {
        this.id = id;
        this.nameUser = nameUser;
        this.passwordUser = passwordUser;
        this.type = type;
    }
    // Getters
    public int getId() {
        return id;
    }
    public String getNameUser() {
        return nameUser;
    }
    public String getPasswordUser() {
        return passwordUser;
    }
    public String getTipo() {
        return type;
    }
    // Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }
    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }
    public void setType(String type) {
        this.type = type;
    }
}


