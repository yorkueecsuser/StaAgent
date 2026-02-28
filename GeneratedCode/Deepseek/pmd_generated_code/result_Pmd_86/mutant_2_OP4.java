import java.util.Locale;

class LocaleBugExample {
    public String showBug(String x) {
        boolean shouldRun = true; // Adding this line
        if (x.toLowerCase().equals("list")) { // BUG: UseLocaleWithCaseConversions
            return "Matches";
        } else {
            return "Does not match"; // Added a reachable branch
        }
    }

    public static void main(String[] args) {
        LocaleBugExample example = new LocaleBugExample();
        System.out.println(example.showBug("LIST"));
    }
}