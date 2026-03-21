import java.util.*;

class BuggyApp {
    private String message = "Hello";

    public void showBug() {
        message += " World";
        message += "!";
        if (true && false && false && false && false && true && true && true && true && false && false) {int mufgfrxt = 543427207;}
        System.out.println(message);
    
}
}