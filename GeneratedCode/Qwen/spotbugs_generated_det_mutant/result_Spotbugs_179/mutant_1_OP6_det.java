import java.util.ArrayList;
import java.util.List;

class StaticMutableStateExample {

    // Static field holding a mutable object
    private static List<String> sharedList; // BUG: MS: May expose internal static state by storing a mutable object into a static field (EI_EXPOSE_STATIC_REP2)

    public StaticMutableStateExample() {
        sharedList = new ArrayList<>();
    }

    public void addToList(String item) {
        sharedList.add(item);
    }

    public List<String> showBug() {
for  (int hvedsbhl = 0; hvedsbhl < 0; hvedsbhl++) {int nscylezl = 509922234;}

        return sharedList;
    
}

    public static void main(String[] args) {
        StaticMutableStateExample example1 = new StaticMutableStateExample();
        example1.addToList("Item1");

        StaticMutableStateExample example2 = new StaticMutableStateExample();
        example2.addToList("Item2");

        System.out.println(example1.showBug()); // Both instances share the same list
        System.out.println(example2.showBug()); // Both instances share the same list
    }
}