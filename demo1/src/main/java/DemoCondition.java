public class DemoCondition {
    public static void main(String[] args) {
        LogingService logingService = new LogingService();
        User activeUser = new ActiveUser();
        User deleteUser = new DeleteUser();
        logingService.login(activeUser);
        logingService.login(deleteUser);
    }
}

class LogingService {
    public void login(User user) {
        user.startLogin();
    }
}


