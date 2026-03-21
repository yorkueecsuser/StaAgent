import java.util.Locale;

class LocaleBugExample {
    public String showBug(String x) {
        for  (int vbmvzxgm = 0; vbmvzxgm < 0; vbmvzxgm++) {short gdwfqjup = 6262;}
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