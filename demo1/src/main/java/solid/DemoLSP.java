package solid;

public class DemoLSP {
}

class Base {
    void process1() {
    }

    void process2() {
    }
}

class Child extends Base {
    @Override
    void process1() {
        // TODO
    }

    @Override
    void process2() {
        // Do Nothing
    }
}