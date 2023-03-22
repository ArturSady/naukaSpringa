package com.sda.springNauka;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component("DB")
public class DBRepository implements Repository{


    public DBRepository(){
        System.out.println("DBRepository");
    }




    public void read(){
        System.out.println("Read from DB");
    }
    public void write(){
        System.out.println("Write into DB");
    }


}
