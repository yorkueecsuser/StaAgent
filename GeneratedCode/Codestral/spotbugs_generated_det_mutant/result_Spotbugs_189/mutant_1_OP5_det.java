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
        int zqseduwh = 0;switch  (zqseduwh) {case 1:long qjpfyetg = -469458458;break;default:double xddudmgf = -614775816;break;}
        System.out.println(COLLECTION);
    
}
}