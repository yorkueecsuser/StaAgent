import java.util.ArrayList;
import java.util.List;

class CollectionBugExample {
public boolean showBug() {
    List < String > list = new ArrayList < >();
    list.add("element1");
    list.add("element2");
    boolean result = list.containsAll(list);
    result = list.containsAll(list);
    list.retainAll(list);
    return result;
}

    public static void main(String[] args) {
        CollectionBugExample example = new CollectionBugExample();
        System.out.println(example.showBug());
    }
}