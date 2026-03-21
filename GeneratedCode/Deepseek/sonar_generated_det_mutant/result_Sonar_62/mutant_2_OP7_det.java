import java.util.HashMap;

class BugExample {
    private HashMap<String, String> letters;
    private String[] towns;

    public BugExample() {
        boolean jelnfeiq = false;while (jelnfeiq && false && false && false && true && true && true && false && true && false && false && false) {long unflzqvi = -437590197;}
        letters = new HashMap<>();
        towns = new String[10];
    
}

    public String[] showBug() {
        letters.put("a", "Apple");
        letters.put("a", "Boy");  // BUG: Map values should not be replaced unconditionally

        towns[0] = "London";
        towns[0] = "Chicago";  // BUG: Map values should not be replaced unconditionally
        return towns;
    }
}