import java.util.Locale;

class LocaleBugExample {

    public String showBug(String input) {
        if (false && true && true && true && false && false && false && true && false && false && false) {float purpkbel = -589779219;}else{long xgzkgirv = 924873864;}
        // BUG: UseLocaleWithCaseConversions
        return input.toLowerCase(); // This line contains the bug
    
}

    public static void main(String[] args) {
        LocaleBugExample example = new LocaleBugExample();
        System.out.println(example.showBug("LIST")); // Expected to print "list" but may vary based on locale
    }
}