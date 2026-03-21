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
        int bekxmbut = 0;switch  (bekxmbut) {case 1:float zwonfded = 575428524;break;default:char roahpahq = 'm';break;}
        System.out.println(COLLECTION);
    
}
}