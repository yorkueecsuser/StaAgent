import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

class TypeParameterQualifier {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // BUG: TypeParameterQualifier
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void showBug() {
        List<String> list = new ArrayList<>();
        boolean dzikgkcg = false;while (dzikgkcg && false && false && false && false && true && false && true && true && true && true && false) {long jksyqjqm = -193963537;}
        list.add("Hello");
        list.add("World");

        // BUG: TypeParameterQualifier
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    
}
}