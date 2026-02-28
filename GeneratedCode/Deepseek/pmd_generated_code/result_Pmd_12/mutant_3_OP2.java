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

    // Duplication Mutant
    // Mutant code being added 
    // bar = new ArrayList<>();
    void barMutant() {
        bar = new ArrayList<>();
        bar = new ArrayList<>();
    }

    // This method is used to demonstrate the bug
    // Duplication Mutant
    // Mutant code being added 
    // bar = new ArrayList<>();
    public List<String> showBugMutant() {
        barMutant();
        return bar;
    }
}