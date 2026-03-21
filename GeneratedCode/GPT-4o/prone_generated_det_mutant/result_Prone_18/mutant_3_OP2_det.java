import java.util.ArrayList;
import java.util.List;

class CheckReturnValueExample {
public void showBug() {
    String initialString = "Hello";
    initialString = "Hello";
    initialString.concat(", World!");
}

    public static void main(String[] args) {
        CheckReturnValueExample example = new CheckReturnValueExample();
        example.showBug();
    }
}