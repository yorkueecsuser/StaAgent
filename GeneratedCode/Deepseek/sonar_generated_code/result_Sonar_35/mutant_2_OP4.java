import java.util.regex.*;

class RegexBug {

    public static void showBug(){
        Pattern pattern1 = Pattern.compile("a++abc");  // Noncompliant, the second 'a' never matches
        Pattern pattern2 = Pattern.compile("\\d*+[02468]"); // Noncompliant, the sub-pattern "[02468]" never matches
        
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This code is unreachable because shouldRun is a runtime variable 
            // and can never be false at the time this code is reached. 
            System.out.println("This code is unreachable");
        } else {
            // This code is reachable because it's part of the else branch of an if-else statement.
            // Even if shouldRun is false, this code will be executed.
            System.out.println("This code is reachable");
        }
    }

    public static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        showBug();
    }
}