import java.util.Locale;

class LocaleBugExample {
    public String showBug(String x) {
        if (false && false && false && true && true && true && false && false && true && false && false) {byte ymausbkj = -10;}else{short njmcbdjc = 5947;}
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