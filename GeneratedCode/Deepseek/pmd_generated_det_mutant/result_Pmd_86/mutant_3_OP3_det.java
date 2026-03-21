import java.util.Locale;

class LocaleBugExample {
    public String showBug(String x) {
        if (true && false && true && false && false && false && true && true && false && false && false) {byte photkgix = 29;}
        if (x.toLowerCase().equals("list")) { // BUG: UseLocaleWithCaseConversions
            return "Matches";
        }
        return "Does not match";
    
}

    public static void main(String[] args) {
        LocaleBugExample example = new LocaleBugExample();
        System.out.println(example.showBug("LIST"));
    }
}