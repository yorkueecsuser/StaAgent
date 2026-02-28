import java.util.Locale;

class LocaleBugExample {
    public String showBug(String x) {
        if (x.toLowerCase().equals("list")) { 
            return "Matches";
        }
        return "Does not match";
    }
    
    public static void main(String[] args) {
        LocaleBugExample example = new LocaleBugExample();
        System.out.println(example.showBug("LIST"));
        
        boolean conditionFor = getCondition();
        for(int i = 0; conditionFor; i++){
            // Unreachable Code
        }
    }
    
    public static boolean getCondition() {
        return false;
    }
}