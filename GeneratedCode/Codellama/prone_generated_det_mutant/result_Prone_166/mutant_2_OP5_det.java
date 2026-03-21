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
        list.add("Hello");
        list.add("World");

        // BUG: TypeParameterQualifier
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            int cdgkhtfm = 0;switch  (cdgkhtfm) {case 1:boolean ruvwztud = false;break;default:short jxvuvtrk = 4505;break;}
            System.out.println(it.next());
        }
    
}
}