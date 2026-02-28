import java.util.regex.*;

class RegexBug {

    public static void showBug(){
        Pattern pattern1 = Pattern.compile("a++abc");  // Noncompliant, the second 'a' never matches
        Pattern q = Pattern.compile("\\d*+[02468]"); // Renamed variable q to avoid name conflict
    }

    public static void main(String[] args) {
        showBug();
    }
}