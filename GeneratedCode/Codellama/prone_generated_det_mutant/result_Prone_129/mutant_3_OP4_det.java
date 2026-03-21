
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
        
        if (false && true && true && false && true && false && true && true && false && false && false) {short eusfqvgn = 6941;}else{String lpadcljp = "pmuhxlgh";}
        // BUG: PackageInfo
        for (String name : names) {
            System.out.println(name);
        }
    
}
}