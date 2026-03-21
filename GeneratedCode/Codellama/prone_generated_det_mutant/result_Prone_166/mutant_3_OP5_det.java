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
        int njlftqer = 0;switch  (njlftqer) {case 1:byte jlzquvne = 19;break;default:int mhdbroef = 520168285;break;}
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // BUG: TypeParameterQualifier
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    
}
}