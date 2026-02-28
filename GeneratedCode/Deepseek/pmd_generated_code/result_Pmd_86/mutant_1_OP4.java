import java.util.Locale;

class LocaleBugExample {
    public String showBug(String x) {
        if (x.toLowerCase().equals("list")) { // BUG: UseLocaleWithCaseConversions
            return "Matches";
        }
        return "Does not match";
    }

    public String showBugMutant(String x) {
        boolean shouldRun = false;
        if (shouldRun) { // this is unreachable code
            if (x.toLowerCase().equals("list")) { // BUG: UseLocaleWithCaseConversions
                return "Matches";
            } else {
                return "Does not match";
            }
        }
        return "Mutant Code"; // This code is never reached as the if-statement above is unreachable
    }

    public static void main(String[] args) {
        LocaleBugExample example = new LocaleBugExample();
        System.out.println(example.showBug("LIST"));
        System.out.println(example.showBugMutant("LIST"));
    }
}