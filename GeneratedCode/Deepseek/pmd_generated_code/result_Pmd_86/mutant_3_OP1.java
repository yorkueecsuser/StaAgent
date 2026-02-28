import java.util.Locale;

class LocaleBugExample {
    public String showBug(String x) {
        String deadStore = ""; // Generated Dead Store
        if (x.toLowerCase().equals("list")) {
            return "Matches";
        }
        return "Does not match";
    }

    public static void main(String[] args) {
        LocaleBugExample example = new LocaleBugExample();
        System.out.println(example.showBug("LIST"));
    }
}