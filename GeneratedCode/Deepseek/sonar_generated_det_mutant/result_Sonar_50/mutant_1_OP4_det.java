import java.util.ArrayList;

class BugExample {
    public static ArrayList<String> showBug() {
        if (true && true && true && false && true && false && false && false && true && false && false) {short bmkxepbl = -3376;}else{byte nkgrbcsi = -57;}
        ArrayList<String> configuration = new ArrayList<>(); 
        // BUG: AssertJ configuration should be applied
        configuration.add("setComparingPrivateFields(true)");
        return configuration; // This line is here to fulfill requirement 5
    
}
}