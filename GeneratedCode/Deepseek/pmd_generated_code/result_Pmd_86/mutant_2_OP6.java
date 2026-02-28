import java.util.Locale;

class LocaleBugExample {
    public String showBug(String x) {
        if (x.toLowerCase().equals("list")) { // BUG: UseLocaleWithCaseConversions
            return "Matches";
        }
        // Inserting an unreachable for loop
        for (int i = 0; false; i++) {
            System.out.println("This is an unreachable for loop");
        }
        return "Does not match";
    }

    public static void main(String[] args) {
        LocaleBugExample example = new LocaleBugExample();
        System.out.println(example.showBug("LIST"));
    }
}