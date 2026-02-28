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
            // Unreachable if-else statement
            if (false) {
                System.out.println("This is unreachable code");
            } else {
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
            // Unreachable if-else statement
            if (false) {
                System.out.println("This is unreachable code");
            } else {
                System.out.println(name);
            }
        }
    }
}