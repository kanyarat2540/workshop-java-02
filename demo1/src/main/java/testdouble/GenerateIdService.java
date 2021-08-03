package testdouble;

import java.util.Random;

public class GenerateIdService {
    Random random;
    public String get() {
//        Random random = new Random(); //Dependency
        int num = random.nextInt(10);
        String id = "XYZ" + num;
        return id;
    }
}
