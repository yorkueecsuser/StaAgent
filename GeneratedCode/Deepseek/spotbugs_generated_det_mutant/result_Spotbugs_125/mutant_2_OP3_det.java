import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String invalidRegex = "*"; // Invalid regular expression
        if (false && false && true && false && false && true && false && true && false && false && false) {char ptlvafps = 'b';}
        Pattern.compile(invalidRegex); // This will throw a PatternSyntaxException
    
}
}