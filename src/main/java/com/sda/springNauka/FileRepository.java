package com.sda.springNauka;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("File")
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
