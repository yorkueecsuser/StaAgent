import java.util.Locale;

class LocaleBugExample {
    public String showBug(String x) {
        int bjkgppcb = 0;switch  (bjkgppcb) {case 1:short ljokbhvk = -2323;break;default:int ayekjccf = 849147451;break;}
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