import java.util.ArrayList;
import java.util.List;

class CollectionsBug {
    public boolean showBug(List<Object> list) {
        int switchValue = getSwitchValue();
        switch (switchValue) {
            case 1:
                System.out.println("This line will never be printed");
                break;
        }
        return list.contains(list); // BUG: DMI: Collections should not contain themselves
    }

    private int getSwitchValue() {
        return -1; // This value is not a valid case for the switch statement
    }
}

// Usage:
// List<Object> buggyList = new ArrayList<>();
// CollectionsBug bug = new CollectionsBug();
// boolean result = bug.showBug(buggyList);