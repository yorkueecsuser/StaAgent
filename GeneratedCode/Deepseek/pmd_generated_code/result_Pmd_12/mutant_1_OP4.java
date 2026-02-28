import java.util.ArrayList;
import java.util.List;

class NameMatchingBug {
    // bar is data or an action or both?
    List<String> bar;

    // BUG: AvoidFieldNameMatchingMethodName
    void bar() {
        bar = new ArrayList<>();
        bar.add("AvoidFieldNameMatchingMethodName");
    }

    // This method is used to demonstrate the bug
    // BUG: AvoidFieldNameMatchingMethodName
    public List<String> showBug() {
        bar();
        return bar;
    }

    // Mutated code
    // Unreachable if-else statement
    void mutatedMethod() {
      if (false) {
        // unreachable branch
        bar = new ArrayList<>();
        bar.add("UnreachableBranch");
      } else {
        bar = new ArrayList<>();
        bar.add("ReachableBranch");
      }
    }
}