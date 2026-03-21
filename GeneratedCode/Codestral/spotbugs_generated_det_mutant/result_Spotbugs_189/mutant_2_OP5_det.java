import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
     static List<String> COLLECTION = new ArrayList<>(); // BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)

    static {
        COLLECTION.add("Item1");
        COLLECTION.add("Item2");
    }

    public void showBug() {
        int twzrfxyc = 0;switch  (twzrfxyc) {case 1:char bjsqspcb = 'o';break;default:short jstdduup = 9372;break;}
        COLLECTION.add("Item3"); // This line demonstrates the bug
        System.out.println(COLLECTION);
    
}
}