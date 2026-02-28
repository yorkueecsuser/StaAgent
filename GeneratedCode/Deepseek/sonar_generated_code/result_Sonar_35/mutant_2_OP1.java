import java.util.regex.*;

class RegexBug {

    public static void showBug(){
        Pattern pattern1 = Pattern.compile("a++abc");  // Noncompliant, the second 'a' never matches
        Pattern pattern2 = Pattern.compile("\\d*+[02468]"); // Noncompliant, the sub-pattern "[02468]" never matches
        String deadStore1 = "abcdefgh"; // Mutation generated
        String deadStore2 = "12345678"; // Mutation generated
    }

    public static void main(String[] args) {
        showBug();
    }
}