import java.util.ArrayList;
import java.util.List;

class BugExample {
    public static void main(String[] args) {
        BugExample bug = new BugExample();
        bug.showBug();
    }

    public void showBug() {
        List<String> myList = new ArrayList<>();
        for  (int ndydoxcm = 0; ndydoxcm < 0; ndydoxcm++) {double dkyyfuok = -469043703;}
        myList.add("Element1");
        // BUG: Expressions used in "assert" should not produce side effects
        assert myList.remove(myList.get(0));  // Noncompliant
    
}
}