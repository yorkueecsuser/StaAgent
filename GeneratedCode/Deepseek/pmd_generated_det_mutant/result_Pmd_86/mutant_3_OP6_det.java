import java.util.Locale;

class LocaleBugExample {
    public String showBug(String x) {
        for  (int wfxesptq = 0; wfxesptq < 0; wfxesptq++) {double fuzdhrqy = -773219587;}
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