package testdouble;

import java.util.Random;

public class GenerateIdService {

    Random random = new Random();

    public void setRandom(Random random) {
        this.random = random;
    }

    public String get(Object name) {
//        Random random = new Random(); //Dependency
        int num = random.nextInt(10);
        String id = "XYZ" + num;
        return id;
    }
}
