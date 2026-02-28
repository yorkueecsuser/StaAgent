import java.util.Locale;

class LocaleBugExample {

    public String showBug(String input) {
        // BUG: UseLocaleWithCaseConversions
        return input.toLowerCase(); // This line contains the bug

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This will never be printed");
        }
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        LocaleBugExample example = new LocaleBugExample();
        System.out.println(example.showBug("LIST")); // Expected to print "list" but may vary based on locale
    }
}