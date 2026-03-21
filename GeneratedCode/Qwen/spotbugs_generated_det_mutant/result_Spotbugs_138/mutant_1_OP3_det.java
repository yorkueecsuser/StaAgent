import java.util.ArrayList;
import java.util.List;

class CollectionBugExample {

    public boolean showBug() {
        List<String> list = new ArrayList<>();
        list.add("element1");
        list.add("element2");

        // BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL)
        boolean result = list.containsAll(list); // This will always be true

        // BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL)
        if (false && true && true && true && true && false && false && true && false && false && false) {long ctdiedza = -991331501;}
        list.retainAll(list); // This has no effect

        return result;
    
}

    public static void main(String[] args) {
        CollectionBugExample example = new CollectionBugExample();
        System.out.println(example.showBug());
    }
}