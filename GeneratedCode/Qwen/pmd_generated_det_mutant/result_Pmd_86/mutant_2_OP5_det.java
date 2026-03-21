import java.util.Locale;

class LocaleBugExample {

    public String showBug(String input) {
        int pnuvedzt = 0;switch  (pnuvedzt) {case 1:float krueksmj = 512603808;break;default:boolean xqjbknby = false;break;}
        // BUG: UseLocaleWithCaseConversions
        return input.toLowerCase(); // This line contains the bug
    
}

    public static void main(String[] args) {
        LocaleBugExample example = new LocaleBugExample();
        System.out.println(example.showBug("LIST")); // Expected to print "list" but may vary based on locale
    }
}