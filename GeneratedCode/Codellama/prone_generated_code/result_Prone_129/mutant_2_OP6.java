import java.util.ArrayList;
import java.util.List;

class PackageInfo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        // BUG: PackageInfo
        for (String name : names) {
            System.out.println(name);
        }
        
        // Unreachable for loop
        for (String name : names) {
            if (getCondition()) {
                System.out.println(name);
            }
        }
    }
    
    public static void showBug() {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        // BUG: PackageInfo
        for (String name : names) {
            System.out.println(name);
        }
        
        // Unreachable for loop
        for (String name : names) {
            if (getCondition()) {
                System.out.println(name);
            }
        }
    }
    
    private static boolean getCondition() {
        // implementation of the method that returns a boolean value
        return false;
    }
}