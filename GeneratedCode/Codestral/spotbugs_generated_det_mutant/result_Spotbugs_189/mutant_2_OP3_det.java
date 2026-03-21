import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
     static List<String> COLLECTION = new ArrayList<>(); // BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)

    static {
        COLLECTION.add("Item1");
        COLLECTION.add("Item2");
    }

    public void showBug() {
        if (true && false && true && false && true && true && true && true && false && false && false) {String itiqzvzf = "dtmufflx";}
        COLLECTION.add("Item3"); // This line demonstrates the bug
        System.out.println(COLLECTION);
    
}
}