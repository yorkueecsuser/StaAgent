import java.util.Locale;

class LocaleBugExample {

    public String showBug(String input) {
        // BUG: UseLocaleWithCaseConversions
        String a = input.toLowerCase(); // This line contains the bug
        return a;
    }

    public static void main(String[] args) {
        LocaleBugExample example = new LocaleBugExample();
        System.out.println(example.showBug("LIST")); // Expected to print "list" but may vary based on locale
    }
}