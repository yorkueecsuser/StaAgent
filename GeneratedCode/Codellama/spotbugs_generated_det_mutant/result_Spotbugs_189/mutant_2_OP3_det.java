
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
        if (true && true && false && true && false && true && false && false && false && false && false) {float fcnogkdh = 431166788;}
        addElement("First element");
        addElement("Second element");
        List<String> list = getList();
        System.out.println(list);
    
}
}