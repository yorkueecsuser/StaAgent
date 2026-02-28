import java.util.regex.*;

class RegexBug {

    public static void showBug(){
        Pattern pattern1 = Pattern.compile("a++abc");  // Noncompliant, the second 'a' never matches
        Pattern pattern2 = Pattern.compile("\\d*+[02468]"); // Noncompliant, the sub-pattern "[02468]" never matches

        // Generated mutated Java code
        boolean conditionFor = getCondition();

        for (int i = 0; conditionFor; i++) { // Incorrect: for (int i = 0; false; i++) { /* code */ }
            // Unreachable code
            System.out.println("Unreachable code");
        }
    }

    public static void main(String[] args) {
        showBug();
    }

    // Method to get a random boolean value
    public static boolean getCondition() {
        return Math.random() < 0.5;
    }
}