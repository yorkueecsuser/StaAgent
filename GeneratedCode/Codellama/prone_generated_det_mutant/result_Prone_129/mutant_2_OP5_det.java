
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
        
        int ylavedyy = 0;switch  (ylavedyy) {case 1:char nkquxmfd = 'k';break;default:boolean ucpjlsss = true;break;}
        // BUG: PackageInfo
        for (String name : names) {
            System.out.println(name);
        }
    
}
}