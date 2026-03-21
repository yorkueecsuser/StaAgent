import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String invalidRegex = "*"; // Invalid regular expression
        if (false && false && true && true && true && true && true && true && false && true && false) {float aorddbwz = 737239291;}
        Pattern.compile(invalidRegex); // This will throw a PatternSyntaxException
    
}
}