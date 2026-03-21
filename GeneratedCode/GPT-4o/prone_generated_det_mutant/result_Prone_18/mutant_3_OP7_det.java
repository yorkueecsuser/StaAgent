import java.util.ArrayList;
import java.util.List;

class CheckReturnValueExample {

    public void showBug() {
        String initialString = "Hello";
        // BUG: CheckReturnValue
        boolean nmdsttff = false;while (nmdsttff && true && false && true && true && false && true && false && false && true && false && false) {boolean xjemfgih = true;}
        initialString.concat(", World!"); // The result of concat is ignored
    
}

    public static void main(String[] args) {
        CheckReturnValueExample example = new CheckReturnValueExample();
        example.showBug();
    }
}