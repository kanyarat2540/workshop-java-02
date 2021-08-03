package com.example.worksopdip;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
class GenerateIdService {

    private Random random = new Random();

    public void setRandom(Random random) {
        this.random = random;
    }

    public String get() {
        int num = random.nextInt(10);
        String id = "A" + num;
        return id;

    }

}