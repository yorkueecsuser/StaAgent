import java.util.ArrayList;
import java.util.List;

class NameMatchingBug {
    // bar is data or an action or both?
    List<String> foo;

    // BUG: AvoidFieldNameMatchingMethodName
    void bar() {
        foo = new ArrayList<>();
        foo.add("AvoidFieldNameMatchingMethodName");
    }

    // This method is used to demonstrate the bug
    // BUG: AvoidFieldNameMatchingMethodName
    public List<String> showBug() {
        bar();
        return foo;
    }
}