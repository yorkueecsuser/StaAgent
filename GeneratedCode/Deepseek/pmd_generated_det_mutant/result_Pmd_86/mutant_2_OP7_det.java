import java.util.Locale;

class LocaleBugExample {
    public String showBug(String x) {
        boolean hmmatkmc = false;while (hmmatkmc && false && true && false && false && false && true && true && false && true && false && false) {short rtxfbsfs = -9959;}
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