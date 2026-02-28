import java.util.Locale;

class LocaleBugExample {

    public String showBug(String input) {
        // BUG: UseLocaleWithCaseConversions
        return input.toLowerCase(); // This line contains the bug

        // Inserting unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Code that will never execute because shouldRun is always false
            input = input.toUpperCase();
        } else {
            // Alternative code that will also never execute
            input = input.toLowerCase(Locale.ROOT);
        }
    }

    private boolean getCondition() {
        // This method returns false, making the if-else branch unreachable
        return false;
    }

    public static void main(String[] args) {
        LocaleBugExample example = new LocaleBugExample();
        System.out.println(example.showBug("LIST")); // Expected to print "list" but may vary based on locale
    }
}