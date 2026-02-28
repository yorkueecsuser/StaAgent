import java.util.Locale;

class LocaleBugExample {

    public String showBug(String input) {
        // BUG: UseLocaleWithCaseConversions
        return input.toLowerCase(); // This line contains the bug

        // Mutant: Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This is an unreachable statement");
        }
    }

    private boolean getCondition() {
        // This method returns false, making the if statement unreachable
        return false;
    }

    public static void main(String[] args) {
        LocaleBugExample example = new LocaleBugExample();
        System.out.println(example.showBug("LIST")); // Expected to print "list" but may vary based on locale
    }
}