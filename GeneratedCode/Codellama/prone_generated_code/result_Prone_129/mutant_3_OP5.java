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
        
        // Unreachable switch statement
        switch (getCondition()) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("World");
                break;
            default:
                System.out.println("Default");
                break;
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
        
        // Unreachable switch statement
        switch (getCondition()) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("World");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
    
    private static boolean getCondition() {
        return false;
    }
}