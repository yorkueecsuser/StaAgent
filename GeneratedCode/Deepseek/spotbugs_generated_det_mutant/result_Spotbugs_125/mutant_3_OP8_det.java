import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String hcwgjhdr = "*"; // Invalid regular expression
        Pattern.compile(hcwgjhdr); // This will throw a PatternSyntaxException
    }
}