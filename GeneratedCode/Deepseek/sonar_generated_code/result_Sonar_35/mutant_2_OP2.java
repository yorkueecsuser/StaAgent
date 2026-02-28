import java.util.regex.*;

class RegexBug {

    public static void showBug(){
        Pattern pattern1 = Pattern.compile("a++abc");  // Noncompliant, the second 'a' never matches
        Pattern pattern1_dup = Pattern.compile("a++abc");  // Duplicated mutation
        Pattern pattern2 = Pattern.compile("\\d*+[02468]"); // Noncompliant, the sub-pattern "[02468]" never matches
        Pattern pattern2_dup = Pattern.compile("\\d*+[02468]"); // Duplicated mutation
    }

    public static void main(String[] args) {
        showBug();
    }
}