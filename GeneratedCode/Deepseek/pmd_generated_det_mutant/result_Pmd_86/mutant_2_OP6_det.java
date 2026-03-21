import java.util.Locale;

class LocaleBugExample {
    public String showBug(String x) {
        for  (int xdvphrql = 0; xdvphrql < 0; xdvphrql++) {boolean xsvefxyf = false;}
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