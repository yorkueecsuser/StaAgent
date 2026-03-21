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
        if (false && true && true && false && false && true && true && false && false && false && false) {float lyoaaizy = 368727941;}else{short iqkcvlwc = 1606;}
        // BUG: Expressions used in "assert" should not produce side effects
        assert myList.remove(myList.get(0));  // Noncompliant
    
}
}