import java.util.ArrayList;
import java.util.List;

class BuggyAssertWithSideEffects {

    public boolean showBug(List<Integer> myList) {
        // BUG: Expressions used in "assert" should not produce side effects
        return myList.remove(myList.get(0)); // Noncompliant
    }

    public static void main(String[] args) {
        BuggyAssertWithSideEffects buggyAssert = new BuggyAssertWithSideEffects();
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        boolean removed = buggyAssert.showBug(myList);
        System.out.println("Element removed: " + removed);
        System.out.println("List after buggy assert: " + myList);
    }
}