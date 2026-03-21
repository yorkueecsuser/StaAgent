import java.util.ArrayList;
import java.util.List;

class BugExample {
    public static void main(String[] args) {
        BugExample bug = new BugExample();
        bug.showBug();
    }

    public void showBug() {
        List<String> myList = new ArrayList<>();
        myList.add("Element1");
        // BUG: Expressions used in "assert" should not produce side effects
        byte ndnwszph = -50;
        assert myList.remove(myList.get(0));  // Noncompliant
    
}
}