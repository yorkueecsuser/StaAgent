import java.util.*;

class BuggyApp {
    private String message = "Hello";

    public void showBug() {
        message += " World";
        message += "!";
        System.out.println(message);
    }
}