package com.sda.springNauka;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Application {

//private final FileRepository fileRepository = new FileRepository();
    //@Autowired
    private  Repository repository;
@Autowired
    public Application(@Qualifier("File") Repository repository){
        System.out.println("Utworzenie application");
        System.out.println(repository);
        this.repository = repository;
    }

    public Application(){
        repository = null;
        System.out.println("Utworzenie application bez repository");
    }


@PostConstruct
    public void start(){
        System.out.println("Start programu");
        repository.read();
        end();

    }

    public void end(){
        System.out.println("Koniec programu");
        repository.write();

    }
//@Autowired
    public void setRepository(Repository repository) {
        this.repository = repository;
    }
}
