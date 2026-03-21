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
        if (false && false && false && false && false && false && false && true && false && true && false) {char ghjwfefr = 'x';}else{boolean nzldlkoo = false;}
        System.out.println(COLLECTION);
    
}
}