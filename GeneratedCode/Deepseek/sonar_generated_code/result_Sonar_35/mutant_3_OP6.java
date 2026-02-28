import java.util.regex.*;

class RegexBug {

    private static boolean neverReach() {
        return false;
    }

    public static void showBug(){
        Pattern pattern1 = Pattern.compile("a++abc");  // Noncompliant, the second 'a' never matches
        Pattern pattern2 = Pattern.compile("\\d*+[02468]"); // Noncompliant, the sub-pattern "[02468]" never matches

        // Added unreachable for loop with compile-time constant false
        for (int i = 0; false; i++) {
            // dummy code
            if (i > 10) break;
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}