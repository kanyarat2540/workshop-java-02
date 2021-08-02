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

interface UserDB { // Connect to DB
    public String getNameById(int id)  throws UserNotFoundException;
}
