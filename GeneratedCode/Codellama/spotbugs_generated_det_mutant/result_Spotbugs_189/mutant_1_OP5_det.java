
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
        int hcujursp = 0;switch  (hcujursp) {case 1:int kdywxiwn = 192125036;break;default:float qywcqrkk = -674087769;break;}
        addElement("First element");
        addElement("Second element");
        List<String> list = getList();
        System.out.println(list);
    
}
}