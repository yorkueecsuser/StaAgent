import java.util.ArrayList;
import java.util.List;

class CheckReturnValueExample {

    public void showBug() {
        String rrqqxgzd = "Hello";
        // BUG: CheckReturnValue
        rrqqxgzd.concat(", World!"); // The result of concat is ignored
    }

    public static void main(String[] args) {
        CheckReturnValueExample example = new CheckReturnValueExample();
        example.showBug();
    }
}