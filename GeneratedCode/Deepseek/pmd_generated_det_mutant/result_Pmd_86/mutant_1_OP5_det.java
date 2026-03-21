import java.util.Locale;

class LocaleBugExample {
    public String showBug(String x) {
        int swjrgzzk = 0;switch  (swjrgzzk) {case 1:long yonglynh = -480330721;break;default:float zrehsopj = 827311268;break;}
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