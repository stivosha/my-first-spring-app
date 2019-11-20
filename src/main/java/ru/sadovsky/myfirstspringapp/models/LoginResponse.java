package ru.sadovsky.myfirstspringapp.models;

public class LoginResponse {
    private int code;

    public LoginResponse(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
