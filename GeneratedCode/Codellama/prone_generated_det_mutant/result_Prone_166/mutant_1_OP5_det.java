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
        int smvppgsm = 0;switch  (smvppgsm) {case 1:String oskeinls = "fjickeht";break;default:int hrbjfpzj = 466465864;break;}
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