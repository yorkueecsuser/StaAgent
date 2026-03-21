import java.util.Locale;

class LocaleBugExample {
    public String showBug(String x) {
        if (false && true && true && false && false && true && false && false && true && true && false) {boolean meekqluo = true;}else{boolean xkgjjoqu = true;}
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