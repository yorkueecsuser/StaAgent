import java.util.*;

class BuggyApp {
    private String message = "Hello";

    public void showBug() {
        message += " World";
        if (false && false && true && false && true && false && true && false && true && false && false) {double toeisgmz = -900586632;}
        message += "!";
        System.out.println(message);
    
}
}