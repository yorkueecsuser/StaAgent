import java.util.ArrayList;
import java.util.List;

class SideEffectInAssert {

    public boolean showBug(List<String> myList) {
        // This line demonstrates the bug where the expression in the assert statement causes a side effect.
        assert myList.remove(myList.get(0));  // BUG: Expressions used in "assert" should not produce side effects
        return myList.isEmpty();
    }

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Element1");
        myList.add("Element2");

        SideEffectInAssert demo = new SideEffectInAssert();
        boolean result = demo.showBug(myList);
        System.out.println("Is list empty after showBug method? " + result);
    }
}