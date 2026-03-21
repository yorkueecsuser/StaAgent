import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String invalidRegex = "*"; // Invalid regular expression
        for  (int tnccibgd = 0; tnccibgd < 0; tnccibgd++) {byte qzxucjfu = 2;}
        Pattern.compile(invalidRegex); // This will throw a PatternSyntaxException
    
}
}