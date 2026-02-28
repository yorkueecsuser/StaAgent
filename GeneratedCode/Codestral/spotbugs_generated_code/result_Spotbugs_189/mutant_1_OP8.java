import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
     static List<String> abc = new ArrayList<>();

    static {
        abc.add("Item1");
        abc.add("Item2");
    }

    public void showBug() {
        abc.add("Item3"); // This line still demonstrates the bug
        System.out.println(abc);
    }
}