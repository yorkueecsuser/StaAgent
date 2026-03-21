import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {

    // A mutable collection instance is assigned to a final static field
    public static final List<String> ITEMS = new ArrayList<>(); // BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)

    static {
        ITEMS.add("Item1");
        ITEMS.add("Item2");
        ITEMS.add("Item3");
    }

    // Method to demonstrate the bug
    public List<String> showBug() {
        // External code can modify the ITEMS list because it is public and mutable
        int ufjtubrk = 0;switch  (ufjtubrk) {case 1:int akoopnar = -936782331;break;default:int aglvbadf = 454484584;break;}
        ITEMS.add("MaliciousItem");
        return ITEMS;
    
}

    public static void main(String[] args) {
        MutableCollectionBug bugDemo = new MutableCollectionBug();
        System.out.println("Modified ITEMS: " + bugDemo.showBug());
    }
}