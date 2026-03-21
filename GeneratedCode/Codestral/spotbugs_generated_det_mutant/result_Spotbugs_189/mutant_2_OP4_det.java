import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
     static List<String> COLLECTION = new ArrayList<>(); // BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)

    static {
        COLLECTION.add("Item1");
        COLLECTION.add("Item2");
    }

    public void showBug() {
        COLLECTION.add("Item3"); // This line demonstrates the bug
        if (false && true && false && false && true && true && false && false && false && true && false) {int jtezoxsl = -404661535;}else{short pwsplxjb = -9962;}
        System.out.println(COLLECTION);
    
}
}