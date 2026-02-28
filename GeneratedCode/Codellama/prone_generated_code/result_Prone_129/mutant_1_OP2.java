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
        
        // Mutant 1: Duplicate assignment of "names"
        List<String> names_mutant1 = new ArrayList<>();
        names_mutant1.add("Alice");
        names_mutant1.add("Bob");
        names_mutant1.add("Charlie");
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
        
        // Mutant 2: Duplicate assignment of "names"
        List<String> names_mutant2 = new ArrayList<>();
        names_mutant2.add("Alice");
        names_mutant2.add("Bob");
        names_mutant2.add("Charlie");
    }
}