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

// Mutant 1: Renaming variable "names" to "nameList"
class PackageInfo {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Alice");
        nameList.add("Bob");
        nameList.add("Charlie");
        
        // BUG: PackageInfo
        for (String name : nameList) {
            System.out.println(name);
        }
    }
    
    public static void showBug() {
        List<String> nameList = new ArrayList<>();
        nameList.add("Alice");
        nameList.add("Bob");
        nameList.add("Charlie");
        
        // BUG: PackageInfo
        for (String name : nameList) {
            System.out.println(name);
        }
    }
}

// Mutant 2: Renaming variable "name" to "person"
class PackageInfo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        // BUG: PackageInfo
        for (String person : names) {
            System.out.println(person);
        }
    }
    
    public static void showBug() {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        // BUG: PackageInfo
        for (String person : names) {
            System.out.println(person);
        }
    }
}