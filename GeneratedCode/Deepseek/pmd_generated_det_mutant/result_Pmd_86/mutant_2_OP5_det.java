import java.util.Locale;

class LocaleBugExample {
    public String showBug(String x) {
        int jybndypn = 0;switch  (jybndypn) {case 1:boolean amrifmxd = true;break;default:boolean rgznzxvs = true;break;}
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