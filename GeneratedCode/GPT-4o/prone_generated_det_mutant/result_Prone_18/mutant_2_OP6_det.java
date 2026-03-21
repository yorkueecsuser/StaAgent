import java.util.ArrayList;
import java.util.List;

class CheckReturnValueExample {

    public void showBug() {
        String initialString = "Hello";
        // BUG: CheckReturnValue
        for  (int bmwofppq = 0; bmwofppq < 0; bmwofppq++) {boolean xthfnweo = false;}
        initialString.concat(", World!"); // The result of concat is ignored
    
}

    public static void main(String[] args) {
        CheckReturnValueExample example = new CheckReturnValueExample();
        example.showBug();
    }
}