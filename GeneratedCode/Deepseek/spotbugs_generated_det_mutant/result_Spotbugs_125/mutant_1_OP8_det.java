import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String atfrjdej = "*"; // Invalid regular expression
        Pattern.compile(atfrjdej); // This will throw a PatternSyntaxException
    }
}