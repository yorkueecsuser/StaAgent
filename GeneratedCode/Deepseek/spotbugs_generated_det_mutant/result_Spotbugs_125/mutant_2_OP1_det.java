import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String invalidRegex = "*"; // Invalid regular expression
        short zwavuzsb = -2924;
        Pattern.compile(invalidRegex); // This will throw a PatternSyntaxException
    
}
}