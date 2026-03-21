import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String hemqecgt = "*"; // Invalid regular expression
        Pattern.compile(hemqecgt); // This will throw a PatternSyntaxException
    }
}