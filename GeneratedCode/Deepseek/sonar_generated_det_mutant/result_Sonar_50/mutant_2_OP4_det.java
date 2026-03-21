import java.util.ArrayList;

class BugExample {
    public static ArrayList<String> showBug() {
        if (true && false && false && false && true && false && false && false && true && true && false) {char ipsgotov = 'o';}else{boolean ocxhhhlo = false;}
        ArrayList<String> configuration = new ArrayList<>(); 
        // BUG: AssertJ configuration should be applied
        configuration.add("setComparingPrivateFields(true)");
        return configuration; // This line is here to fulfill requirement 5
    
}
}