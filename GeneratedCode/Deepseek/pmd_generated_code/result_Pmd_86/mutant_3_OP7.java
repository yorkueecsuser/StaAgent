import java.util.Locale;

class LocaleBugExample {
    public String showBug(String x) {
        boolean condition = true;
        if (x.toLowerCase().equals("list")) { // Added mutation on this line
            while (condition) {
                condition = false;
            }
            return "Matches";
        }
        return "Does not match";
    }

    public static void main(String[] args) {
        LocaleBugExample example = new LocaleBugExample();
        System.out.println(example.showBug("LIST"));
    }
}