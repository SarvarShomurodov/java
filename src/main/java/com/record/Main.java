package com.record;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping("api")
public class Main {
    public static void main(String[] args){
        SpringApplication.run(Main.class,args);
    }
    @GetMapping("app")
    public GetResponse app(){


        GetResponse hello = new GetResponse(
                "Hello",
                List.of("Java","Go","Php"),
                new Person("Sarvar",25,30.000)
        );
        return hello;
    }

    record Person(String name,int age,double save){

    }
    record GetResponse(
            String app,
            List<String> favProgramLang,
            Person person
    ){

    }
}
