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
        // Unreachable for loop mutation
        for (boolean conditionFor = false; conditionFor; ) {
            System.out.println("This is an unreachable for loop");
        }
        return bar;
    }
}