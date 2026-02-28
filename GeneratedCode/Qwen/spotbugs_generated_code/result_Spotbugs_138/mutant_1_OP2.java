import java.util.ArrayList;
import java.util.List;

class CollectionBugExample {

    public boolean showBug() {
        List<String> list = new ArrayList<>();
        list.add("element1");
        list.add("element2");

        // BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL) 
        boolean result = list.containsAll(list); // This will always be true
        boolean resultCopy = result; // Duplicate of the assignment statement

        // BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL) 
        list.retainAll(list); // This has no effect
        List<String> listCopy = list; // Duplicate of the assignment statement

        return result;
    }

    public static void main(String[] args) {
        CollectionBugExample example = new CollectionBugExample();
        System.out.println(example.showBug());
    }
}