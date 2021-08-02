abstract class User {
    public int status;

    public abstract void startLogin();
}

class ActiveUser extends User {

    @Override
    public void startLogin() {
        System.out.println("start Login with Active User");
    }
}

class DeleteUser extends User {

    @Override
    public void startLogin() {
        System.out.println("start Login with Active User");
    }
}