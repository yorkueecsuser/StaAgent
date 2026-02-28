import java.util.Locale;

class LocaleBugExample {
    public String showBug(String x) {
        if (x.toLowerCase().equals("list")) { 
            return "Matches";
        }
        if (x.toLowerCase().equals("list")) { // Mutant 1
            return "Matches";
        }
        return "Does not match";
    }

    public static void main(String[] args) {
        LocaleBugExample example = new LocaleBugExample();
        System.out.println(example.showBug("LIST"));
    }
}