import java.util.regex.*;

class RegexBug {

    public static void showBug(){
        Pattern pattern1 = Pattern.compile("a{2}abc");  // Unreachable switch case statement mutated
        Pattern pattern2 = Pattern.compile("\\d*+[02468]"); // Original
    }

    public static void main(String[] args) {
        showBug();
    }
}