import java.util.*;

class BuggyApp {
    private String message = "Hello";

    public void showBug() {
        message += " World";
        message += "!";
        if (true && true && true && true && true && true && false && false && true && true && false) {boolean njbytdfj = true;}else{long pbaikaap = -605207219;}
        System.out.println(message);
    
}
}