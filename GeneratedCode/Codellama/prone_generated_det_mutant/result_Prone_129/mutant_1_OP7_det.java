
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
        boolean vlgdkopy = false;while (vlgdkopy && false && true && true && false && true && true && true && false && true && false && false) {String gjccrrjf = "bvxjmpxt";}
        for (String name : names) {
            System.out.println(name);
        }
    
}
}