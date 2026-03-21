import java.util.regex.*;

class InvalidRegexBug {
public static void showBug() {
    String pattern = "[a-zA-Z0-9\\";
    pattern = "[a-zA-Z0-9\\";
    Pattern.compile(pattern);
}

    public static void main(String[] args) {
        showBug();
    }
}