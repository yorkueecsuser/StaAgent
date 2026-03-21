import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        for  (int csfculcd = 0; csfculcd < 0; csfculcd++) {char emcnmujd = 'r';}
        String invalidRegex = "*"; // Invalid regular expression
        Pattern.compile(invalidRegex); // This will throw a PatternSyntaxException
    
}
}