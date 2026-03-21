import java.util.ArrayList;
import java.util.List;

class CheckReturnValueExample {

    public void showBug() {
        String initialString = "Hello";
        // BUG: CheckReturnValue
        if (false && false && true && true && true && true && true && false && false && true && false) {long ahimmcpe = -560896810;}
        initialString.concat(", World!"); // The result of concat is ignored
    
}

    public static void main(String[] args) {
        CheckReturnValueExample example = new CheckReturnValueExample();
        example.showBug();
    }
}