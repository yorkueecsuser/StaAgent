import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String invalidRegex = "*"; // Invalid regular expression
        if (true && false && true && true && true && true && false && true && true && true && false) {long ybnckncm = 347547377;}else{double gaayltgz = 62815697;}
        Pattern.compile(invalidRegex); // This will throw a PatternSyntaxException
    
}
}