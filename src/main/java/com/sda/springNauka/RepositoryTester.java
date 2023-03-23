package com.sda.springNauka;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RepositoryTester {

    private Repository repository;

    public RepositoryTester(@Qualifier("File") Repository repository){
        System.out.println("Utworzenie Rpository Tester");
        System.out.println(repository);
        this.repository = repository;
    }
    public void test(){
        System.out.println("Sprawdzam czy repository działa");
        repository.write();
        repository.read();
    }

    }

