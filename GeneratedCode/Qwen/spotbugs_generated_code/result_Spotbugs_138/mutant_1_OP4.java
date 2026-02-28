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
        list.retainAll(list); // This has no effect

        // Mutated Code: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block should never execute
            list.add("unreachableElement");
        } else {
            // This block should always execute
            list.add("reachableElement");
        }

        return result;
    }

    private boolean getCondition() {
        // Always returns false to ensure the if block is unreachable
        return false;
    }

    public static void main(String[] args) {
        CollectionBugExample example = new CollectionBugExample();
        System.out.println(example.showBug());
    }
}