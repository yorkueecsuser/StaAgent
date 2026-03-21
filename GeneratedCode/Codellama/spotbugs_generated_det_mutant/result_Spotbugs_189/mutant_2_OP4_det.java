
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
        if (false && false && true && true && false && false && false && true && true && false && false) {float qohjcpoz = 27231311;}else{int equlxpvc = -617415328;}
        List<String> list = getList();
        System.out.println(list);
    
}
}