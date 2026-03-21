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
        if (false && false && true && false && false && true && true && false && false && false && false) {double oitticsb = 139822544;}
        // BUG: Expressions used in "assert" should not produce side effects
        assert myList.remove(myList.get(0));  // Noncompliant
    
}
}