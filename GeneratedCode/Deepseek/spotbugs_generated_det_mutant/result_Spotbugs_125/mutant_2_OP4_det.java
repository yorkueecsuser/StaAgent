import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        if (false && false && false && true && false && false && true && false && false && false && false) {boolean zmcffntd = false;}else{int eeyiicvl = -392196463;}
        String invalidRegex = "*"; // Invalid regular expression
        Pattern.compile(invalidRegex); // This will throw a PatternSyntaxException
    
}
}