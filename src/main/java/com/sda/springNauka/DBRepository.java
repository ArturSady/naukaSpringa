package com.sda.springNauka;

public class DBRepository implements Repository{

    public void read(){
        System.out.println("Read from DB");
    }
    public void write(){
        System.out.println("Write into DB");
    }
}
