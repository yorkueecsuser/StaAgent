import java.util.regex.*;

class RegexBug {

    public static void showBug(){
        Pattern pattern1 = Pattern.compile("a++abc");  // Noncompliant, the second 'a' never matches
        Pattern pattern2 = Pattern.compile("\\d*+[02468]"); // Noncompliant, the sub-pattern "[02468]" never matches

        // Generate a unique mutant by adding an unreachable while loop
        boolean condition = false;
        while (condition) {
            System.out.println("This while loop is unreachable.");
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}