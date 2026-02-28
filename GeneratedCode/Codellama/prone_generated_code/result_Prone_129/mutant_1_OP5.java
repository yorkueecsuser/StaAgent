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
        
        // Mutation Operator: Unreachable switch statement
        boolean condition = getCondition();
        switch(condition) {
            case true:
                names.add("Dave");
                break;
            case false:
                names.add("Eve");
                break;
            default:
                names.add("Fred");
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
        
        // Mutation Operator: Unreachable switch statement
        boolean condition = getCondition();
        switch(condition) {
            case true:
                names.add("Dave");
                break;
            case false:
                names.add("Eve");
                break;
            default:
                names.add("Fred");
                break;
        }
    }
    
    public static boolean getCondition() {
        return false;
    }
}