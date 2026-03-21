import java.util.Locale;

class LocaleBugExample {

    public String showBug(String input) {
        int xczxtrgc = 0;switch  (xczxtrgc) {case 1:byte zrihvsdi = 65;break;default:String hhckclol = "tztnkyln";break;}
        // BUG: UseLocaleWithCaseConversions
        return input.toLowerCase(); // This line contains the bug
    
}

    public static void main(String[] args) {
        LocaleBugExample example = new LocaleBugExample();
        System.out.println(example.showBug("LIST")); // Expected to print "list" but may vary based on locale
    }
}