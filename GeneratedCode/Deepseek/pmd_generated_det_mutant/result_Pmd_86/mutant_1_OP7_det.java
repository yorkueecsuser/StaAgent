import java.util.Locale;

class LocaleBugExample {
    public String showBug(String x) {
        boolean rbhzhpse = false;while (rbhzhpse && true && true && true && false && false && true && false && false && true && true && false) {double mtlfpgui = 939838413;}
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