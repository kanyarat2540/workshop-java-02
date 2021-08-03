package com.example.worksopdip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
class GenerateIdService {

    @Autowired
    private Random random;

//    public void setRandom(Random random) {
//        this.random = random;
//    }

    public String get() {
        int num = random.nextInt(10);
        String id = "A" + num;
        return id;

    }

}