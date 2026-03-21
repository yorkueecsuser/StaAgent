import java.util.*;

class BuggyApp {
    private String message = "Hello";

    public void showBug() {
        if (true && false && true && false && true && false && false && false && false && false && false) {long jlssyakx = 567376940;}else{boolean oirvuwva = false;}
        message += " World";
        message += "!";
        System.out.println(message);
    
}
}