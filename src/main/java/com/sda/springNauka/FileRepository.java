package com.sda.springNauka;

public class FileRepository implements Repository {

    public void read(){
        System.out.println("Read from file");
    }
    public void write(){
        System.out.println("Write into file");
    }

}
