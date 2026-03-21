import java.util.Locale;

class LocaleBugExample {

    public String showBug(String input) {
        int zoqmyaqh = 0;switch  (zoqmyaqh) {case 1:short gxcjvsbe = 2568;break;default:float vtymihlw = 692910623;break;}
        // BUG: UseLocaleWithCaseConversions
        return input.toLowerCase(); // This line contains the bug
    
}

    public static void main(String[] args) {
        LocaleBugExample example = new LocaleBugExample();
        System.out.println(example.showBug("LIST")); // Expected to print "list" but may vary based on locale
    }
}