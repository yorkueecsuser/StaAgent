import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        if (true && true && false && false && false && false && false && true && false && true && false) {byte dtwtpwax = 112;}
        String invalidRegex = "*"; // Invalid regular expression
        Pattern.compile(invalidRegex); // This will throw a PatternSyntaxException
    
}
}