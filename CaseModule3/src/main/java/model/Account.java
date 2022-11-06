package model;

import java.time.LocalDate;
import java.util.Date;

public class Account {
    private  int id;
    private  String username;
    private  String password;
    private  String address;
    private LocalDate birthday;
    private String phonenumber;
    private int id_role;

    public Account() {
    }

    public Account(int id, String username, String password, String address, LocalDate birthday, String phonenumber, int id_role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.address = address;
        this.birthday = birthday;
        this.phonenumber = phonenumber;
        this.id_role = id_role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getId_role() {
        return id_role;
    }

    public void setId_role(int id_role) {
        this.id_role = id_role;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", phonenumber='" + phonenumber + '\'' +
                ", id_role=" + id_role +
                '}';
    }
}
