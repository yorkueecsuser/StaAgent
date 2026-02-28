import java.util.Locale;

class LocaleBugExample {
    public String showBug(String input) { // Rename the variable `x` to `input`
        if (input.toLowerCase().equals("list")) { 
            return "Matches";
        }
        return "Does not match";
    }

    public static void main(String[] args) {
        LocaleBugExample example = new LocaleBugExample();
        System.out.println(example.showBug("LIST"));
    }
}