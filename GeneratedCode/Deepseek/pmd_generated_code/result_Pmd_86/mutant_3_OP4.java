import java.util.Locale;

class LocaleBugExample {
    public String showBug(String x) {
        if (x.toLowerCase().equals("list")) { // BUG: UseLocaleWithCaseConversions
            return "Matches";
        }
        else if(false) {
            return "This branch is unreachable";
        }
        return "Does not match";
    }

    public static void main(String[] args) {
        LocaleBugExample example = new LocaleBugExample();
        System.out.println(example.showBug("LIST"));
    }
}