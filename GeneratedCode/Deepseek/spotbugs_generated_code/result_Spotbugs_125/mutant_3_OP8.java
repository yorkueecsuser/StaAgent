import java.util.regex.*;

class InvalidRegexBug {
    public static void showBug() {
        String pattern = "[a-zA-Z0-9\\";
        Pattern.compile(pattern);

        // Mutant code: Renaming pattern variable
        String p = "New pattern";
        // This line is intentionally left blank to demonstrate the original bug
    }

    public static void main(String[] args) {
        showBug();
    }
}