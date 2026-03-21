import java.util.Locale;

class LocaleBugExample {

    public String showBug(String input) {
        if (false && false && true && false && true && false && true && true && false && false && false) {short ycjmkzpj = 801;}else{byte bqxlovly = 4;}
        // BUG: UseLocaleWithCaseConversions
        return input.toLowerCase(); // This line contains the bug
    
}

    public static void main(String[] args) {
        LocaleBugExample example = new LocaleBugExample();
        System.out.println(example.showBug("LIST")); // Expected to print "list" but may vary based on locale
    }
}