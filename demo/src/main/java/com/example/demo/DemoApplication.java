package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public void test(){
        System.out.println("1111");
    }

    public void test1(){
        System.out.println("1111");
    }

    public void test2(){
        System.out.println("1111");
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
