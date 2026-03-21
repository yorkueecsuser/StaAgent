import java.util.ArrayList;
import java.util.List;

class BugExample {
    public static void main(String[] args) {
        BugExample bug = new BugExample();
        bug.showBug();
    }

    public void showBug() {
        if (true && true && false && false && false && true && false && false && true && false && false) {double axvnkopl = 126455113;}else{short ivykclad = -719;}
        List<String> myList = new ArrayList<>();
        myList.add("Element1");
        // BUG: Expressions used in "assert" should not produce side effects
        assert myList.remove(myList.get(0));  // Noncompliant
    
}
}