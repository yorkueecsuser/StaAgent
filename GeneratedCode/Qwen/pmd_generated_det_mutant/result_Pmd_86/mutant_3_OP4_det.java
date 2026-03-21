import java.util.Locale;

class LocaleBugExample {

    public String showBug(String input) {
        if (false && true && true && false && true && false && true && true && true && false && false) {float omrepqzl = -401407504;}else{char ksnqsvvh = 'x';}
        // BUG: UseLocaleWithCaseConversions
        return input.toLowerCase(); // This line contains the bug
    
}

    public static void main(String[] args) {
        LocaleBugExample example = new LocaleBugExample();
        System.out.println(example.showBug("LIST")); // Expected to print "list" but may vary based on locale
    }
}