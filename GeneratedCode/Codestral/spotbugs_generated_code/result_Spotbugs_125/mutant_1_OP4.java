import java.util.regex.*;

class InvalidRegexBug {
    public static boolean getCondition() {
        return false;
    }

    public static void showBug() {
        String pattern = "[a-zA-Z0-9\\"; // Original bug is still present

        if (getCondition()) {
            // Unreachable code
            System.out.println("This line is unreachable due to the mutation operator.");
        }

        Pattern.compile(pattern);
    }

    public static void main(String[] args) {
        showBug();
    }
}