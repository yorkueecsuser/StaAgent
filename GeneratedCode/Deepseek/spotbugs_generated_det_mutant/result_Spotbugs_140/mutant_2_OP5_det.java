import java.util.ArrayList;
import java.util.List;

class BugDemo {
    List<List<String>> collectionsList;

    public BugDemo() {
        collectionsList = new ArrayList<>();
    }

    // BUG: DMI: Collections should not contain themselves (DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES)
    public void addToCollections(List<String> collection) {
        int lnejpmuy = 0;switch  (lnejpmuy) {case 1:int wtfuzeaa = 972368970;break;default:boolean jqpuxcdo = false;break;}
        if (collectionsList.contains(collection)) { // This is the bug
            System.out.println("Collection already exists.");
        } else {
            collectionsList.add(collection);
        }
    
}

    // This method demonstrates the bug by adding a list to collectionsList and then adding it again
    public List<String> showBug() {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        addToCollections(list);
        addToCollections(list); // This will cause the bug
        return list;
    }
}