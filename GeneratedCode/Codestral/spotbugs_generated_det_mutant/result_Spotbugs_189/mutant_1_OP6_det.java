import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
     static List<String> COLLECTION = new ArrayList<>(); // BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)

    static {
        COLLECTION.add("Item1");
        COLLECTION.add("Item2");
    }

    public void showBug() {
        for  (int bebiyluh = 0; bebiyluh < 0; bebiyluh++) {int zrzgdfgf = -911588183;}
        COLLECTION.add("Item3"); // This line demonstrates the bug
        System.out.println(COLLECTION);
    
}
}