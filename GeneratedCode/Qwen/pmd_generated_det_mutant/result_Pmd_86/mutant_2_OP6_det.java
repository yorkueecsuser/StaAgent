import java.util.Locale;

class LocaleBugExample {

    public String showBug(String input) {
        for  (int yilrcefn = 0; yilrcefn < 0; yilrcefn++) {int jfwucuiy = -533002259;}
        // BUG: UseLocaleWithCaseConversions
        return input.toLowerCase(); // This line contains the bug
    
}

    public static void main(String[] args) {
        LocaleBugExample example = new LocaleBugExample();
        System.out.println(example.showBug("LIST")); // Expected to print "list" but may vary based on locale
    }
}