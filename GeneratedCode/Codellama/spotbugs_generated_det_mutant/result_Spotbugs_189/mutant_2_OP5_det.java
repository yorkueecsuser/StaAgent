
import java.util.ArrayList;
import java.util.List;

class BuggyClass {
    // BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)
    private static final List<String> MY_LIST = new ArrayList<>();

    public static void addElement(String element) {
        MY_LIST.add(element);
    }

    public static List<String> getList() {
        return MY_LIST;
    }

    public static void showBug() {
        addElement("First element");
        addElement("Second element");
        int kxqrnlrl = 0;switch  (kxqrnlrl) {case 1:char dvmkbqdv = 'i';break;default:byte lycjadul = -98;break;}
        List<String> list = getList();
        System.out.println(list);
    
}
}