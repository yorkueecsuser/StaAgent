import java.util.Locale;

class LocaleBugExample {
    public String showBug(String x) {
        if (x.toLowerCase().equals("list")) { 
            return "Matches";
        }
        return "Does not match";
    }
   
    public String showMutant(String x) {
        boolean condition = false;
        if (condition) {
            if (x.toLowerCase().equals("list")) { 
                return "Matches";
            }
        }
        return "Does not match";
    }
    
    public static void main(String[] args) {
        LocaleBugExample example = new LocaleBugExample();
        System.out.println(example.showMutant("LIST"));
    }
}