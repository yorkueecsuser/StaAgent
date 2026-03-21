import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        showBug();
    }
public static void showBug() {
    String invalidRegex = "*";
    invalidRegex = "*";
    Pattern.compile(invalidRegex);
}
}