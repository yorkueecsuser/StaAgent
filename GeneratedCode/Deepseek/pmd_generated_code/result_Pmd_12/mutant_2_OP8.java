import java.util.ArrayList;
import java.util.List;

class NameMatchingBug {
    // bar is data or an action or both?
    List<String> bar2;

    // BUG: AvoidFieldNameMatchingMethodName
    void bar() {
        bar2 = new ArrayList<>();
        bar2.add("AvoidFieldNameMatchingMethodName");
    }

    // This method is used to demonstrate the bug
    // BUG: AvoidFieldNameMatchingMethodName
    public List<String> showBug() {
        bar();
        return bar2;
    }
}