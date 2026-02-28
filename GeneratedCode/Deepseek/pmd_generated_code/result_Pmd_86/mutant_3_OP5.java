import java.util.Locale;

class LocaleBugExample {
    public String showBug(String x) {
        if (x.toLowerCase().equals("list")) { // BUG: UseLocaleWithCaseConversions
            return "Matches";
        }
        return "Does not match";
    }

    public static void main(String[] args) {
        LocaleBugExample example = new LocaleBugExample();
        System.out.println(example.showBug("LIST"));

        // Mutant Code: Unreachable switch statement
        switch("unreachable") {
            case "unreachable":
                System.out.println("This switch statement is completely unreachable due to a false condition.");
                break;
            default:
                break;
        }
    }
}