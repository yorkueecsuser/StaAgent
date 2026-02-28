import java.util.regex.*;

class RegexBug {

    public static void showBug(){
        Pattern pattern1 = Pattern.compile("a++abc");  // Noncompliant, the second 'a' never matches
        Pattern pattern2 = Pattern.compile("\\d*+[02468]"); // Noncompliant, the sub-pattern "[02468]" never matches

        boolean condition = getCondition();
        if (condition) {
            // Mutated code
            if (false) {
                System.out.println("Mutation operator: Unreachable if-else statement");
            } else {
                System.out.println("Non reachable code");
            }
        }
    }

    // A helper method to return a dynamic condition
    public static boolean getCondition() {
        return true;
    }

    public static void main(String[] args) {
        showBug();
    }
}