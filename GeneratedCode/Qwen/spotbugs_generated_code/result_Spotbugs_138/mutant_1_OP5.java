import java.util.ArrayList;
import java.util.List;

class CollectionBugExample {

    public boolean showBug() {
        List<String> list = new ArrayList<>();
        list.add("element1");
        list.add("element2");

        // BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL) 
        boolean result = list.containsAll(list); // This will always be true

        // BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL) 
        list.retainAll(list); // This has no effect

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // Unreachable code
                list.add("unreachableElement");
                break;
            case 1:
                // This is the reachable code
                break;
        }

        return result;
    }

    private boolean getCondition() {
        // This method always returns false, making the switch condition always evaluate to 1
        return false;
    }

    public static void main(String[] args) {
        CollectionBugExample example = new CollectionBugExample();
        System.out.println(example.showBug());
    }
}