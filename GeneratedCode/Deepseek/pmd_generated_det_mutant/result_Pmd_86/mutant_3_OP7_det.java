import java.util.Locale;

class LocaleBugExample {
    public String showBug(String x) {
        boolean gqjrrjro = false;while (gqjrrjro && true && true && true && true && false && true && false && false && true && false && false) {char pdcynuvo = 'm';}
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