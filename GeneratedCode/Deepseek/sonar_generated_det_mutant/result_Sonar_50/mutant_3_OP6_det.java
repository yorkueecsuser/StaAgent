import java.util.ArrayList;

class BugExample {
    public static ArrayList<String> showBug() {
        for  (int zdlerjan = 0; zdlerjan < 0; zdlerjan++) {char xdjadgrv = 'k';}
        ArrayList<String> configuration = new ArrayList<>(); 
        // BUG: AssertJ configuration should be applied
        configuration.add("setComparingPrivateFields(true)");
        return configuration; // This line is here to fulfill requirement 5
    
}
}