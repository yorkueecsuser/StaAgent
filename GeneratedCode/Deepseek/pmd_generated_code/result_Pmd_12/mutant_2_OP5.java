import java.util.ArrayList;
import java.util.List;

class NameMatchingBug {
    // bar is data or an action or both?
    List<String> bar;

    // BUG: AvoidFieldNameMatchingMethodName
    void bar() {
        bar = new ArrayList<>();
        bar.add("AvoidFieldNameMatchingMethodName");

        int unreachable = 0;
        switch (unreachable) {
            case 0:
                break;
        }
    }

    // This method is used to demonstrate the bug
    // BUG: AvoidFieldNameMatchingMethodName
    public List<String> showBug() {
        bar();
        return bar;
    }
}