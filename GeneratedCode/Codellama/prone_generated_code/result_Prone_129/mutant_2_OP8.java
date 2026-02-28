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
    }
}

// Mutant code 1 - Renaming variable "names" to "list"
class PackageInfo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");
        
        // BUG: PackageInfo
        for (String name : list) {
            System.out.println(name);
        }
    }
    
    public static void showBug() {
        List<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");
        
        // BUG: PackageInfo
        for (String name : list) {
            System.out.println(name);
        }
    }
}

// Mutant code 2 - Renaming variable "name" to "value"
class PackageInfo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        // BUG: PackageInfo
        for (String value : names) {
            System.out.println(value);
        }
    }
    
    public static void showBug() {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        // BUG: PackageInfo
        for (String value : names) {
            System.out.println(value);
        }
    }
}