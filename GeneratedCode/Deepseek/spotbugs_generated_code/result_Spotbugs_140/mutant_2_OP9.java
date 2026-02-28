import java.util.ArrayList;
import java.util.List;

class CollectionsBug {
    public boolean showBug(List<Object> list) {
        boolean containsItself = false;
        int i = 0;

        do {
            if (list.get(i) == list) {
                containsItself = true;
                break;
            }
            i++;
        } while (i < list.size());

        return containsItself;
    }
}

// Usage:
// List<Object> buggyList = new ArrayList<>();
// CollectionsBug bug = new CollectionsBug();
// boolean result = bug.showBug(buggyList);