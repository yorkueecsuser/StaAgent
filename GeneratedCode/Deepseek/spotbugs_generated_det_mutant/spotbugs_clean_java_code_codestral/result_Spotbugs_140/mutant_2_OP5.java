import java.util.ArrayList;
import java.util.List;

class CollectionsBug {
    public boolean showBug(List<Object> list) {
        // Unreachable switch statement mutation
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("This code should never execute");
                break;
        }

        return list.contains(list); // BUG: DMI: Collections should not contain themselves (DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES)
    }

    private int getValue() {
        return 0; // Always returns 0, making the switch statement unreachable
    }
}

// Usage:
// List<Object> buggyList = new ArrayList<>();
// CollectionsBug bug = new CollectionsBug();
// boolean result = bug.showBug(buggyList);