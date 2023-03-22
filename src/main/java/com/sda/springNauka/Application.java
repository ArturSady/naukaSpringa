package com.sda.springNauka;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Application {

//private final FileRepository fileRepository = new FileRepository();
    private final Repository repository;

    public Application(@Qualifier("File") Repository repository){
        System.out.println("Utworzenie application");
        System.out.println(repository);
        this.repository = repository;
    }



    public void start(){
        System.out.println("Start programu");
        repository.read();

    }

    public void end(){
        System.out.println("Koniec programu");
        repository.write();

    }
}
