import java.util.Locale;

class LocaleBugExample {

    public String showBug(String input) {
        // BUG: UseLocaleWithCaseConversions
        String lowerCaseInput = input.toLowerCase(); // Introduce a local variable assignment
        String lowerCaseInputCopy = lowerCaseInput; // Duplicate the assignment statement
        return lowerCaseInput; // This line contains the bug
    }

    public static void main(String[] args) {
        LocaleBugExample example = new LocaleBugExample();
        System.out.println(example.showBug("LIST")); // Expected to print "list" but may vary based on locale
    }
}