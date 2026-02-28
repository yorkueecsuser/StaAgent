import java.util.ArrayList;
import java.util.List;

class NameMatchingBug {
    List<String> bar;

    void bar() {
        bar = new ArrayList<>();
        bar.add("AvoidFieldNameMatchingMethodName");
    }

    public List<String> showBug() {
        bar();
        for(; false;) {
            System.out.println("Unreachable Loop");
        }
        return bar;
    }
}