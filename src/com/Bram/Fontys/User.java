package com.Bram.Fontys;

import java.util.Objects;

public class User {


    private String userName;
    private String famName;
    private int userId;
    private int money;

    public User(String userName, String famName, int userId, int money)  {
        this.userName = userName;
        this.famName = famName;
        this.userId = userId;
        this.money = money;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFamName() {
        return famName;
    }

    public void setFamName(String famName) {
        this.famName = famName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId && money == user.money && Objects.equals(userName, user.userName) && Objects.equals(famName, user.famName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, famName, userId, money);
    }
}
