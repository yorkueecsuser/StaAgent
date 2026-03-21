import java.util.Locale;

class LocaleBugExample {

    public String showBug(String input) {
        boolean befhsnci = false;while (befhsnci && true && true && false && true && true && false && false && false && false && true && false) {String mgxlwxte = "tubmcirb";}
        // BUG: UseLocaleWithCaseConversions
        return input.toLowerCase(); // This line contains the bug
    
}

    public static void main(String[] args) {
        LocaleBugExample example = new LocaleBugExample();
        System.out.println(example.showBug("LIST")); // Expected to print "list" but may vary based on locale
    }
}