import java.util.regex.*;

class InvalidRegexBug {
    public static void showBug() {
        String pattern = "[a-zA-Z0-9\\"; // Original Bug
        String mutantPattern = "[a-zA-Z0-9\\"; // Mutant: Renamed pattern to mutantPattern
        Pattern.compile(mutantPattern);
    }

    public static void main(String[] args) {
        showBug();
    }
}