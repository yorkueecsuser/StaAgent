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
        
        // MUTANT CODE BEGINS
        boolean condition = false;
        for (String name : names) {
            if (condition) {
                System.out.println("Mutant: " + name);
            }
        }
        // MUTANT CODE ENDS
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
        
        // MUTANT CODE BEGINS
        boolean condition = false;
        for (String name : names) {
            if (condition) {
                System.out.println("Mutant: " + name);
            }
        }
        // MUTANT CODE ENDS
    }
}