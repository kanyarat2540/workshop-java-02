package unittest;

public class Hello {
    UserDB userDB;

    public String hi(String name) {
        return "Hello " + name;
    }

    public String workWithDB(int id) {
        //Tight coupling => Loose coupling
        return userDB.getNameById(id);
    }
}

class UserDB { // Connect to DB
    public String getNameById(int id) {
        //Unstable with dependency
        throw new RuntimeException("Id=2 not found");
    }
}
