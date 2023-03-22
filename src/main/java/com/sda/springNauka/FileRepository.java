package com.sda.springNauka;

import org.springframework.stereotype.Component;

@Component("File")
public class FileRepository implements Repository {


    public FileRepository() {
        System.out.println("Utworzenie Filerepository");
    }

    public void read(){
        System.out.println("Read from file");
    }
    public void write(){
        System.out.println("Write into file");
    }

}
