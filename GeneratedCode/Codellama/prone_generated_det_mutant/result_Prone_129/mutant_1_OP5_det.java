
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
        int ucmxitvy = 0;switch  (ucmxitvy) {case 1:double dqlehckp = -119828708;break;default:byte fgapfngp = 34;break;}
        for (String name : names) {
            System.out.println(name);
        }
    
}
}