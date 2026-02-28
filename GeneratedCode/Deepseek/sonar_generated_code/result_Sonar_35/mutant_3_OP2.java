import java.util.regex.*;

class RegexBug {

    public static void showBug(){
        Pattern pattern1 = Pattern.compile("a++abc");  // Noncompliant, the second 'a' never matches
        Pattern pattern2 = Pattern.compile("\\d*+[02468]"); // Noncompliant, the sub-pattern "[02468]" never matches
        Pattern pattern1Duplicated = Pattern.compile("a++abc");  // Duplicated pattern1
        Pattern pattern2Duplicated = Pattern.compile("\\d*+[02468]"); // Duplicated pattern2
    }

    public static void main(String[] args) {
        showBug();
    }
}