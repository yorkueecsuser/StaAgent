import java.util.Locale;

class LocaleBugExample {
    public String showBug(String x) {
        String y = "list";
        boolean condition = false;
        switch(y) {
            case "LIST":
                condition = true;
                break;
        }
        if (condition) { // Unreachable switch statement
            return "Matches";
        }
        return "Does not match";
    }

    public static void main(String[] args) {
        LocaleBugExample example = new LocaleBugExample();
        System.out.println(example.showBug("LIST"));
    }
}