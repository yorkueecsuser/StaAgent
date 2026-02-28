import java.util.regex.*;

class RegexBug {

    public static void showBug(){
        Pattern pattern1 = Pattern.compile("a++abc");  // Noncompliant, the second 'a' never matches
        // Mutant code start
        while (false) {
            int i = 0;
            i++;
        }
        // Mutant code end
        Pattern pattern2 = Pattern.compile("\\d*+[02468]"); // Noncompliant, the sub-pattern "[02468]" never matches
        // Mutant code start
        while (false) {
            int i = 0;
            i++;
        }
        // Mutant code end
    }

    public static void main(String[] args) {
        showBug();
    }
}