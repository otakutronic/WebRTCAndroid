package com.sergiopaniegoblanco.webrtcexampleapp;

//  _________________________________
// | User                            |
// |---------------------------------|
// | + getGasAmount(): Liters        |
// | + setGasAmount(liters: Liters)  |
// |_________________________________|

public class User {

    public String mUserName;
    public String mPrivateKey;

    public User(String username, String privateKey){
        mUserName = username;
        mPrivateKey = privateKey;
    }

    public User(){

    }
}
