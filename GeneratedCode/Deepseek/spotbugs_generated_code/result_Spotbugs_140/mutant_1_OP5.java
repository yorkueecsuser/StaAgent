import java.util.ArrayList;
import java.util.List;

class CollectionsBug {
    public boolean showBug(List<Object> list) {
        if (getCondition()) {
            int value = getValue();
            switch (value) {
                case 1:
                    // Unreachable code
                    System.out.println("This line should never be executed.");
                    break;
            }
        }
        return list.contains(list); // Bug: Collections should not contain themselves
    }

    private boolean getCondition() {
        return false;
    }

    private int getValue() {
        return 0;
    }
}

// Usage:
// List<Object> buggyList = new ArrayList<>();
// CollectionsBug bug = new CollectionsBug();
// boolean result = bug.showBug(buggyList);