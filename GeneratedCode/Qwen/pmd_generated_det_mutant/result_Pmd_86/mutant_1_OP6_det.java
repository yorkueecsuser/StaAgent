import java.util.Locale;

class LocaleBugExample {

    public String showBug(String input) {
        for  (int yctaxoyr = 0; yctaxoyr < 0; yctaxoyr++) {byte beleoaqf = -50;}
        // BUG: UseLocaleWithCaseConversions
        return input.toLowerCase(); // This line contains the bug
    
}

    public static void main(String[] args) {
        LocaleBugExample example = new LocaleBugExample();
        System.out.println(example.showBug("LIST")); // Expected to print "list" but may vary based on locale
    }
}