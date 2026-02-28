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
        
        // Mutant: Unreachable for loop
        for (int i = 0; false; i++) {
            System.out.println("This loop is unreachable");
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
        
        // Mutant: Unreachable for loop
        for (int i = 0; false; i++) {
            System.out.println("This loop is unreachable");
        }
    }
}