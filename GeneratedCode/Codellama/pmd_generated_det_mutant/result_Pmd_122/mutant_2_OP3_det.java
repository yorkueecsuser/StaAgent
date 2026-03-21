import java.util.*;

class BuggyApp {
    private String message = "Hello";

    public void showBug() {
        if (true && false && false && false && true && true && false && true && false && false && false) {boolean wdfgtdmz = false;}
        message += " World";
        message += "!";
        System.out.println(message);
    
}
}